package DBHelper;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class cashierDB {
    
    public DefaultTableModel readData() {
        //ADD COLUMNS TO TABLE MODEL
        DefaultTableModel dm = new DefaultTableModel();
        dm.addColumn("ID");
        dm.addColumn("Username");
        dm.addColumn("Password");
        dm.addColumn("Nama");
        dm.addColumn("Umur");
        dm.addColumn("Alamat");
        dm.addColumn("No Telp");

        //SQL STATEMENT
        String sql = "SELECT * FROM cashier";

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
                String username = rs.getString(6);
                String password = rs.getString(7);

                dm.addRow(new String[]{id, username, password, nama, umur, alamat, telp});
            }

            return dm;

        } catch (SQLException e) {
            System.out.println("Fetching Data Failed");
            Logger.getLogger(cashierDB.class.getName()).log(Level.SEVERE, null, e);
        }

        return null;

    }
    
    public Boolean createData(int id, String nama, String umur, String alamat, String telp, String username, String password) {
        //SQL STATEMENT
        String sql = "INSERT INTO cashier(id, nama, umur, alamat, `no telp`, username, password) VALUES ('"+id+"','"+nama+"', '"+umur+"','"+alamat+"','"+telp+"', '"+username+"', '"+password+"')";

        try {
            //GET COONECTION
            Connection con = KoneksiDB.getKoneksi();

            // PREPARED STMT
            Statement s = con.prepareStatement(sql);

            s.execute(sql);

            return true;

        } catch (SQLException e) {
            //Logger.getLogger(productDB.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("add cashier failed");
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }
    
    public Boolean updateData(String id, String nama, String umur, String alamat, String telp, String username, String password) {
        //SQL STMT
        String sql = "UPDATE cashier SET `nama`='"+nama+"', `umur`='"+umur+"', `alamat`='"+alamat+"', `no telp`='"+telp+"',`username`='"+username+"', `password`='"+password+"' WHERE ID='"+id+"'";

        try {
            //GET COONECTION
            Connection con = KoneksiDB.getKoneksi();

            //STATEMENT
            Statement s = con.prepareStatement(sql);

            //EXECUTE
            s.execute(sql);

            return true;

        } catch (SQLException e) {
            Logger.getLogger(cashierDB.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Edit cashier failed");
            return false;
        }
    }
    
    public Boolean deleteData(String id) {
         //SQL STMT
        String sql="DELETE FROM cashier WHERE ID ='"+id+"'";

        try {
            //GET COONECTION
            Connection con = KoneksiDB.getKoneksi();

            //STATEMENT
            Statement s=con.prepareStatement(sql);

            //EXECUTE
            s.execute(sql);

            return true;

        }catch(SQLException e) {
            Logger.getLogger(cashierDB.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Delete cashier failed");
            return false;
        }
    }
}
