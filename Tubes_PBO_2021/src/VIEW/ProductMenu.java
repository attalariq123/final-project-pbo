package VIEW;

import CONTROLLER.AdminController;
<<<<<<< HEAD
import DBHelper.productDB;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
=======
>>>>>>> b9b5201cfdd8dcd798655355baf197377bc31885

public class ProductMenu extends javax.swing.JFrame {

    public ProductMenu() {
        initComponents();
        fetchDataProduct();
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
        NamaLabel = new javax.swing.JLabel();
        KuantitasLabel = new javax.swing.JLabel();
        DeskripsiLabel = new javax.swing.JLabel();
        KategoriLabel = new javax.swing.JLabel();
        idText = new javax.swing.JTextField();
        namaText = new javax.swing.JTextField();
        kuantitasText = new javax.swing.JTextField();
        deskripsiText = new javax.swing.JTextField();
        kategoriCB = new javax.swing.JComboBox<>();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        clearButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manage Product");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 204, 102));

        welcomeLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 20)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLabel.setText("Manajemen Produk");
        welcomeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        backButton.setBackground(new java.awt.Color(255, 255, 255));
        backButton.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(0, 204, 102));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        refreshButton.setBackground(new java.awt.Color(255, 255, 255));
        refreshButton.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        refreshButton.setForeground(new java.awt.Color(0, 204, 102));
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        IdLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        IdLabel.setForeground(new java.awt.Color(0, 204, 102));
        IdLabel.setText("ID");

        NamaLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        NamaLabel.setForeground(new java.awt.Color(0, 204, 102));
        NamaLabel.setText("Nama");

        KuantitasLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        KuantitasLabel.setForeground(new java.awt.Color(0, 204, 102));
        KuantitasLabel.setText("Kuantitas");

        DeskripsiLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        DeskripsiLabel.setForeground(new java.awt.Color(0, 204, 102));
        DeskripsiLabel.setText("Deskripsi");

        KategoriLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        KategoriLabel.setForeground(new java.awt.Color(0, 204, 102));
        KategoriLabel.setText("Kategori");

<<<<<<< HEAD
        kategoriCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Elektronik" }));

=======
>>>>>>> b9b5201cfdd8dcd798655355baf197377bc31885
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

        productTable.setAutoCreateRowSorter(true);
        productTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nama", "Kuantitas", "Deskripsi", "Kategori"
            }
        ));
        productTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        productTable.setSelectionBackground(new java.awt.Color(0, 204, 102));
        productTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(productTable);

        clearButton.setBackground(new java.awt.Color(0, 204, 102));
        clearButton.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("Clear");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(clearButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(KuantitasLabel)
                            .addComponent(DeskripsiLabel)
                            .addComponent(KategoriLabel)
                            .addComponent(NamaLabel)
                            .addComponent(IdLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deskripsiText)
                            .addComponent(kuantitasText)
                            .addComponent(namaText)
                            .addComponent(kategoriCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(idText))))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IdLabel)
                            .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NamaLabel)
                            .addComponent(namaText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(KuantitasLabel)
                            .addComponent(kuantitasText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DeskripsiLabel)
                            .addComponent(deskripsiText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(KategoriLabel)
                            .addComponent(kategoriCB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addButton)
                            .addComponent(editButton)
                            .addComponent(deleteButton)
                            .addComponent(clearButton))))
                .addGap(20, 20, 20))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        AdminHome v = new AdminHome();
        AdminController c = new AdminController(v);
        c.initController();
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

<<<<<<< HEAD
    private void productTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTableMouseClicked
        // TODO add your handling code here:
        String id = getProductTable().getValueAt(getProductTable().getSelectedRow(), 0).toString();
        String nama = getProductTable().getValueAt(getProductTable().getSelectedRow(), 1).toString();
        String kuantitas = getProductTable().getValueAt(getProductTable().getSelectedRow(), 2).toString();
        String deskripsi = getProductTable().getValueAt(getProductTable().getSelectedRow(), 3).toString();
        String kategori = getProductTable().getValueAt(getProductTable().getSelectedRow(), 4).toString();
        
        getIdText().setText(id);
        getNamaText().setText(nama);
        getKuantitasText().setText(kuantitas);
        getDeskripsiText().setText(deskripsi);
        getKategoriCB().setSelectedItem(kategori);        
    }//GEN-LAST:event_productTableMouseClicked

    public void ProductButtonListener(ActionListener buttonListener) {
        clearButton.addActionListener(buttonListener);
        addButton.addActionListener(buttonListener);
        editButton.addActionListener(buttonListener);
        deleteButton.addActionListener(buttonListener);
        refreshButton.addActionListener(buttonListener);
=======
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProductMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ProductMenu().setVisible(true);
        });
>>>>>>> b9b5201cfdd8dcd798655355baf197377bc31885
    }
    
    public void fetchDataProduct() {
        DefaultTableModel dm = new productDB().getData();
        productTable.setModel(dm);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DeskripsiLabel;
    private javax.swing.JLabel IdLabel;
    private javax.swing.JLabel KategoriLabel;
    private javax.swing.JLabel KuantitasLabel;
    private javax.swing.JLabel NamaLabel;
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField deskripsiText;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField idText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> kategoriCB;
    private javax.swing.JTextField kuantitasText;
    private javax.swing.JTextField namaText;
    private javax.swing.JTable productTable;
    private javax.swing.JButton refreshButton;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables

    public JButton getAddButton() {
        return addButton;
    }

    public void setAddButton(JButton addButton) {
        this.addButton = addButton;
    }

    public JButton getRefreshButton() {
        return refreshButton;
    }

    public void setRefreshButton(JButton refreshButton) {
        this.refreshButton = refreshButton;
    }
    
    public JButton getBackButton() {
        return backButton;
    }

    public void setBackButton(JButton backButton) {
        this.backButton = backButton;
    }

    public JButton getDeleteButton() {
        return deleteButton;
    }

    public void setDeleteButton(JButton deleteButton) {
        this.deleteButton = deleteButton;
    }

    public JTextField getDeskripsiText() {
        return deskripsiText;
    }

    public void setDeskripsiText(JTextField deskripsiText) {
        this.deskripsiText = deskripsiText;
    }

    public JButton getEditButton() {
        return editButton;
    }

    public void setEditButton(JButton editButton) {
        this.editButton = editButton;
    }
    
    public JButton getClearButton() {
        return clearButton;
    }

    public void setClearButton(JButton clearButton) {
        this.clearButton = clearButton;
    }

    public JTextField getIdText() {
        return idText;
    }

    public void setIdText(JTextField idText) {
        this.idText = idText;
    }

    public JComboBox<String> getKategoriCB() {
        return kategoriCB;
    }

    public void setKategoriCB(JComboBox<String> kategoriCB) {
        this.kategoriCB = kategoriCB;
    }

    public JTextField getKuantitasText() {
        return kuantitasText;
    }

    public void setKuantitasText(JTextField kuantitasText) {
        this.kuantitasText = kuantitasText;
    }

    public JTextField getNamaText() {
        return namaText;
    }

    public void setNamaText(JTextField namaText) {
        this.namaText = namaText;
    }

    public JTable getProductTable() {
        return productTable;
    }

    public void setProductTable(JTable productTable) {
        this.productTable = productTable;
    }
}
