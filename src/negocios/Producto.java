/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocios;
import java.util.*;
import java.sql.*;
import datos.conexion;
/**
 *
 * @author wsteb
 */
public class Producto {
    
    private String pro_cod;
    private String pro_nom;
    private String pro_uni;
    private int pro_pre;
    private int pro_stock;
    private String pro_marca;
    
    public String EliminarProducto(){
        
        conexion clase_conexion = new conexion();
        
        String palabra = "delete from productos where pro_cod='" + this.getPro_cod() + "'";
        return clase_conexion.Ejecutar(palabra);
    }
    
    public String GrabarProducto(){
        
        conexion clase_conexion = new conexion();
       
        String palabra = "insert into productos values ('" + this.getPro_cod() + "','"
                + this.getPro_marca() + "','" + this.getPro_nom() + "','" + this.getPro_pre() + "','"
                + this.getPro_stock() + "','" + this.getPro_uni() + "')";
                
        return clase_conexion.Ejecutar(palabra);
    }
    
    public String EditarProducto(){
        
        conexion clase_conexion = new conexion();
    
        String palabra = "update productos set pro_nom='" + this.getPro_nom() +
                "',pro_uni='" + this.getPro_uni() + "',pro_pre='" + this.getPro_pre() +
                "',pro_stock='" + this.getPro_stock() + "',pro_marca='"
                + this.getPro_marca() + "' where pro_cod='" + this.getPro_cod() + "'";
        return clase_conexion.Ejecutar(palabra);
                
    }
    
    public ArrayList<Producto> ListaProducto(){
        ArrayList lista_producto = new ArrayList();
        
        try{
            
            conexion clase_conexion = new conexion();
            
            ResultSet tabla = clase_conexion.Listar("select * from productos;");
            Producto producto;
            
            while(tabla.next()){
                producto = new Producto();
                producto.setPro_cod(tabla.getString("pro_cod"));
                producto.setPro_nom(tabla.getString("pro_nom"));
                producto.setPro_uni(tabla.getString("pro_uni"));
                producto.setPro_pre(tabla.getInt("pro_pre"));
                producto.setPro_stock(tabla.getInt("pro_stock"));
                producto.setPro_marca(tabla.getString("pro_marca"));
                lista_producto.add(producto);
                
            }
                
        }
        catch(SQLException e){
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return lista_producto;
    }
    
    public String getPro_cod() {
        return pro_cod;
    }

    public void setPro_cod(String pro_cod) {
        this.pro_cod = pro_cod;
    }

    public String getPro_nom() {
        return pro_nom;
    }

    public void setPro_nom(String pro_nom) {
        this.pro_nom = pro_nom;
    }

    public String getPro_uni() {
        return pro_uni;
    }

    public void setPro_uni(String pro_uni) {
        this.pro_uni = pro_uni;
    }

    public int getPro_pre() {
        return pro_pre;
    }

    public void setPro_pre(int pro_pre) {
        this.pro_pre = pro_pre;
    }

    public int getPro_stock() {
        return pro_stock;
    }

    public void setPro_stock(int pro_stock) {
        this.pro_stock = pro_stock;
    }

    public String getPro_marca() {
        return pro_marca;
    }

    public void setPro_marca(String pro_marca) {
        this.pro_marca = pro_marca;
    }
    
    
    
}