/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DRIVER;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author attal
 */
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
                System.out.println("Koneksi Gagal");
            }
        }
        return koneksi;
    }
    
}
