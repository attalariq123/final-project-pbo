package CONTROLLER;

import DBHelper.productDB;
import MODEL.CategoryModel;
import MODEL.ProductModel;
import VIEW.ProductMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class ProductController {
    private final ProductModel model;
    private final ProductMenu view;
    
    public ProductController(ProductModel m, ProductMenu v) {
        model = m;
        view = v;
        initView();
    }
    
    public void initView() {
        view.setVisible(true);
    }
    
    public void initController() {
        view.ProductButtonListener(new ButtonListener());
    }
    
    public class ButtonListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(e.getActionCommand());
            switch (e.getActionCommand()) {
                case "Add":
                    try {
                        addData();
                    } catch (NullPointerException | NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
                    }
                    break;
                case "Edit":
                    updateData();
                    break;
                case "Delete":
                    deleteData();
                    break;
                case "Clear":
                    clearFields();
                    break;  
                case "Refresh Data":
                    refreshData();
                    break; 
                default:
                    break;
            }
        }
    }
    
    public void clearFields() {
        view.getIdText().setText("");
        view.getNamaText().setText("");
        view.getHargaText().setText("");
        view.getKuantitasText().setText("");
        view.getDeskripsiText().setText("");
        view.getKategoriCB().setSelectedIndex(0);
    }
    
    public void addData() {
        model.setId(Integer.parseInt(view.getIdText().getText()));
        model.setNama(view.getNamaText().getText());
        model.setHarga(view.getHargaText().getText());
        model.setKuantitas(Integer.parseInt(view.getKuantitasText().getText()));
        model.setDeskripsi(view.getDeskripsiText().getText());
        model.setKategori(new CategoryModel(view.getKategoriCB().getSelectedIndex(), view.getKategoriCB().getSelectedItem().toString()));
        
        if (new productDB().createData(model)) {
        JOptionPane.showMessageDialog(null, "Insert Produk Berhasil");

        //CLEAR TEXTFIELD
        clearFields();
        view.fetchDataProduct();
            
        } else {
            System.out.println("add data error");
            JOptionPane.showMessageDialog(null, "Insert Data Failed");
        }
    }
    
    public void deleteData() {
        String[] options = {"Yes", "No"};
        int answ = JOptionPane.showOptionDialog(null, "Anda yakin untuk menghapus?", "Delete Confirm", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);

        if (answ == 0) {
            int index = view.getProductTable().getSelectedRow();
            String id = view.getProductTable().getValueAt(index, 0).toString();

            if (new productDB().deleteData(id)) {
                JOptionPane.showMessageDialog(null, "Delete Berhasil");

                //CLEAR TXT
                clearFields();
                refreshData();
                
            } else {
                JOptionPane.showMessageDialog(null, "Delete Gagal");
            }

        }
    }
    
    public void updateData() {
        int index = view.getProductTable().getSelectedRow();
        String id = view.getProductTable().getValueAt(index, 0).toString();
        
        model.setId(Integer.parseInt(id));
        model.setNama(view.getNamaText().getText());
        model.setHarga(view.getHargaText().getText());
        model.setKuantitas(Integer.parseInt(view.getKuantitasText().getText()));
        model.setDeskripsi(view.getDeskripsiText().getText());
        model.setKategori(new CategoryModel(view.getKategoriCB().getSelectedIndex(), view.getKategoriCB().getSelectedItem().toString()));
        
        if (new productDB().updateData(model, id)) {
            JOptionPane.showMessageDialog(null, "Successfully Updated");

            //CLEAR TEXT
            clearFields();
            refreshData();
            
        } else {
            JOptionPane.showMessageDialog(null, "Updated Failed");
        }
    }
    
    public void refreshData() {
        view.fetchDataProduct();
        clearFields();
    }
}
