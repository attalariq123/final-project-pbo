package DBHelper;

import MODEL.CategoryModel;
import MODEL.ProductModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class productDB {
    
    public DefaultTableModel readData() {
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
    
    public Boolean createData(ProductModel model) {
        
        int id = model.getId();
        String nama = model.getNama();
        String harga = model.getHarga();
        int kuantitas = model.getKuantitas();
        String deskripsi = model.getDeskripsi();
        CategoryModel cat = model.getKategori();
        String kategori = cat.getNama_kategori();
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
            //Logger.getLogger(productDB.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("add product failed");
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }
    
    public Boolean updateData(ProductModel model, String id) {
        
        String nama = model.getNama();
        int kuantitas = model.getKuantitas();
        String harga = model.getHarga();
        String deskripsi = model.getDeskripsi();
        CategoryModel cat = model.getKategori();
        String kategori = cat.getNama_kategori();
        
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
    
    public Boolean updateQty(int qtyNew, int qtyOld, String id) {
        int qty = qtyNew;
        int qty_lama = qtyOld;
        int kuantitas = qty_lama - qty;
        String sql;
        
        if (qty > qty_lama || qty <= 0) {
            JOptionPane.showMessageDialog(null, "Stok Produk Tidak Tersedia");
            return false;
        } else {
            System.out.println(qty);
            sql = "UPDATE `produk` SET `kuantitas` = '"+kuantitas+"' WHERE `produk`.`id` = '"+id+"'";
        }
        
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
            System.out.println("Edit quantity failed");
            return false;
        }
    }
    
    public Boolean deleteData(String id) {
         //SQL STMT
        String sql="DELETE FROM produk WHERE id ='"+id+"'";

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
