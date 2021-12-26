package CONTROLLER;


import MODEL.*;
import VIEW.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class KasirHomeController {
    private final KasirHome view;
    
    public KasirHomeController(KasirHome v) {
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
                case "ORDER":
                    orderMenu();
                    break;
                case "CUSTOMER":
                    customerKasirMenu();
                    break;
                default:
                    break;
            }
        }
    }
    
    public void orderMenu() {
        view.dispose();
        CustomerKasirMenu v = new CustomerKasirMenu();
        CustomerModel m = new CustomerModel();
        CustomerKasirController c = new CustomerKasirController(m, v);
        c.initController();
    }
    
    public void customerKasirMenu() {
        view.dispose();
        CustomerKasirMenu v = new CustomerKasirMenu();
        CustomerModel m = new CustomerModel();
        CustomerKasirController c = new CustomerKasirController(m, v);
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
