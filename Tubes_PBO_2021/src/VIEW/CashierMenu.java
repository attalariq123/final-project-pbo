package VIEW;

import CONTROLLER.AdminHomeController;
import DBHelper.cashierDB;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class CashierMenu extends javax.swing.JFrame {

    public CashierMenu() {
        initComponents();
        fetchDataCashier();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        welcomeLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        IdLabel = new javax.swing.JLabel();
        namaLabel = new javax.swing.JLabel();
        alamatLabel = new javax.swing.JLabel();
        telpLabel = new javax.swing.JLabel();
        idText = new javax.swing.JTextField();
        namaText = new javax.swing.JTextField();
        alamatText = new javax.swing.JTextField();
        telpText = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cashierTable = new javax.swing.JTable();
        clearButton = new javax.swing.JButton();
        umurText = new javax.swing.JTextField();
        umurLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        passwordText = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        usernameText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manage Customer");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        welcomeLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(0, 204, 102));
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLabel.setText("Manage Cashier User");
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

        IdLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        IdLabel.setForeground(new java.awt.Color(0, 204, 102));
        IdLabel.setText("ID");

        namaLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        namaLabel.setForeground(new java.awt.Color(0, 204, 102));
        namaLabel.setText("Nama");

        alamatLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        alamatLabel.setForeground(new java.awt.Color(0, 204, 102));
        alamatLabel.setText("Alamat");

        telpLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        telpLabel.setForeground(new java.awt.Color(0, 204, 102));
        telpLabel.setText("No Telp");

        idText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        namaText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        alamatText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        telpText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        addButton.setBackground(new java.awt.Color(0, 204, 102));
        addButton.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add");

        editButton.setBackground(new java.awt.Color(0, 204, 102));
        editButton.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        editButton.setForeground(new java.awt.Color(255, 255, 255));
        editButton.setText("Edit");

        deleteButton.setBackground(new java.awt.Color(0, 204, 102));
        deleteButton.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");

        cashierTable.setAutoCreateRowSorter(true);
        cashierTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cashierTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Username", "Password", "Nama", "Umur", "Alamat", "No Telp"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cashierTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cashierTable.setRowHeight(26);
        cashierTable.setRowMargin(4);
        cashierTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cashierTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(cashierTable);

        clearButton.setBackground(new java.awt.Color(0, 204, 102));
        clearButton.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("Clear");

        umurText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        umurLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        umurLabel.setForeground(new java.awt.Color(0, 204, 102));
        umurLabel.setText("Umur");

        usernameLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(0, 204, 102));
        usernameLabel.setText("Username");

        passwordText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        passwordLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(0, 204, 102));
        passwordLabel.setText("Password");

        usernameText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(umurLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(umurText, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(IdLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namaText, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(clearButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alamatLabel)
                            .addComponent(telpLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telpText, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alamatText, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameLabel)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(namaLabel)))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(IdLabel)
                            .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(namaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(namaText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(umurLabel)
                            .addComponent(umurText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(alamatLabel)
                            .addComponent(alamatText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(telpLabel)
                            .addComponent(telpText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addButton)
                            .addComponent(editButton)
                            .addComponent(deleteButton)
                            .addComponent(clearButton))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        AdminHome v = new AdminHome();
        AdminHomeController c = new AdminHomeController(v);
        c.initController();
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed
    
    private void cashierTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cashierTableMouseClicked
        // TODO add your handling code here:
        String id = getCashierTable().getValueAt(getCashierTable().getSelectedRow(), 0).toString();
        String username = getCashierTable().getValueAt(getCashierTable().getSelectedRow(), 1).toString();
        String password = getCashierTable().getValueAt(getCashierTable().getSelectedRow(), 2).toString();
        String nama = getCashierTable().getValueAt(getCashierTable().getSelectedRow(), 3).toString();
        String umur = getCashierTable().getValueAt(getCashierTable().getSelectedRow(), 4).toString();
        String alamat = getCashierTable().getValueAt(getCashierTable().getSelectedRow(), 5).toString();
        String telp = getCashierTable().getValueAt(getCashierTable().getSelectedRow(), 6).toString();

        getIdText().setText(id);
        getUsernameText().setText(username);
        getPasswordText().setText(password);
        getNamaText().setText(nama);
        getUmurText().setText(umur);
        getAlamatText().setText(alamat);
        getTelpText().setText(telp);
    }//GEN-LAST:event_cashierTableMouseClicked

    public void CashierButtonListener(ActionListener buttonListener) {
        clearButton.addActionListener(buttonListener);
        addButton.addActionListener(buttonListener);
        editButton.addActionListener(buttonListener);
        deleteButton.addActionListener(buttonListener);
        refreshButton.addActionListener(buttonListener);
    }
    
    public void fetchDataCashier() {
        DefaultTableModel dm = new cashierDB().readData();
        cashierTable.setModel(dm);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IdLabel;
    private javax.swing.JButton addButton;
    private javax.swing.JLabel alamatLabel;
    private javax.swing.JTextField alamatText;
    private javax.swing.JButton backButton;
    private javax.swing.JTable cashierTable;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField idText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JTextField namaText;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField passwordText;
    private javax.swing.JButton refreshButton;
    private javax.swing.JLabel telpLabel;
    private javax.swing.JTextField telpText;
    private javax.swing.JLabel umurLabel;
    private javax.swing.JTextField umurText;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameText;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables

    public JButton getAddButton() {
        return addButton;
    }

    public void setAddButton(JButton addButton) {
        this.addButton = addButton;
    }

    public JTextField getAlamatText() {
        return alamatText;
    }

    public void setAlamatText(JTextField alamatText) {
        this.alamatText = alamatText;
    }

    public JButton getBackButton() {
        return backButton;
    }

    public void setBackButton(JButton backButton) {
        this.backButton = backButton;
    }

    public JTable getCashierTable() {
        return cashierTable;
    }

    public void setCashierTable(JTable cashierTable) {
        this.cashierTable = cashierTable;
    }

    public JButton getClearButton() {
        return clearButton;
    }

    public void setClearButton(JButton clearButton) {
        this.clearButton = clearButton;
    }

    public JButton getDeleteButton() {
        return deleteButton;
    }

    public void setDeleteButton(JButton deleteButton) {
        this.deleteButton = deleteButton;
    }

    public JButton getEditButton() {
        return editButton;
    }

    public void setEditButton(JButton editButton) {
        this.editButton = editButton;
    }

    public JTextField getIdText() {
        return idText;
    }

    public void setIdText(JTextField idText) {
        this.idText = idText;
    }

    public JTextField getNamaText() {
        return namaText;
    }

    public void setNamaText(JTextField namaText) {
        this.namaText = namaText;
    }

    public JLabel getPasswordLabel() {
        return passwordLabel;
    }

    public void setPasswordLabel(JLabel passwordLabel) {
        this.passwordLabel = passwordLabel;
    }

    public JTextField getPasswordText() {
        return passwordText;
    }

    public void setPasswordText(JTextField passwordText) {
        this.passwordText = passwordText;
    }

    public JButton getRefreshButton() {
        return refreshButton;
    }

    public void setRefreshButton(JButton refreshButton) {
        this.refreshButton = refreshButton;
    }

    public JTextField getTelpText() {
        return telpText;
    }

    public void setTelpText(JTextField telpText) {
        this.telpText = telpText;
    }

    public JTextField getUmurText() {
        return umurText;
    }

    public void setUmurText(JTextField umurText) {
        this.umurText = umurText;
    }

    public JTextField getUsernameText() {
        return usernameText;
    }

    public void setUsernameText(JTextField usernameText) {
        this.usernameText = usernameText;
    }

    
    
}
