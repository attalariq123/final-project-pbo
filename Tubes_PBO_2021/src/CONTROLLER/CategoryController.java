package CONTROLLER;

import DBHelper.categoryDB;
import MODEL.CategoryModel;
import VIEW.CategoryMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class CategoryController {
    private final CategoryModel model;
    private final CategoryMenu view;
    
    public CategoryController(CategoryModel m, CategoryMenu v) {
        model = m;
        view = v;
        initView();
    }
    
    public void initView() {
        view.setVisible(true);
    }
    
    public void initController() {
        view.CategoryButtonListener(new ButtonListener());
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
        view.getIdCatText().setText("");
        view.getNamaCatText().setText("");
    }
    
    public void addData() {
        model.setID(Integer.parseInt(view.getIdCatText().getText()));
        model.setNama_kategori(view.getNamaCatText().getText());
        
        int id = model.getID();
        String nama = model.getNama_kategori();
        
        if (new categoryDB().add(id, nama)) {
            JOptionPane.showMessageDialog(null, "Insert Kategori Berhasil");

            //CLEAR TEXTFIELD
            clearFields();
            view.fetchDataCategory();
            
        } else {
            System.out.println("add data error");
            JOptionPane.showMessageDialog(null, "Insert Data Failed");
        }
    }
    
    public void deleteData() {
        String[] options = {"Yes", "No"};
        int answ = JOptionPane.showOptionDialog(null, "Anda yakin untuk menghapus?", "Delete Confirm", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);

        if (answ == 0) {
            int index = view.getCategoryTable().getSelectedRow();
            String id = view.getCategoryTable().getValueAt(index, 0).toString();

            if (new categoryDB().delete(id)) {
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
        int index = view.getCategoryTable().getSelectedRow();
        String id = view.getCategoryTable().getValueAt(index, 0).toString();
        
        model.setID(Integer.parseInt(id));
        model.setNama_kategori(view.getNamaCatText().getText());
        
        String nama = model.getNama_kategori();

        if (new categoryDB().update(id, nama)) {
            JOptionPane.showMessageDialog(null, "Successfully Updated");

            //CLEAR TEXT
            clearFields();
            refreshData();
            
        } else {
            JOptionPane.showMessageDialog(null, "Updated Failed");
        }
    }
    
    public void refreshData() {
        view.fetchDataCategory();
    }
}
