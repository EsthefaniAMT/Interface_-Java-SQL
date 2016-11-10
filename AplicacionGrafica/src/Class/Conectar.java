/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Esthefani Machado
 */
public class Conectar {

    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "31415";
    private static final String url = "jdbc:mysql://localhost:3306/db_juser";
    
    public Conectar() {
        conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,password);
            if (conn!=null){
                System.out.println("Conexion exitosa");
            }
            
        } catch (ClassNotFoundException | SQLException e){
                System.out.println ("error de conexion " + e);
          }
        
    }
    
    public Connection getConnection(){
        return conn;
    }
    
    public void desconectar(){
        conn = null;
        if (conn == null)
            System.out.println("Conexion Terminada...");
    }
    
        
}
