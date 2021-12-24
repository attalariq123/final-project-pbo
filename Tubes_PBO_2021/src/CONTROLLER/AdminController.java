package CONTROLLER;

import MODEL.ProductModel;
import MODEL.UserModel;
import VIEW.AdminHome;
import VIEW.LoginForm;
import VIEW.ProductMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class AdminController {
    private final AdminHome view;
    
    public AdminController(AdminHome v) {
        view = v;
        initView();
    }
    
    public void initView() {
        view.setVisible(true);
    }
    
    public void initController() {
        view.addButtonListener(new ButtonListener());
    }
    
    public class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(e.getActionCommand());
            switch (e.getActionCommand()) {
                case "Logout":
                    logout();
                    break;
                case "PRODUCT":
                    productMenu();
                    break;
                case "CATEGORY":
                    productMenu();
                    break;
                case "ORDER":
                    productMenu();
                    break;
                case "CUSTOMER":
                    productMenu();
                    break;
                case "CASHIER":
                    productMenu();
                    break;
                default:
                    break;
            }
        }
    }
    
    public void productMenu() {
        view.dispose();
        ProductMenu v = new ProductMenu();
        ProductModel m = new ProductModel();
        ProductController c = new ProductController(m, v);
        c.initController();
    }
    
    public void logout() {
        int a = JOptionPane.showConfirmDialog(null, "Anda yakin ingin keluar?");

        if (a == JOptionPane.YES_OPTION) {
            view.dispose();
            UserModel m = new UserModel("", "");
            LoginForm v = new LoginForm();
            LoginController c = new LoginController(m, v);
            c.initController();
        }
    }
}
