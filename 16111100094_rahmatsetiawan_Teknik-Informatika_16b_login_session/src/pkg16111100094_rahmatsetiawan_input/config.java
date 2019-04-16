/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg16111100094_rahmatsetiawan_input;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class config {
    private static Connection mysqlconfig;
    public static Connection configDB() throws SQLException {
        try {
            String url="jdbc:mysql://localhost:3306/koneksi";
            String user="root";
            String pass ="";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);
            } catch (Exception e){
                System.err.println("koneksi gagal brow"+ e.getMessage());
            }
        return mysqlconfig;
    }
}
