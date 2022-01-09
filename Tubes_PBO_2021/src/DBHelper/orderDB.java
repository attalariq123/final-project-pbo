package DBHelper;

import MODEL.OrderModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class orderDB {
    
    public DefaultTableModel readData(String customer) {
        String cust = customer;
        //ADD COLUMNS TO TABLE MODEL
        DefaultTableModel dm = new DefaultTableModel();
        //dm.addColumn("Customer");
        dm.addColumn("Produk");
        dm.addColumn("Kuantitas");
        dm.addColumn("Total Harga");
        dm.addColumn("Date");

        //SQL STATEMENT
        String sql = "SELECT * FROM `order` WHERE customer='"+cust+"'";

        try {
            Connection con = KoneksiDB.getKoneksi();

            //PREPARED STMT
            Statement s = con.prepareStatement(sql);
            ResultSet rs = s.executeQuery(sql);

            //LOOP THRU GETTING ALL VALUES
            while (rs.next()) {
                //GET VALUES
                //String customer = rs.getString(2);
                String produk = rs.getString(2);
                String kuantitas = rs.getString(3);
                String totalPrice = rs.getString(4);
                String date = rs.getString(5);

                dm.addRow(new String[]{produk, kuantitas, totalPrice, date});
            }

            return dm;

        } catch (SQLException e) {
            System.out.println("Fetching Data Failed");
            Logger.getLogger(orderDB.class.getName()).log(Level.SEVERE, null, e);
        }

        return null;

    }
    
    public Boolean createData(OrderModel model, int qtyNew, int qtyOld) {
        String customer = model.getCustomer();
        String product = model.getProduct();
        int kuantitas = model.getQty();
        String totalPrice = model.getTotalPrice();
        String date = model.getDate();
        String sql;
        
        int qty = qtyNew;
        int qty_lama = qtyOld;
        
        if (qty > qty_lama || qty <= 0) {
            JOptionPane.showMessageDialog(null, "Stok Produk Tidak Tersedia");
            return false;
        } else {
            //SQL STATEMENT
            sql = "INSERT INTO `order`(customer, produk, kuantitas, `total harga`, date) VALUES ('"+customer+"', '"+product+"', '"+kuantitas+"', '"+totalPrice+"', '"+date+"')";
        }

        try {
            //GET COONECTION
            Connection con = KoneksiDB.getKoneksi();

            // PREPARED STMT
            Statement s = con.prepareStatement(sql);

            s.execute(sql);

            return true;

        } catch (SQLException e) {
            //Logger.getLogger(productDB.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("add order failed");
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }
    
    public Boolean updateData(OrderModel model) {
        
        String customer = model.getCustomer();
        String product = model.getProduct();
        int kuantitas = model.getQty();
        String totalPrice = model.getTotalPrice();
        //SQL STMT
        String sql = "UPDATE order SET `produk`='"+product+"', `kuantitas`='"+kuantitas+"', `total harga`='"+totalPrice+"' WHERE customer='"+customer+"'";

        try {
            //GET COONECTION
            Connection con = KoneksiDB.getKoneksi();

            //STATEMENT
            Statement s = con.prepareStatement(sql);

            //EXECUTE
            s.execute(sql);

            return true;

        } catch (SQLException e) {
            Logger.getLogger(orderDB.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Edit order failed");
            return false;
        }
    }
    
    public Boolean deleteData(String date) {
         //SQL STMT
        String sql="DELETE FROM `order` WHERE date='"+date+"'";

        try {
            //GET COONECTION
            Connection con = KoneksiDB.getKoneksi();

            //STATEMENT
            Statement s=con.prepareStatement(sql);

            //EXECUTE
            s.execute(sql);

            return true;

        }catch(SQLException e) {
            Logger.getLogger(orderDB.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Delete order failed");
            return false;
        }
    }
}
