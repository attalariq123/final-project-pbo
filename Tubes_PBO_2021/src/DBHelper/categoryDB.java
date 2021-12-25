package DBHelper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class categoryDB {
    
    public DefaultTableModel getData() {
        //ADD COLUMNS TO TABLE MODEL
        DefaultTableModel dm = new DefaultTableModel();
        dm.addColumn("ID");
        dm.addColumn("Nama");

        //SQL STATEMENT
        String sql = "SELECT * FROM `kategori produk`";

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

                dm.addRow(new String[]{id, nama});
            }

            return dm;

        } catch (SQLException e) {
            System.out.println("Fetching Data Failed");
            Logger.getLogger(categoryDB.class.getName()).log(Level.SEVERE, null, e);
        }

        return null;

    }
    
    public Boolean add(int id, String nama) {
        //SQL STATEMENT
        String sql = "INSERT INTO `kategori produk`(id, nama) VALUES ('"+id+"','"+nama+"')";

        try {
            //GET COONECTION
            Connection con = KoneksiDB.getKoneksi();

            // PREPARED STMT
            Statement s = con.prepareStatement(sql);

            s.execute(sql);

            return true;

        } catch (SQLException e) {
            Logger.getLogger(categoryDB.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("add category failed");
        }
        return false;
    }
    
    public Boolean update(String id, String nama) {
        //SQL STMT
        String sql = "UPDATE `kategori produk` SET `nama`='"+nama+"' WHERE ID='"+id+"'";

        try {
            //GET COONECTION
            Connection con = KoneksiDB.getKoneksi();

            //STATEMENT
            Statement s = con.prepareStatement(sql);

            //EXECUTE
            s.execute(sql);

            return true;

        } catch (SQLException e) {
            Logger.getLogger(categoryDB.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Edit category failed");
            return false;
        }
    }
    
    public Boolean delete(String id) {
         //SQL STMT
        String sql="DELETE FROM `kategori produk` WHERE ID ='"+id+"'";

        try {
            //GET COONECTION
            Connection con = KoneksiDB.getKoneksi();

            //STATEMENT
            Statement s=con.prepareStatement(sql);

            //EXECUTE
            s.execute(sql);

            return true;

        }catch(SQLException e) {
            Logger.getLogger(categoryDB.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Delete category failed");
            return false;
        }
    }
}
