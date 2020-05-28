/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Conexiones.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoDao {
    Connection con;
    Conexion cn = new Conexion();
    private PreparedStatement ps;
    private ResultSet rs;
    
    public List  listar(){
        List<Producto> productos = new ArrayList();
        String sql="call selectProductos()";
        try {
            con=cn.getConnection();
            ps=con.prepareCall(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Producto p=new Producto();
                p.setCodigo(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setDescripcion(rs.getString(3));
                p.setPrecio(rs.getDouble(4));
                p.setCategoria(rs.getString(5));
                p.setStock(rs.getInt(6));
                p.setImagen(rs.getString(7));
                productos.add(p);
            }
        } catch (Exception e) {
        }
        
        return productos;
    }
    
    
    public Producto listarcodigo(int codigo){
        String sql="call agregarCarrito ("+codigo+")";
        Producto p = new Producto();
        try {
            con=cn.getConnection();
            ps=con.prepareCall(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                p.setCodigo(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setDescripcion(rs.getString(3));
                p.setPrecio(rs.getDouble(4));
                p.setCategoria(rs.getString(5));
                p.setStock(rs.getInt(6));
                p.setImagen(rs.getString(7));
                
            }
        } catch (Exception e) {
        }
            
        return p;
    }
    
}
