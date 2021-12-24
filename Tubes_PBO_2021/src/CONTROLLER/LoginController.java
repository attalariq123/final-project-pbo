package CONTROLLER;

import DBHelper.KoneksiDB;
import MODEL.UserModel;
import VIEW.AdminHome;
import VIEW.CashierHome;
import VIEW.LoginForm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

// Test Test

public class LoginController {
    private final UserModel model;
    private final LoginForm view;
    
    public LoginController(UserModel m, LoginForm v) {
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
        view.addButtonListener(new ButtonListener());
    }
    
    public class ButtonListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(e.getActionCommand());
            switch (e.getActionCommand()) {
                case "Login":
                    login();
                    break;
                case "Clear":
                    view.clearFields();
                    break;
                default:
                    break;
            }
        }
    }
   
    public void login() {
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
                    AdminHome v = new AdminHome();
                    AdminController c = new AdminController(v);
                    c.initController();
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
           Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, e);
       }
    }
}
