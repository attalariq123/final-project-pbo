package VIEW;

import CONTROLLER.LoginControl;
import MODEL.UserModel;
import javax.swing.JOptionPane;

public class AdminHome extends javax.swing.JFrame {

    public AdminHome(UserModel model) {
        initComponents();
        welcomeLabel.setText("Halo " + model.getUsername());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logoutButton = new javax.swing.JButton();
        productLabel = new javax.swing.JLabel();
        cashierLabel = new javax.swing.JLabel();
        categoryLabel = new javax.swing.JLabel();
        orderLabel = new javax.swing.JLabel();
        customerLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        welcomeLabel = new javax.swing.JLabel();
        appLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Home");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        logoutButton.setBackground(new java.awt.Color(0, 204, 102));
        logoutButton.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        productLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        productLabel.setForeground(new java.awt.Color(0, 204, 102));
        productLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/product-icon.png"))); // NOI18N
        productLabel.setText("PRODUCT");

        cashierLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        cashierLabel.setForeground(new java.awt.Color(0, 204, 102));
        cashierLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cashierLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/cashier-user-icon.png"))); // NOI18N
        cashierLabel.setText("CASHIER");

        categoryLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        categoryLabel.setForeground(new java.awt.Color(0, 204, 102));
        categoryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        categoryLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/category-icon.png"))); // NOI18N
        categoryLabel.setText("CATEGORY");

        orderLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        orderLabel.setForeground(new java.awt.Color(0, 204, 102));
        orderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orderLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/order-icon.png"))); // NOI18N
        orderLabel.setText("ORDER");

        customerLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        customerLabel.setForeground(new java.awt.Color(0, 204, 102));
        customerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        customerLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/customer-icon.png"))); // NOI18N
        customerLabel.setText("CUSTOMER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(productLabel)
                .addGap(125, 125, 125)
                .addComponent(categoryLabel)
                .addGap(125, 125, 125)
                .addComponent(orderLabel)
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(logoutButton)
                        .addGap(354, 354, 354))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(customerLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cashierLabel)
                        .addGap(170, 170, 170))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(orderLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productLabel)
                            .addComponent(categoryLabel))))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cashierLabel)
                    .addComponent(customerLabel))
                .addGap(40, 40, 40)
                .addComponent(logoutButton)
                .addGap(20, 20, 20))
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 102));

        welcomeLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 20)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLabel.setText("Home");
        welcomeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        appLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 20)); // NOI18N
        appLabel.setForeground(new java.awt.Color(255, 255, 255));
        appLabel.setText("Manajemen Inventory Toko");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(appLabel)
                .addGap(255, 255, 255))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(welcomeLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(appLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(welcomeLabel)
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Anda yakin ingin keluar?");

        if (a == JOptionPane.YES_OPTION) {
            this.dispose();
            UserModel m = new UserModel("", "");
            LoginForm v = new LoginForm();
            LoginControl c = new LoginControl(m, v);
            c.initController();
        }
    }//GEN-LAST:event_logoutButtonActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appLabel;
    private javax.swing.JLabel cashierLabel;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JLabel customerLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel orderLabel;
    private javax.swing.JLabel productLabel;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
