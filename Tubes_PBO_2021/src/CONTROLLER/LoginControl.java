package CONTROLLER;

import DRIVER.KoneksiDB;
import MODEL.UserModel;
import VIEW.AdminHome;
import VIEW.CashierHome;
import VIEW.LoginForm;
import java.sql.*;
import java.sql.BatchUpdateException;

public final class LoginControl {
    private final UserModel model;
    private final LoginForm view;
    
    public LoginControl(UserModel m, LoginForm v) {
        model = m;
        view = v;
        initView();
    }
    
    public void initView() {
        view.setVisible(true);
        view.getUsernameText().setText(model.getUsername());
        view.getPasswordText().setText(model.getPassword());
    }
    
    public void initController() {
        view.getClearButton().addActionListener(e -> clearButtonAction());
        view.getLoginButton().addActionListener(e -> loginButtonAction());
    }
    
   public void clearButtonAction() {
       view.getUsernameText().setText("");
       view.getPasswordText().setText("");
   }
   
   public void loginButtonAction() {
       model.setUsername(view.getUsernameText().getText());
       model.setPassword(view.getPasswordText().getText());
       
       String username = model.getUsername();
       String password = model.getPassword();
       
       try{
           Connection connection;
           connection = KoneksiDB.getKoneksi();
           
           if (model.isAdmin(username, password)) {
               PreparedStatement st;
               st = (PreparedStatement) connection.prepareStatement("Select username, password from admin where username=? and password=?");

               st.setString(1, username);
               st.setString(2, password);
               ResultSet rs = st.executeQuery();
               
               if (rs.next()) {
                    AdminHome home = new AdminHome(model);
                    home.setVisible(true);
                    view.dispose();
                } else {
                   view.loginError(username, password);
               }
           } else {
               PreparedStatement st;
               st = (PreparedStatement) connection.prepareStatement("Select username, password from cashier where username=? and password=?");

               st.setString(1, username);
               st.setString(2, password);
               ResultSet rs = st.executeQuery();
               
               if (rs.next()) {
                    CashierHome home = new CashierHome();
                    home.setVisible(true);
                    view.dispose();
                } else {
                   view.loginError(username, password);
               }
           }
       }catch(SQLException e){
           e.printStackTrace();
       }
       
       
   }
   
   
   
}
