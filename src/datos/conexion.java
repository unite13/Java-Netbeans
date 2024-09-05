/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
import java.sql.*;

/**
 *
 * @author wsteb
 */
public class conexion {
    private final String url="jdbc:mysql://localhost:3306/ventas"; 
    private final String user="root";
    private final String pass="";
    
    public conexion(){
        

    }
    
    public ResultSet Listar(String cad){
        
        try
        {
            Connection cn = DriverManager.getConnection(url,user,pass);
            PreparedStatement da = cn.prepareStatement(cad);
            ResultSet tbl= da.executeQuery();
            return tbl;
        }
        catch(SQLException e){
            javax.swing.JOptionPane.showMessageDialog(null,e.getMessage());
            return null;
        }   
        
        
    }
    
    public String Ejecutar (String cad){
        try{
            Connection cn = DriverManager.getConnection(url,user,pass);
            PreparedStatement da = cn.prepareStatement(cad);
            int r = da.executeUpdate();
            return "Se afectaron "+ r + " filas";
        }
        catch(SQLException e){
            javax.swing.JOptionPane.showMessageDialog(null,e.getMessage());
            return "Error "+e.getMessage();
            
        }
    }
    
    
}


