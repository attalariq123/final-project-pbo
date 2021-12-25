package CONTROLLER;


import MODEL.*;
import VIEW.*;
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
                    categoryMenu();
                    break;
                case "CUSTOMER":
                    customerMenu();
                    break;
                case "CASHIER":
                    cashierMenu();
                    break;
                default:
                    break;
            }
        }
    }
    
    public void cashierMenu() {
        view.dispose();
        CashierMenu v = new CashierMenu();
        CashierModel m = new CashierModel();
        CashierController c = new CashierController(m, v);
        c.initController();
    }
    
    public void categoryMenu() {
        view.dispose();
        CategoryMenu v = new CategoryMenu();
        CategoryModel m = new CategoryModel();
        CategoryController c = new CategoryController(m, v);
        c.initController();
    }
    
    public void productMenu() {
        view.dispose();
        ProductMenu v = new ProductMenu();
        ProductModel m = new ProductModel();
        ProductController c = new ProductController(m, v);
        c.initController();
    }
    
    public void customerMenu() {
        view.dispose();
        CustomerMenu v = new CustomerMenu();
        CustomerModel m = new CustomerModel();
        CustomerController c = new CustomerController(m, v);
        c.initController();
    }
    
    public void logout() {
        int a = JOptionPane.showConfirmDialog(null, "Anda yakin ingin keluar?");

        if (a == JOptionPane.YES_OPTION) {
            view.dispose();
            AdminModel m = new AdminModel("", "");
            LoginForm v = new LoginForm();
            LoginController c = new LoginController(m, v);
            c.initController();
        }
    }
}
