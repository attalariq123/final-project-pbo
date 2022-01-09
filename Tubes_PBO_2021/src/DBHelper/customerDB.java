package DBHelper;

import MODEL.CustomerModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class customerDB {
    
    public DefaultTableModel readData() {
        //ADD COLUMNS TO TABLE MODEL
        DefaultTableModel dm = new DefaultTableModel();
        dm.addColumn("ID");
        dm.addColumn("Nama");
        dm.addColumn("Umur");
        dm.addColumn("Alamat");
        dm.addColumn("No Telp");

        //SQL STATEMENT
        String sql = "SELECT * FROM customer";

        try {
            Connection con = KoneksiDB.getKoneksi();

            //PREPARED STMT
            Statement s = con.prepareStatement(sql);
            ResultSet rs = s.executeQuery(sql);

            //LOOP THRU GETTING ALL VALUES
            while (rs.next()) {
                //GET VALUES
                String id = rs.getString(1);
                String nama = rs.getString(2);
                String umur = rs.getString(3);
                String alamat = rs.getString(4);
                String telp = rs.getString(5);

                dm.addRow(new String[]{id, nama, umur, alamat, telp});
            }

            return dm;

        } catch (SQLException e) {
            System.out.println("Fetching Data Failed");
            Logger.getLogger(customerDB.class.getName()).log(Level.SEVERE, null, e);
        }

        return null;

    }
    
    public Boolean createData(CustomerModel model) {
        
        int id = model.getId();
        String nama = model.getNama();
        String umur = model.getUmur();
        String alamat = model.getAlamat();
        String telp = model.getNomorTelp();
        
        //SQL STATEMENT
        String sql = "INSERT INTO customer(id, nama, umur, alamat, `no telp`) VALUES ('"+id+"','"+nama+"', '"+umur+"','"+alamat+"','"+telp+"')";

        try {
            //GET COONECTION
            Connection con = KoneksiDB.getKoneksi();

            // PREPARED STMT
            Statement s = con.prepareStatement(sql);

            s.execute(sql);

            return true;

        } catch (SQLException e) {
            //Logger.getLogger(productDB.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("add customer failed");
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }
    
    public Boolean updateData(String id, CustomerModel model) {
        
        String nama = model.getNama();
        String umur = model.getUmur();
        String alamat = model.getAlamat();
        String telp = model.getNomorTelp();
        
        //SQL STMT
        String sql = "UPDATE customer SET `nama`='"+nama+"', `umur`='"+umur+"', `alamat`='"+alamat+"', `no telp`='"+telp+"' WHERE ID='"+id+"'";

        try {
            //GET COONECTION
            Connection con = KoneksiDB.getKoneksi();

            //STATEMENT
            Statement s = con.prepareStatement(sql);

            //EXECUTE
            s.execute(sql);

            return true;

        } catch (SQLException e) {
            Logger.getLogger(customerDB.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Edit customer failed");
            return false;
        }
    }
    
    public Boolean deleteData(String id) {
         //SQL STMT
        String sql="DELETE FROM customer WHERE ID ='"+id+"'";

        try {
            //GET COONECTION
            Connection con = KoneksiDB.getKoneksi();

            //STATEMENT
            Statement s=con.prepareStatement(sql);

            //EXECUTE
            s.execute(sql);

            return true;

        }catch(SQLException e) {
            Logger.getLogger(customerDB.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Delete customer failed");
            return false;
        }
    }
}
