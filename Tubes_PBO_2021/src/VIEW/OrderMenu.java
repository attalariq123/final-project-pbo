package VIEW;

import CONTROLLER.KasirHomeController;
import DBHelper.orderDB;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class OrderMenu extends javax.swing.JFrame {

    public OrderMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        welcomeLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        customerLabel = new javax.swing.JLabel();
        productLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        orderLabel = new javax.swing.JLabel();
        custLabel = new javax.swing.JLabel();
        produkLabel = new javax.swing.JLabel();
        customerText = new javax.swing.JTextField();
        kuantitasText = new javax.swing.JTextField();
        produkText = new javax.swing.JTextField();
        kuantitasLabel = new javax.swing.JLabel();
        addOrderButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        dropButton = new javax.swing.JButton();
        printButton = new javax.swing.JButton();
        TextArea = new javax.swing.JScrollPane();
        invoiceText = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manage Order");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        welcomeLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLabel.setText("Manage Order");
        welcomeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        backButton.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        refreshButton.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        refreshButton.setText("Refresh Data");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(welcomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refreshButton)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(welcomeLabel)
                    .addComponent(backButton)
                    .addComponent(refreshButton))
                .addGap(9, 9, 9))
        );

        customerTable.setAutoCreateRowSorter(true);
        customerTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nama", "Umur", "Alamat", "No Telp"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        customerTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        customerTable.setRowHeight(26);
        customerTable.setRowMargin(4);
        customerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(customerTable);

        productTable.setAutoCreateRowSorter(true);
        productTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nama", "Harga", "Kuantitas", "Deskripsi", "Kategori"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        productTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        productTable.setRowHeight(26);
        productTable.setRowMargin(4);
        productTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(productTable);

        customerLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        customerLabel.setForeground(new java.awt.Color(0, 204, 102));
        customerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        customerLabel.setText("Customer");
        customerLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        productLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        productLabel.setForeground(new java.awt.Color(0, 204, 102));
        productLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productLabel.setText("Product");
        productLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        orderTable.setAutoCreateRowSorter(true);
        orderTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produk", "Kuantitas", "Total Harga", "Date"
            }
        ));
        orderTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        orderTable.setRowHeight(26);
        orderTable.setRowMargin(4);
        orderTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(orderTable);

        orderLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        orderLabel.setForeground(new java.awt.Color(0, 204, 102));
        orderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orderLabel.setText("Order");
        orderLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        custLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        custLabel.setForeground(new java.awt.Color(0, 204, 102));
        custLabel.setText("Customer");

        produkLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        produkLabel.setForeground(new java.awt.Color(0, 204, 102));
        produkLabel.setText("Produk");

        customerText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        kuantitasText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        produkText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        kuantitasLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        kuantitasLabel.setForeground(new java.awt.Color(0, 204, 102));
        kuantitasLabel.setText("Kuantitas");

        addOrderButton.setBackground(new java.awt.Color(0, 204, 102));
        addOrderButton.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        addOrderButton.setForeground(new java.awt.Color(255, 255, 255));
        addOrderButton.setText("Add Order");

        clearButton.setBackground(new java.awt.Color(0, 204, 102));
        clearButton.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("Clear");

        dropButton.setBackground(new java.awt.Color(0, 204, 102));
        dropButton.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        dropButton.setForeground(new java.awt.Color(255, 255, 255));
        dropButton.setText("Drop Selected Item");

        printButton.setBackground(new java.awt.Color(0, 204, 102));
        printButton.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        printButton.setForeground(new java.awt.Color(255, 255, 255));
        printButton.setText("Print Invoice");

        TextArea.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        invoiceText.setBackground(new java.awt.Color(204, 204, 204));
        invoiceText.setColumns(20);
        invoiceText.setRows(5);
        invoiceText.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        invoiceText.setOpaque(false);
        TextArea.setViewportView(invoiceText);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(customerLabel)
                                .addGap(586, 586, 586)
                                .addComponent(productLabel)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kuantitasLabel)
                            .addComponent(custLabel)
                            .addComponent(produkLabel))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(produkText)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(clearButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addOrderButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(kuantitasText, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(customerText))
                        .addGap(18, 18, 18)
                        .addComponent(TextArea)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(295, 295, 295)
                                .addComponent(orderLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dropButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(printButton)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerLabel)
                    .addComponent(productLabel))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(orderLabel)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(custLabel)
                                    .addComponent(customerText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(produkLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(produkText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(kuantitasLabel)
                                    .addComponent(kuantitasText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(clearButton)
                                    .addComponent(addOrderButton))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dropButton)
                            .addComponent(printButton)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(TextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        KasirHome v = new KasirHome();
        KasirHomeController c = new KasirHomeController(v);
        c.initController();
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void orderTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_orderTableMouseClicked

    private void productTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTableMouseClicked
        // TODO add your handling code here:
        String produk = getProductTable().getValueAt(getProductTable().getSelectedRow(), 1).toString();
        getProdukText().setText(produk);
    }//GEN-LAST:event_productTableMouseClicked

    private void customerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerTableMouseClicked
        // TODO add your handling code here:
        String customer = getCustomerTable().getValueAt(getCustomerTable().getSelectedRow(), 1).toString();
        getCustomerText().setText(customer);
        fetchDataOrder(customer);
    }//GEN-LAST:event_customerTableMouseClicked
    
    public void fetchDataOrder(String cust) {
        DefaultTableModel dm_order = new orderDB().readData(cust);
        getOrderTable().setModel(dm_order);
    }
    
    public void OrderButtonListener(ActionListener buttonListener) {
        refreshButton.addActionListener(buttonListener);
        clearButton.addActionListener(buttonListener);
        addOrderButton.addActionListener(buttonListener);
        dropButton.addActionListener(buttonListener);
        printButton.addActionListener(buttonListener);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane TextArea;
    private javax.swing.JButton addOrderButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel custLabel;
    private javax.swing.JLabel customerLabel;
    private javax.swing.JTable customerTable;
    private javax.swing.JTextField customerText;
    private javax.swing.JButton dropButton;
    private javax.swing.JTextArea invoiceText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel kuantitasLabel;
    private javax.swing.JTextField kuantitasText;
    private javax.swing.JLabel orderLabel;
    private javax.swing.JTable orderTable;
    private javax.swing.JButton printButton;
    private javax.swing.JLabel productLabel;
    private javax.swing.JTable productTable;
    private javax.swing.JLabel produkLabel;
    private javax.swing.JTextField produkText;
    private javax.swing.JButton refreshButton;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
    
    
    
    public JTable getOrderTable() {
        return orderTable;
    }

    public void setOrderTable(JTable orderTable) {
        this.orderTable = orderTable;
    }

    public JTable getCustomerTable() {
        return customerTable;
    }

    public void setCustomerTable(JTable customerTable) {
        this.customerTable = customerTable;
    }

    public JTable getProductTable() {
        return productTable;
    }

    public void setProductTable(JTable productTable) {
        this.productTable = productTable;
    }

    public JButton getRefreshButton() {
        return refreshButton;
    }

    public void setRefreshButton(JButton refreshButton) {
        this.refreshButton = refreshButton;
    }

    public JButton getAddOrderButton() {
        return addOrderButton;
    }

    public void setAddOrderButton(JButton addOrderButton) {
        this.addOrderButton = addOrderButton;
    }
    
    public JButton getDropButton() {
        return dropButton;
    }

    public void setDropButton(JButton dropButton) {
        this.dropButton = dropButton;
    }

    public JButton getClearButtton() {
        return clearButton;
    }

    public void setClearButtton(JButton clearButtton) {
        this.clearButton = clearButtton;
    }

    public JTextField getCustomerText() {
        return customerText;
    }

    public void setCustomerText(JTextField customerText) {
        this.customerText = customerText;
    }

    public JTextField getKuantitasText() {
        return kuantitasText;
    }

    public void setKuantitasText(JTextField kuantitasText) {
        this.kuantitasText = kuantitasText;
    }

    public JTextField getProdukText() {
        return produkText;
    }

    public void setProdukText(JTextField produkText) {
        this.produkText = produkText;
    }

    public JScrollPane getBillText() {
        return TextArea;
    }

    public void setBillText(JScrollPane billText) {
        this.TextArea = billText;
    }

    public JTextArea getInvoiceText() {
        return invoiceText;
    }

    public void setInvoiceText(JTextArea invoiceText) {
        this.invoiceText = invoiceText;
    }

    public JButton getPrintButton() {
        return printButton;
    }

    public void setPrintButton(JButton printButton) {
        this.printButton = printButton;
    }   
}
