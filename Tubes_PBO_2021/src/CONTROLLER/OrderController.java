package CONTROLLER;

import DBHelper.customerDB;
import DBHelper.orderDB;
import DBHelper.productDB;
import MODEL.OrderModel;
import VIEW.OrderMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class OrderController {
    private final OrderMenu view;
    private final OrderModel model;
    
    public OrderController(OrderMenu v, OrderModel m) {
        view = v;
        model = m;
        initView();
    }
    
    public void initView() {
        view.setVisible(true);
    }
    
    public void initController() {
        fetchDataCustomer();
        fetchDataProduct();
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
                case "Clear":
                    clearFields();
                    break;
                case "Add Order":
                    addData();
                    break;
                case "Print Invoice":
                    printInvoice();
                    break;
                case "Drop Selected Item":
                    try {
                        deleteSelectedOrder();
                    } catch(IndexOutOfBoundsException ex){
                        JOptionPane.showMessageDialog(null, "Data Unavailable");
                    }
                    break;
                default:
                    break;
            }
        }
    }
    
    public void fetchDataCustomer() {
        DefaultTableModel dm_cust = new customerDB().readData();
        view.getCustomerTable().setModel(dm_cust);
    }
    
    public void fetchDataProduct() {
        DefaultTableModel dm_prod = new productDB().readData();
        view.getProductTable().setModel(dm_prod);
    }
    
    public String currentTime(){
        java.util.Date dt = new java.util.Date();
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String currentTime = sdf.format(dt);
        return currentTime;
    }
    
    public void addData() {
        try {
            model.setCustomer(view.getCustomerText().getText());
            model.setProduct(view.getProdukText().getText());
            model.setQty(Integer.parseInt(view.getKuantitasText().getText()));
            int harga = Integer.parseInt((String) view.getProductTable().getValueAt(view.getProductTable().getSelectedRow(), 2));
            model.setTotalPrice(String.valueOf(model.getQty() * harga));
            String date = currentTime();
            model.setDate(date);

            // Cek Kuantitas Produk
            int index = view.getProductTable().getSelectedRow();
            String id = view.getProductTable().getValueAt(index, 0).toString();
            int qtyNew = Integer.parseInt(view.getKuantitasText().getText());
            int qtyOld = Integer.parseInt(view.getProductTable().getValueAt(view.getProductTable().getSelectedRow(), 3).toString());
            
            if (new orderDB().createData(model, qtyNew, qtyOld) && new productDB().updateQty(qtyNew, qtyOld, id)) {
                JOptionPane.showMessageDialog(null, "Insert Order Success");
                fetchDataProduct();
                view.getProdukText().setText("");
                view.getKuantitasText().setText("");
                view.fetchDataOrder(model.getCustomer());
            } else {
                System.out.println("Add Order Failed");
                JOptionPane.showMessageDialog(null, "Insert Order Failed");
            }
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Kuantitas Tidak Valid");
        }
        
    }
    
    public void deleteSelectedOrder() {
        String[] options = {"Yes", "No"};
        int answ = JOptionPane.showOptionDialog(null, "Anda yakin untuk menghapus?", "Delete Confirm", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);

        if (answ == 0) {
            int index = view.getOrderTable().getSelectedRow();
            String date = view.getOrderTable().getValueAt(index, 3).toString();

            if (new orderDB().deleteData(date)) {
                JOptionPane.showMessageDialog(null, "Drop Order Berhasil");
                view.fetchDataOrder(model.getCustomer());              
                view.getProdukText().setText("");
                view.getKuantitasText().setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Drop Order Gagal");
            }

        }
    }
    
    public void clearFields() {
        view.getCustomerText().setText("");
        view.getProdukText().setText("");
        view.getKuantitasText().setText("");
        view.getInvoiceText().setText("");
    }
    
    public void clearRowOrder(){
        DefaultTableModel table = (DefaultTableModel) view.getOrderTable().getModel();
        table.setRowCount(0);
    }
    
    public void refreshData() {
        fetchDataCustomer();
        fetchDataProduct();
        clearRowOrder();
        clearFields();
    }
    
    public String convertRupiah(int intPrice) {
        Locale localId = new Locale("in", "ID");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(localId);
        String strFormat = formatter.format(intPrice);
        return strFormat;
}
    
    public void printInvoice() {
        DefaultTableModel orderTable = (DefaultTableModel) view.getOrderTable().getModel();
        JTextArea invoice = view.getInvoiceText();
        
        invoice.setText(invoice.getText() + "*************************************************\n");
        invoice.setText(invoice.getText() + "\t  INVOICE ORDER\n");
        invoice.setText(invoice.getText() + "*************************************************\n");
        invoice.setText(invoice.getText() + "Produk" + "\t" + "Qty" + "\t" + "Total" + "\n");
        
        int subtotal = 0;
        
        for (int i = 0; i < orderTable.getRowCount(); i++) {
            String produk = orderTable.getValueAt(i, 0).toString();
            String qty = orderTable.getValueAt(i, 1).toString();
            int total = Integer.parseInt((String) orderTable.getValueAt(i, 2));
            String totals = convertRupiah(total);
            subtotal += total;
            
            if (produk.length() > 12) {
                produk = produk.substring(0, 10)+"...";
            }
            
            invoice.setText(invoice.getText() + produk + "\t" + "x"+ qty + "\t" + totals + "\n");
        }
        invoice.setText(invoice.getText() + "----------------------------------------------------\n");
        String now = currentTime();
        String totPrice = convertRupiah(subtotal);
        invoice.setText(invoice.getText() + "Subtotal     : " + totPrice + "\n");
        invoice.setText(invoice.getText() + "Customer   : " + view.getCustomerText().getText() + "\n");
        invoice.setText(invoice.getText() + "Order Date : " + now + "\n");
        invoice.setText(invoice.getText() + "----------------------------------------------------\n");
        invoice.setText(invoice.getText() + "\t   THANK YOU \n");
        invoice.setText(invoice.getText() + "*************************************************\n");
        
        try {
            invoice.print();
        } catch (PrinterException ex) {
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Print Failed");
        }
    }
}
