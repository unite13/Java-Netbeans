/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocios;
import java.time.LocalDate;
import java.util.*;
import datos.conexion;
import java.sql.*;


/**
 *
 * @author wsteb
 */
public class Insumos {
    
    private String nombre;
    private int cantidad;
    private String medida; 
    private int precio_por_unidad;
    private String codigo;
    private LocalDate fecha_adquision;
    
    public String EliminarArticulo(){
        conexion clase_conexion=new conexion();
        
        String palabra="delete from insumos where INS_CODI='"+this.getCodigo()+"'";
        return clase_conexion.Ejecutar(palabra);
    }
    
    public String GrabarArticulo(){
        
        conexion clase_conexion=new conexion();
     
        String palabra="insert into insumos values ('"+this.getNombre()+"','"
                +this.getCantidad()+"','"+this.getMedida()+"','"+this.getPrecio_por_unidad()+"','"+
                this.getFecha_adquision()+"','"+this.getCodigo()+"')";
              
                
                
        return clase_conexion.Ejecutar(palabra);
    }
    
    
    public String EditarArticulo(){
        
        conexion clase_conexion=new conexion();
    
        String palabra="update insumos set INS_NOMB='"+this.getNombre()+
                "',INS_CANT='"+this.getCantidad()+"',INS_MEDIDA='"+this.getMedida()+
                "',INS_PRE_UNI='"+this.getPrecio_por_unidad()+"',INS_FECHA='"+
                this.getFecha_adquision()+"' where INS_CODI='"+this.getCodigo()+"'";
        return clase_conexion.Ejecutar(palabra);
                
    }
    
    public ArrayList<Insumos> ListaProducto(){
        ArrayList lista_insumos = new ArrayList();
        
        try{
            
            conexion clase_conexion=new conexion();
            
            ResultSet tabla=clase_conexion.Listar("select * from insumos;");
            Insumos insumos;
            
            while(tabla.next()){
                Insumos = new Insumos();
                Insumos.setArt_cod(tabla.getString("art_cod"));
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
    
    
    
    
    
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public int getPrecio_por_unidad() {
        return precio_por_unidad;
    }

    public void setPrecio_por_unidad(int precio_por_unidad) {
        this.precio_por_unidad = precio_por_unidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFecha_adquision() {
        return fecha_adquision;
    }

    public void setFecha_adquision(LocalDate fecha_adquision) {
        this.fecha_adquision = fecha_adquision;
    }
    
    
}


