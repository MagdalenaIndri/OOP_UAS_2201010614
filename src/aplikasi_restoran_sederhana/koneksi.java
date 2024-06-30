/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasi_restoran_sederhana;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author indri
 */
public class koneksi {
    private String url="jdbc:mysql://localhost/restoran";
    private String username_xampp = "root";
    private String password_xampp = "";
    private Connection con;
    
    
    public void connect(){
        try{
            con = DriverManager.getConnection(url, username_xampp, password_xampp);
            System.out.println("Koneksi berhasil");
        } catch (SQLException e ){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public Connection getCon() {
        return con;
    }
    
}
