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
    
    private String art_cod;
    private String art_nom;
    private String art_uni;
    private int art_pre;
    private int art_stock;
    private String art_marca;
    
    public String EliminarArticulo(){
        
        conexion clase_conexion=new conexion();
        
        String palabra="delete from articulo where art_cod='"+this.getArt_cod()+"'";
        return clase_conexion.Ejecutar(palabra);
    }
    
    public String GrabarArticulo(){
        
        conexion clase_conexion=new conexion();
       
        String palabra="insert into articulo values ('"+this.getArt_cod()+"','"
                +this.getArt_marca()+"','"+this.getArt_nom()+"','"+this.getArt_pre()+"','"+
                this.getArt_stock()+"','"+this.getArt_uni()+"')";
                
                
                
        return clase_conexion.Ejecutar(palabra);
    }
    
    public String EditarArticulo(){
        
        conexion clase_conexion=new conexion();
    
        String palabra="update articulo set art_nom='"+this.getArt_nom()+
                "',art_uni='"+this.getArt_uni()+"',art_pre='"+this.getArt_pre()+
                "',art_stock='"+this.getArt_stock()+"',art_marca='"+
                this.getArt_marca()+"' where art_cod='"+this.getArt_cod()+"'";
        return clase_conexion.Ejecutar(palabra);
                
    }
    
    public ArrayList<Producto> ListaProducto(){
        ArrayList lista_producto = new ArrayList();
        
        try{
            
            conexion clase_conexion=new conexion();
            
            ResultSet tabla=clase_conexion.Listar("select * from articulo;");
            Producto producto;
            
            while(tabla.next()){
                producto = new Producto();
                producto.setArt_cod(tabla.getString("art_cod"));
                producto.setArt_nom(tabla.getString("art_nom"));
                producto.setArt_uni(tabla.getString("art_uni"));
                producto.setArt_pre(tabla.getInt("art_pre"));
                producto.setArt_stock(tabla.getInt("art_stock"));
                producto.setArt_marca(tabla.getString("art_marca"));
                lista_producto.add(producto);
                
            }
                
        }
        catch(SQLException e){
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return lista_producto;
    }
    

    
    
    
    
    
    
    
    
    
    
    public String getArt_cod() {
        return art_cod;
    }

    public void setArt_cod(String art_cod) {
        this.art_cod = art_cod;
    }

    public String getArt_nom() {
        return art_nom;
    }

    public void setArt_nom(String art_nom) {
        this.art_nom = art_nom;
    }

    public String getArt_uni() {
        return art_uni;
    }

    public void setArt_uni(String art_uni) {
        this.art_uni = art_uni;
    }

    public int getArt_pre() {
        return art_pre;
    }

    public void setArt_pre(int art_pre) {
        this.art_pre = art_pre;
    }

    public int getArt_stock() {
        return art_stock;
    }

    public void setArt_stock(int art_stock) {
        this.art_stock = art_stock;
    }

    public String getArt_marca() {
        return art_marca;
    }

    public void setArt_marca(String art_marca) {
        this.art_marca = art_marca;
    }
    
    
    
    
    
}
