package DBHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class KoneksiDB {
    private static Connection koneksi;
    
    public static Connection getKoneksi() throws SQLException {
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/inventory";
                String user = "root";
                String pass = "";
                
                koneksi = DriverManager.getConnection(url, user, pass);
                System.out.println("Koneksi Berhasil...");
            } catch(SQLException ex) {
                Logger.getLogger(KoneksiDB.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "No Database Connection");
                System.out.println("Koneksi Gagal");
            }
        }
        return koneksi;
    }
    
}
