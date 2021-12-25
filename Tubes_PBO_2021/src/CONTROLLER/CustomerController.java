package CONTROLLER;

import DBHelper.customerDB;
import MODEL.CustomerModel;
import VIEW.CustomerMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CustomerController {
    private final CustomerModel model;
    private final CustomerMenu view;
    
    public CustomerController(CustomerModel m, CustomerMenu v) {
        model = m;
        view = v;
        initView();
    }
    
    public void initView() {
        view.setVisible(true);
    }
    
    public void initController() {
        view.CustomerButtonListener(new ButtonListener());
    }
    
    public class ButtonListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(e.getActionCommand());
            switch (e.getActionCommand()) {
                case "Add":
                    addData();
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
        view.getUmurText().setText("");
        view.getAlamatText().setText("");
        view.getTelpText().setText("");
    }
    
    public void addData() {
        model.setId(Integer.parseInt(view.getIdText().getText()));
        model.setNama(view.getNamaText().getText());
        model.setUmur(view.getUmurText().getText());
        model.setAlamat(view.getAlamatText().getText());
        model.setNomorTelp(view.getTelpText().getText());
        
        int id = model.getId();
        String nama = model.getNama();
        String umur = model.getUmur();
        String alamat = model.getAlamat();
        String telp = model.getNomorTelp();
        
        if (new customerDB().createData(id, nama, umur, alamat, telp)) {
            JOptionPane.showMessageDialog(null, "Insert Customer Berhasil");

            //CLEAR TEXTFIELD
            clearFields();
            view.fetchDataCustomer();
            
        } else {
            System.out.println("add data error");
            JOptionPane.showMessageDialog(null, "Insert Data Failed");
        }
    }
    
    public void deleteData() {
        String[] options = {"Yes", "No"};
        int answ = JOptionPane.showOptionDialog(null, "Anda yakin ingin menghapus?", "Delete Confirm", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);

        if (answ == 0) {
            int index = view.getCustomerTable().getSelectedRow();
            String id = view.getCustomerTable().getValueAt(index, 0).toString();

            if (new customerDB().deleteData(id)) {
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
        int index = view.getCustomerTable().getSelectedRow();
        String id = view.getCustomerTable().getValueAt(index, 0).toString();
        
        model.setId(Integer.parseInt(view.getIdText().getText()));
        model.setNama(view.getNamaText().getText());
        model.setUmur(view.getUmurText().getText());
        model.setAlamat(view.getAlamatText().getText());
        model.setNomorTelp(view.getTelpText().getText());
        
        String nama = model.getNama();
        String umur = model.getUmur();
        String alamat = model.getAlamat();
        String telp = model.getNomorTelp();

        if (new customerDB().updateData(id, nama, umur, alamat, telp)) {
            JOptionPane.showMessageDialog(null, "Successfully Updated");

            //CLEAR TEXT
            clearFields();
            refreshData();
            
        } else {
            JOptionPane.showMessageDialog(null, "Updated Failed");
        }
    }
    
    public void refreshData() {
        view.fetchDataCustomer();
    }
}
