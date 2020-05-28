/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexiones;

import java.sql.*;

public class Conexion {
    
    public Connection getConnection(){
        Connection cn = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/bdcarrito?autoReconnect=true&useSSL=false","root","jhojan1698");
            System.out.print("Conexion satisfacoria");
        } catch (Exception e) {
            System.out.print("Error de conexion: "+e); 
        }
        return cn;
    }
    
}
