/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.tienda.de.refacciones.Interfaces;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import proyecto.tienda.de.refacciones.*;
import proyecto.tienda.de.refacciones.Clases.*;

public class INVENTARIO extends javax.swing.JFrame {
    static  ArrayList listaLeida = new   ArrayList();
    static DefaultTableModel modelo;int sele;
    ArrayList listaProductos = new ArrayList();
    
    private ImageIcon imagen;
    private Icon icono;
    
    public INVENTARIO() {
        
         
        initComponents();
        this.setLocationRelativeTo(null);
        this.setLocationRelativeTo(this);
        this.Imagenzs(this.BuscarPro, "src/Imagenes/IconoLupa.png");
        this.Imagenzs2(this.jLabel10, "src/Imagenes/IconoElim.png");
        this.Imagenzs2(this.jLabel9, "src/Imagenes/IconoSignoMas.png");
        modelo = (DefaultTableModel)jTablaPro.getModel();
        Datos();
            
    }

    public static void Datos(){
        
      listaLeida = ArchivoProducto.leerArchivo();
      for(Producto producto:(ArrayList<Producto>)listaLeida){
          modelo.addRow(new Object[]{producto.getDisponible(),producto.getCodigo(),producto.getNombreArtic(),producto.getDescripcion()
                  ,producto.getNoArticulos(),producto.getPrecio()});
      
      }
      
    }
    
    public void Limpiar(){
        DefaultTableModel modelo=(DefaultTableModel) jTablaPro.getModel();
        int filas=jTablaPro.getRowCount();
        
        for(int i=filas-1;i>=0;i--){
            modelo.removeRow(i);
       }
    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaPro = new javax.swing.JTable();
        AgregarPro = new javax.swing.JButton();
        VmenuPrin = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BoxDis = new javax.swing.JComboBox<>();
        TxtCod = new javax.swing.JTextField();
        TxtN = new javax.swing.JTextField();
        TxtDes = new javax.swing.JTextField();
        TxtNum = new javax.swing.JTextField();
        TxtPre = new javax.swing.JTextField();
        EditarBton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        EliminarPro = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        JTFBusquedaAR = new javax.swing.JTextField();
        BuscarPro = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(87, 138, 221));

        jTablaPro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTablaPro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Disponible", "Código", "Nombre", "Descripcion", "No Articulos", "Precio "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablaPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaProMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablaPro);

        AgregarPro.setBackground(new java.awt.Color(204, 204, 0));
        AgregarPro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AgregarPro.setText("AGREGAR NUEVO PRODUCTO");
        AgregarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarProActionPerformed(evt);
            }
        });

        VmenuPrin.setBackground(new java.awt.Color(204, 0, 0));
        VmenuPrin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        VmenuPrin.setText("<= Menú Principal");
        VmenuPrin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VmenuPrinActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Disponible:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Codigo:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Nombre del Producto:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Descripción:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Número de Articulos:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Precio:");

        BoxDis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));

        TxtCod.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TxtCod.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtCod.setEnabled(false);

        TxtN.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TxtN.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        TxtDes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TxtDes.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        TxtNum.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TxtNum.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        TxtPre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TxtPre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        EditarBton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EditarBton.setText("Editar");
        EditarBton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarBtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("DATOS DEL PRODUCTO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtDes))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(BoxDis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(EditarBton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtPre, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtN))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(46, 46, 46))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BoxDis, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TxtDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TxtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TxtPre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(EditarBton, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(100, 184, 195));

        jLabel1.setFont(new java.awt.Font("Barcade", 0, 60)); // NOI18N
        jLabel1.setText("INVENTARIO");

        EliminarPro.setBackground(new java.awt.Color(153, 0, 51));
        EliminarPro.setForeground(new java.awt.Color(255, 255, 255));
        EliminarPro.setText("ELIMINAR");
        EliminarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarProActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField1.setText("Ingrese el codigo del Producto");

        BuscarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarProActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(EliminarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(JTFBusquedaAR, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BuscarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EliminarPro, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(8, 8, 8)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BuscarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFBusquedaAR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel9.setText("jLabel9");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VmenuPrin, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(221, 221, 221)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AgregarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(VmenuPrin, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AgregarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VmenuPrinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VmenuPrinActionPerformed
        MenuPrincipal m = new MenuPrincipal();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_VmenuPrinActionPerformed

    private void EliminarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarProActionPerformed
        listaLeida = ArchivoProducto.leerArchivo();
        ArrayList lista=ArchivoArticulosVend.leerArchivoad();
        int resp,fsel,id;
        fsel=jTablaPro.getSelectedRow();
        if(fsel== -1){
        
         JOptionPane.showMessageDialog(null, "Selecione una fila ","Error",JOptionPane.WARNING_MESSAGE);
        }
        else {
            resp=JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar este producto?","Elminar",
                        JOptionPane.YES_NO_OPTION);
            
            if(resp==JOptionPane.YES_OPTION){
                
                id=(int) jTablaPro.getValueAt(fsel, 1);
                
                for(Producto producto:(ArrayList<Producto>)listaLeida){
                    
                    if(producto.getCodigo()==id){
                    
                        listaLeida.remove(producto);
                        ArchivoProducto.crearArchivos(listaLeida);
                        break;
                    }
                }
                for(Producto prod: (ArrayList<Producto>)lista){
                    if(prod.getCodigo()==id){
                        System.out.println("sdf");
                        lista.remove(prod);
                        ArchivoArticulosVend.crearArchivoad(lista);
                        break;
                    }
                }
                JOptionPane.showMessageDialog(null, " Fila eliminada  ");
                modelo.removeRow(jTablaPro.getSelectedRow());
                listaProductos.indexOf(jTablaPro.getSelectedRow());
            }
            
        
        
        
        }
        
        
        
        
    }//GEN-LAST:event_EliminarProActionPerformed

    private void AgregarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarProActionPerformed
       JFrame AgragarPro = new AgregarProducto();
       AgragarPro.setVisible(true);
       this.setVisible(false);
       
    }//GEN-LAST:event_AgregarProActionPerformed

    private void BuscarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarProActionPerformed
        TableRowSorter trsfiltro = new TableRowSorter(jTablaPro.getModel());
        jTablaPro.setRowSorter(trsfiltro);
        trsfiltro.setRowFilter(RowFilter.regexFilter(JTFBusquedaAR.getText(),1));
        
    }//GEN-LAST:event_BuscarProActionPerformed

    private void jTablaProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaProMouseClicked
       sele=jTablaPro.rowAtPoint(evt.getPoint());
       BoxDis.setSelectedItem(jTablaPro.getValueAt(sele, 0));
       TxtCod.setText(""+(int)jTablaPro.getValueAt(sele, 1));
       TxtN.setText((String)jTablaPro.getValueAt(sele, 2));
       TxtDes.setText((String)jTablaPro.getValueAt(sele, 3));
       TxtNum.setText(""+(int)jTablaPro.getValueAt(sele,4));
       TxtPre.setText(""+(float)jTablaPro.getValueAt(sele, 5));
       
       
       
       
    }//GEN-LAST:event_jTablaProMouseClicked

    private void EditarBtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarBtonActionPerformed
        ArrayList listamod =new ArrayList<>();
        for(Producto producto:(ArrayList<Producto>)listaLeida){
          if(producto.getCodigo()==(Integer.parseInt(TxtCod.getText()))){
              producto.setDisponible((String)BoxDis.getSelectedItem());
              producto.setNombreArtic(TxtN.getText());
              producto.setDescripcion(TxtDes.getText());
              producto.setNoArticulos(Integer.parseInt(TxtNum.getText()));
              producto.setPrecio(Float.parseFloat(TxtPre.getText()));
          }
            listamod.add(producto);
            
            
      }
        
      ArchivoProducto.ModificarTabla(listamod);
      Limpiar();
      Datos();
    }//GEN-LAST:event_EditarBtonActionPerformed

    private void Imagenzs(JButton jLabel2,String ruta){
        this.imagen =new ImageIcon(ruta);
        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(jLabel2.getWidth(),jLabel2.getHeight(), Image.SCALE_DEFAULT));
        jLabel2.setIcon(this.icono);
        this.repaint();
    }
    private void Imagenzs2(JLabel jLabel2,String ruta){
        this.imagen =new ImageIcon(ruta);
        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(jLabel2.getWidth(),jLabel2.getHeight(), Image.SCALE_DEFAULT));
        jLabel2.setIcon(this.icono);
        this.repaint();
    }

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
            java.util.logging.Logger.getLogger(INVENTARIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(INVENTARIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(INVENTARIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(INVENTARIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new INVENTARIO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarPro;
    private javax.swing.JComboBox<String> BoxDis;
    private javax.swing.JButton BuscarPro;
    private javax.swing.JButton EditarBton;
    private javax.swing.JButton EliminarPro;
    private javax.swing.JTextField JTFBusquedaAR;
    private javax.swing.JTextField TxtCod;
    private javax.swing.JTextField TxtDes;
    private javax.swing.JTextField TxtN;
    private javax.swing.JTextField TxtNum;
    private javax.swing.JTextField TxtPre;
    private javax.swing.JButton VmenuPrin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTablaPro;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
