/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Configuracion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Segundo
 */
public class Conexion {
    Connection con;
    String url="jdbc:mysql://localhost:3306/KyS";
    String usuario="root";
    String contraseña="jhojan1698";
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,usuario,contraseña);
        } catch (Exception e) {
        }
        
        return con;
}

    
}
