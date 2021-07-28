package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;

public class Koneksi {

    public static Connection conn;
    public static Connection GetConnection() {
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conn = DriverManager.getConnection("jdbc:mysql://localhost/Listrik_rev2", "root" , "");
            System.out.println("koneksi berhasil");
        } catch (Exception e) {
            System.out.println("koneksi gagal");
            System.out.println(e.getMessage());
        }
        return conn;
    }    
    public static void main(String[] args) {
        GetConnection();
    }
}