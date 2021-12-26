package CONTROLLER;

import VIEW.OrderMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderController {
    private final OrderMenu view;
    
    public OrderController(OrderMenu v) {
        view = v;
        initView();
    }
    
    public void initView() {
        view.setVisible(true);
    }
    
    public void initController() {
        view.OrderButtonListener(new ButtonListener());
    }
    
    public class ButtonListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(e.getActionCommand());
            switch (e.getActionCommand()) {
                case "Refresh Data":
                    refreshData();
                    break; 
                default:
                    break;
            }
        }
    }
    
    public void refreshData() {
        view.fetchDataCustomer();
        view.fetchDataProduct();
    }
}
