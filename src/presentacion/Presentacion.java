/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;
import negocios.Producto;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wsteb
 */
public class Presentacion extends javax.swing.JFrame {

    /**
     * Creates new form Presentacion
     */
    public Presentacion() {
        initComponents();
        this.setSize(1100,600);
        ListarArticulos();
        
        grabar.setEnabled(false);
        
        
        
    }
    public void ListarArticulos(){
        DefaultTableModel tabla=new DefaultTableModel();
        Producto producto=new Producto();
        ArrayList<Producto> lista_auxiliar_de_productos=new ArrayList();
        lista_auxiliar_de_productos=producto.ListaProducto();
        tabla.addColumn("Codigo");
        tabla.addColumn("Nombre");
        tabla.addColumn("Unidad");
        tabla.addColumn("Precio");
        tabla.addColumn("Stock");
        tabla.addColumn("Marca");
        System.out.println(lista_auxiliar_de_productos.size());
        
        tabla.setRowCount(lista_auxiliar_de_productos.size());
        int i=0;
        for(Producto producto_aux: lista_auxiliar_de_productos){
            tabla.setValueAt(producto_aux.getPro_cod(), i,0);
            tabla.setValueAt(producto_aux.getPro_nom(), i,1);
            tabla.setValueAt(producto_aux.getPro_uni(), i,2);
            tabla.setValueAt(producto_aux.getPro_pre(), i,3);
            tabla.setValueAt(producto_aux.getPro_stock(), i,4);
            tabla.setValueAt(producto_aux.getPro_marca(), i,5);
            i++;
        }
        this.jTable1.setModel(tabla);
        
    }
    
    public void LimpiarCajas(){
        this.codigo.setText("");
        this.nombre.setText("");
        this.unidad.setText("");
        this.precio.setText("");
        this.cantidad.setText("");
        this.marca.setText("");
        
        
        
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        precio = new javax.swing.JTextField();
        unidad = new javax.swing.JTextField();
        cantidad = new javax.swing.JTextField();
        marca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        nuevo = new javax.swing.JButton();
        grabar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel1.setText("Codigo");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel3.setText("Unidad");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel4.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel5.setText("Marca");

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel6.setText("Precio");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel7.setText("Cantidad");

        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });

        marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable1MouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        nuevo.setText("Nuevo");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        grabar.setText("Grabar");
        grabar.setEnabled(true);
        grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grabarActionPerformed(evt);
            }
        });

        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nuevo)
                        .addGap(35, 35, 35)
                        .addComponent(grabar)
                        .addGap(27, 27, 27)
                        .addComponent(modificar)
                        .addGap(26, 26, 26)
                        .addComponent(eliminar)
                        .addGap(29, 29, 29)
                        .addComponent(salir)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unidad, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(unidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevo)
                    .addComponent(grabar)
                    .addComponent(modificar)
                    .addComponent(eliminar)
                    .addComponent(salir))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marcaActionPerformed

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        // TODO add your handling code here:
        LimpiarCajas();
        grabar.setEnabled(true);
    }//GEN-LAST:event_nuevoActionPerformed

    private void grabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grabarActionPerformed
        // TODO add your handling code here:
        Producto producto_auxiliar=new Producto();
        // Checkear que no este vacio los datos
        ArrayList<JTextField> lista=new ArrayList<>();
        lista.add(this.codigo);
        lista.add(this.nombre);
        lista.add(this.unidad);
        lista.add(this.precio);
        lista.add(this.cantidad);
        lista.add(this.marca);
        String checkear;
        boolean esta_vacio=false;
        for(JTextField texto: lista){
            checkear=texto.getText();
            if (checkear.isEmpty()){
                esta_vacio=true;
            }
            
        }
        if (!esta_vacio){
            
            producto_auxiliar.setPro_cod(this.codigo.getText());
            producto_auxiliar.setPro_nom(this.nombre.getText());
            producto_auxiliar.setPro_uni(this.unidad.getText());
            producto_auxiliar.setPro_pre(Integer.parseInt(this.precio.getText()));
            producto_auxiliar.setPro_stock(Integer.parseInt(this.cantidad.getText()));
            producto_auxiliar.setPro_marca(this.marca.getText());
            JOptionPane.showMessageDialog(null, producto_auxiliar.GrabarProducto());
            ListarArticulos();
            
        }else{
            JOptionPane.showMessageDialog(null, "Hay campos de informacion vacios");
            
        }
        
    }//GEN-LAST:event_grabarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        // TODO add your handling code here:
        
        String getCod=this.codigo.getText();
        boolean codigo_invalid=true;
        for (int i=0; i<jTable1.getRowCount(); i++){
            String code=jTable1.getValueAt(i,0).toString();
            if (code.equals(code)){
                codigo_invalid=false;
                
            }
        }
        
        ArrayList<JTextField> lista=new ArrayList<>();
        lista.add(this.codigo);
        lista.add(this.nombre);
        lista.add(this.unidad);
        lista.add(this.precio);
        lista.add(this.cantidad);
        lista.add(this.marca);
        String checkear;
        boolean esta_vacio=false;
        for(JTextField texto: lista){
            checkear=texto.getText();
            if (checkear.isEmpty()){
                esta_vacio=true;
            }
            
        }
        if(esta_vacio || codigo_invalid){
            JOptionPane.showMessageDialog(null, "Hay campos de informacion vacios / Codigo de articulo invalido");
            
        }else{
            Producto producto_auxiliar=new Producto();
            producto_auxiliar.setPro_cod(codigo.getText());
            producto_auxiliar.setPro_nom(nombre.getText());
            producto_auxiliar.setPro_uni(unidad.getText());
            producto_auxiliar.setPro_pre(Integer.parseInt(precio.getText()));
            producto_auxiliar.setPro_stock(Integer.parseInt(cantidad.getText()));
            producto_auxiliar.setPro_marca(marca.getText());
            JOptionPane.showMessageDialog(null, producto_auxiliar.EditarProducto());
            ListarArticulos();
        }
            
         
        
    }//GEN-LAST:event_modificarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
        int Res=JOptionPane.showConfirmDialog(null, "Estas seguro de eliminar el Aritculo"+this.codigo.getText()+" ?");
        //Chekear que el codigo del articulo existe en la base de datos
        String cod=this.codigo.getText();
        boolean codigo_invalido=true;
        for(int i = 0; i<jTable1.getRowCount();i++){
            String code=jTable1.getValueAt(i,0).toString();
            if (cod.equals(code)){
                codigo_invalido=false;
            }
            
        }
        if (Res==0){
            Producto producto_auxiliar=new Producto();
            producto_auxiliar.setPro_cod(this.codigo.getText());
            JOptionPane.showMessageDialog(null, producto_auxiliar.EliminarProducto());
            ListarArticulos();
            
            if (cod.isEmpty() || codigo_invalido){
                JOptionPane.showMessageDialog(null, "No se elimino ningun articulo / No existe tal articulo");
            }else{
                JOptionPane.showMessageDialog(null, "Articulo Eliminado");
                LimpiarCajas();
            }
            
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        int r=JOptionPane.showConfirmDialog(null,"Estas seguro?");
        if (r==0){
            System.exit(0);
        }
    }//GEN-LAST:event_salirActionPerformed

    private void jTable1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseEntered
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jTable1MouseEntered

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int rec= this.jTable1.getSelectedRow();
        
        this.codigo.setText(jTable1.getValueAt(rec,0).toString());
        this.nombre.setText(jTable1.getValueAt(rec,1).toString());
        this.unidad.setText(jTable1.getValueAt(rec,2).toString());
        this.precio.setText(jTable1.getValueAt(rec,3).toString());
        this.cantidad.setText(jTable1.getValueAt(rec,4).toString());
        this.marca.setText(jTable1.getValueAt(rec,5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Presentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Presentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Presentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Presentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Presentacion().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField cantidad;
    public javax.swing.JTextField codigo;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton grabar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public javax.swing.JTextField marca;
    private javax.swing.JButton modificar;
    public javax.swing.JTextField nombre;
    private javax.swing.JButton nuevo;
    public javax.swing.JTextField precio;
    private javax.swing.JButton salir;
    public javax.swing.JTextField unidad;
    // End of variables declaration//GEN-END:variables
}
