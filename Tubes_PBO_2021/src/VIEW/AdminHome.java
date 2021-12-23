package VIEW;

import java.awt.event.ActionListener;
import javax.swing.JButton;

public class AdminHome extends javax.swing.JFrame {

    public AdminHome() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        appLabel1 = new javax.swing.JLabel();
        welcomeLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        productButton = new javax.swing.JButton();
        categoryButton = new javax.swing.JButton();
        orderButton = new javax.swing.JButton();
        customerButton = new javax.swing.JButton();
        cashierButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Home");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(1300, 700));

        jPanel1.setBackground(new java.awt.Color(0, 204, 102));

        appLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 20)); // NOI18N
        appLabel1.setForeground(new java.awt.Color(255, 255, 255));
        appLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appLabel1.setText("Manajemen Inventory Toko");

        welcomeLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 20)); // NOI18N
        welcomeLabel1.setForeground(new java.awt.Color(255, 255, 255));
        welcomeLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLabel1.setText("Menu Admin");
        welcomeLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(appLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(welcomeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(appLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(welcomeLabel1)
                .addGap(8, 8, 8))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        productButton.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        productButton.setForeground(new java.awt.Color(0, 204, 102));
        productButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/product-icon.png"))); // NOI18N
        productButton.setText("PRODUCT");
        productButton.setBorder(null);
        productButton.setBorderPainted(false);
        productButton.setContentAreaFilled(false);

        categoryButton.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        categoryButton.setForeground(new java.awt.Color(0, 204, 102));
        categoryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/category-icon.png"))); // NOI18N
        categoryButton.setText("CATEGORY");
        categoryButton.setBorder(null);
        categoryButton.setBorderPainted(false);
        categoryButton.setContentAreaFilled(false);

        orderButton.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        orderButton.setForeground(new java.awt.Color(0, 204, 102));
        orderButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/order-icon.png"))); // NOI18N
        orderButton.setText("ORDER");
        orderButton.setBorder(null);
        orderButton.setBorderPainted(false);
        orderButton.setContentAreaFilled(false);

        customerButton.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        customerButton.setForeground(new java.awt.Color(0, 204, 102));
        customerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/customer-icon.png"))); // NOI18N
        customerButton.setText("CUSTOMER");
        customerButton.setBorder(null);
        customerButton.setBorderPainted(false);
        customerButton.setContentAreaFilled(false);

        cashierButton.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        cashierButton.setForeground(new java.awt.Color(0, 204, 102));
        cashierButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/cashier-user-icon.png"))); // NOI18N
        cashierButton.setText("CASHIER");
        cashierButton.setBorder(null);
        cashierButton.setBorderPainted(false);
        cashierButton.setContentAreaFilled(false);

        logoutButton.setBackground(new java.awt.Color(0, 204, 102));
        logoutButton.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setText("Logout");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(customerButton)
                .addGap(50, 50, 50)
                .addComponent(cashierButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(productButton)
                .addGap(50, 50, 50)
                .addComponent(categoryButton)
                .addGap(50, 50, 50)
                .addComponent(orderButton)
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productButton)
                    .addComponent(categoryButton)
                    .addComponent(orderButton))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerButton)
                    .addComponent(cashierButton))
                .addGap(20, 20, 20)
                .addComponent(logoutButton)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void addButtonListener (ActionListener buttonListener) {
        logoutButton.addActionListener(buttonListener);
        productButton.addActionListener(buttonListener);
        categoryButton.addActionListener(buttonListener);
        orderButton.addActionListener(buttonListener);
        customerButton.addActionListener(buttonListener);
        cashierButton.addActionListener(buttonListener);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appLabel1;
    private javax.swing.JButton cashierButton;
    private javax.swing.JButton categoryButton;
    private javax.swing.JButton customerButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton orderButton;
    private javax.swing.JButton productButton;
    private javax.swing.JLabel welcomeLabel1;
    // End of variables declaration//GEN-END:variables

    public JButton getCashierButton() {
        return cashierButton;
    }

    public void setCashierButton(JButton cashierButton) {
        this.cashierButton = cashierButton;
    }

    public JButton getCategoryButton() {
        return categoryButton;
    }

    public void setCategoryButton(JButton categoryButton) {
        this.categoryButton = categoryButton;
    }

    public JButton getCustomerButton() {
        return customerButton;
    }

    public void setCustomerButton(JButton customerButton) {
        this.customerButton = customerButton;
    }

    public JButton getLogoutButton() {
        return logoutButton;
    }

    public void setLogoutButton(JButton logoutButton) {
        this.logoutButton = logoutButton;
    }

    public JButton getOrderButton() {
        return orderButton;
    }

    public void setOrderButton(JButton orderButton) {
        this.orderButton = orderButton;
    }

    public JButton getProductButton() {
        return productButton;
    }

    public void setProductButton(JButton productButton) {
        this.productButton = productButton;
    }

    
}
