package CONTROLLER;

import DBHelper.cashierDB;
import MODEL.CashierModel;
import VIEW.CashierMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CashierController {
    private final CashierModel model;
    private final CashierMenu view;
    
    public CashierController(CashierModel m, CashierMenu v) {
        model = m;
        view = v;
        initView();
    }
    
    public void initView() {
        view.setVisible(true);
    }
    
    public void initController() {
        view.CashierButtonListener(new ButtonListener());
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
        view.getUsernameText().setText("");
        view.getPasswordText().setText("");
        view.getNamaText().setText("");
        view.getUmurText().setText("");
        view.getAlamatText().setText("");
        view.getTelpText().setText("");
    }
    
    public void addData() {
        model.setId(Integer.parseInt(view.getIdText().getText()));
        model.setUsername(view.getUsernameText().getText());
        model.setPassword(view.getPasswordText().getText());
        model.setNama(view.getNamaText().getText());
        model.setUmur(view.getUmurText().getText());
        model.setAlamat(view.getAlamatText().getText());
        model.setNomorTelp(view.getTelpText().getText());
        
        int id = model.getId();
        String username = model.getUsername();
        String password = model.getPassword();
        String nama = model.getNama();
        String umur = model.getUmur();
        String alamat = model.getAlamat();
        String telp = model.getNomorTelp();
        
        if (new cashierDB().createData(id, nama, umur, alamat, telp, username, password)) {
            JOptionPane.showMessageDialog(null, "Insert User Cashier Berhasil");

            //CLEAR TEXTFIELD
            clearFields();
            view.fetchDataCashier();
            
        } else {
            System.out.println("add data error");
            JOptionPane.showMessageDialog(null, "Insert Data Failed");
        }
    }
    
    public void deleteData() {
        String[] options = {"Yes", "No"};
        int answ = JOptionPane.showOptionDialog(null, "Anda yakin ingin menghapus?", "Delete Confirm", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);

        if (answ == 0) {
            int index = view.getCashierTable().getSelectedRow();
            String id = view.getCashierTable().getValueAt(index, 0).toString();

            if (new cashierDB().deleteData(id)) {
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
        int index = view.getCashierTable().getSelectedRow();
        String id = view.getCashierTable().getValueAt(index, 0).toString();
        
        model.setId(Integer.parseInt(view.getIdText().getText()));
        model.setUsername(view.getUsernameText().getText());
        model.setPassword(view.getPasswordText().getText());
        model.setNama(view.getNamaText().getText());
        model.setUmur(view.getUmurText().getText());
        model.setAlamat(view.getAlamatText().getText());
        model.setNomorTelp(view.getTelpText().getText());
        
        String username = model.getUsername();
        String password = model.getPassword();
        String nama = model.getNama();
        String umur = model.getUmur();
        String alamat = model.getAlamat();
        String telp = model.getNomorTelp();

        if (new cashierDB().updateData(id, nama, umur, alamat, telp, username, password)) {
            JOptionPane.showMessageDialog(null, "Successfully Updated");

            //CLEAR TEXT
            clearFields();
            refreshData();
            
        } else {
            JOptionPane.showMessageDialog(null, "Updated Failed");
        }
    }
    
    public void refreshData() {
        view.fetchDataCashier();
    }
}
