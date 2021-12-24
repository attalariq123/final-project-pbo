package DBHelper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class productDB {
    
    public DefaultTableModel getData() {
        //ADD COLUMNS TO TABLE MODEL
        DefaultTableModel dm = new DefaultTableModel();
        dm.addColumn("ID");
        dm.addColumn("Nama");
        dm.addColumn("Harga");
        dm.addColumn("Kuantitas");
        dm.addColumn("Deskripsi");
        dm.addColumn("Kategori");

        //SQL STATEMENT
        String sql = "SELECT * FROM produk";

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
                String harga = rs.getString(3);
                String kuantitas = rs.getString(4);
                String deskripsi = rs.getString(5);
                String kategori = rs.getString(6);

                dm.addRow(new String[]{id, nama, harga, kuantitas, deskripsi, kategori});
            }

            return dm;

        } catch (SQLException e) {
            System.out.println("Fetching Data Failed");
            Logger.getLogger(productDB.class.getName()).log(Level.SEVERE, null, e);
        }

        return null;

    }
    
    public Boolean add(int id, String nama, String harga, int kuantitas, String deskripsi, String kategori) {
        //SQL STATEMENT
        String sql = "INSERT INTO produk(id, nama, harga, kuantitas, deskripsi, kategori) VALUES ('"+id+"','"+nama+"', '"+harga+"','"+kuantitas+"','"+deskripsi+"','"+kategori+"')";

        try {
            //GET COONECTION
            Connection con = KoneksiDB.getKoneksi();

            // PREPARED STMT
            Statement s = con.prepareStatement(sql);

            s.execute(sql);

            return true;

        } catch (SQLException e) {
            Logger.getLogger(productDB.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("add product failed");
        }
        return false;
    }
    
    public Boolean update(String id, String nama, String harga, int kuantitas, String deskripsi, String kategori) {
        //SQL STMT
        String sql = "UPDATE produk SET `nama`='"+nama+"', `harga`='"+harga+"', `kuantitas`='"+kuantitas+"', `deskripsi`='"+deskripsi+"', `kategori`='"+kategori+"' WHERE ID='"+id+"'";

        try {
            //GET COONECTION
            Connection con = KoneksiDB.getKoneksi();

            //STATEMENT
            Statement s = con.prepareStatement(sql);

            //EXECUTE
            s.execute(sql);

            return true;

        } catch (SQLException e) {
            Logger.getLogger(productDB.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Edit product failed");
            return false;
        }
    }
    
    public Boolean delete(String id) {
         //SQL STMT
        String sql="DELETE FROM produk WHERE ID ='"+id+"'";

        try {
            //GET COONECTION
            Connection con = KoneksiDB.getKoneksi();

            //STATEMENT
            Statement s=con.prepareStatement(sql);

            //EXECUTE
            s.execute(sql);

            return true;

        }catch(SQLException e) {
            Logger.getLogger(productDB.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Delete product failed");
            return false;
        }
    }
}
