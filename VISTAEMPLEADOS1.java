/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.tienda.de.refacciones.Interfaces;

import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import proyecto.tienda.de.refacciones.*;
import proyecto.tienda.de.refacciones.Clases.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author katty
 */
public final class VISTAEMPLEADOS1 extends javax.swing.JFrame {
  Administrativo  admin=new Administrativo(); int sele;
  Vendedor vend=new Vendedor ();ArrayList listaad=new ArrayList<>();static ArrayList listaemp=new ArrayList<>();
  static DefaultTableModel modelo;
    OperaArchivosEmp Opem=new OperaArchivosEmp();
    OperaArchivosAdmin Opad = new OperaArchivosAdmin();TableRowSorter trs;
    private ImageIcon imagen;
    private Icon icono;
    public VISTAEMPLEADOS1() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.setLocationRelativeTo(this);
        this.Imagenzs2(this.jLabel13, "src/Imagenes/IconoElim.png");
        this.Imagenzs2(this.jLabel12, "src/Imagenes/IconoSignoMas.png");
        modelo=(DefaultTableModel) TablaEmp.getModel();
     
        
       Datos(); 
        
    }
   

    
    
    public  void Datos(){
        
        
        listaad=OperaArchivosAdmin.leerArchivoad();
        listaemp=OperaArchivosEmp.leerArchivoem();
        for (Administrativo admin: (ArrayList<Administrativo>)listaad){
            modelo.addRow(new Object []{admin.getNombre()+" "+admin.getApellidoPaterno()+" "+admin.getApellidoMaterno(),
                   admin.getTelefono(),"Administrativo - "+admin.getPuesto(), admin.getSueldo(),admin.getDiasDescanso() ,
                   admin.getUsuario(),admin.getObservaciones()});
           
        }
       for(Vendedor vend:(ArrayList<Vendedor>)listaemp){
                 modelo.addRow(new Object []{vend.getNombre()+" "+vend.getApellidoPaterno()+" "+vend.getApellidoMaterno()
                   ,vend.getTelefono(),"Empleado - "+vend.getPuesto(),vend.getSueldo(),vend.getDiasDescanso() ,
                   vend.getUsuario(),vend.getObservaciones()});
             }
        
        
       
    }
    public void Limpiar(){
        DefaultTableModel modelo=(DefaultTableModel) TablaEmp.getModel();
        int filas=TablaEmp.getRowCount();
        
        for(int i=filas-1;i>=0;i--){
            modelo.removeRow(i);
       }
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaEmp = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtBusc = new javax.swing.JTextField();
        RegresarMen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(131, 209, 149));
        jPanel1.setForeground(new java.awt.Color(153, 153, 255));

        TablaEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Telefono", "Puesto", "Sueldo", "Dias de Descanso", "Usuario", "Observaciones"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaEmp.getTableHeader().setReorderingAllowed(false);
        TablaEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaEmpMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaEmp);

        jPanel3.setBackground(new java.awt.Color(40, 172, 140));

        jLabel1.setFont(new java.awt.Font("Barcade", 0, 60)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EMPLEADOS");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setText("Buscar por Nombre");

        TxtBusc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBuscActionPerformed(evt);
            }
        });
        TxtBusc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtBuscKeyTyped(evt);
            }
        });

        RegresarMen.setBackground(new java.awt.Color(0, 0, 153));
        RegresarMen.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RegresarMen.setForeground(new java.awt.Color(255, 255, 255));
        RegresarMen.setText("Regresar al menu");
        RegresarMen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarMenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(RegresarMen, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(TxtBusc, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtBusc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(RegresarMen, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(392, 392, 392)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 999, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarMenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarMenActionPerformed
        MenuPrincipal m= new MenuPrincipal();
        m.setVisible(true);this.setVisible(false);
    }//GEN-LAST:event_RegresarMenActionPerformed

    private void TxtBuscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBuscActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBuscActionPerformed

    private void TxtBuscKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtBuscKeyTyped
        
        
        TxtBusc.addKeyListener(new KeyAdapter (){
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e); //To change body of generated methods, choose Tools | Templates.
                
                trs.setRowFilter(RowFilter.regexFilter("(?i)"+TxtBusc.getText(), 0));//Se pone el signo de interrogacion 
                //y la i para que no importe si poner una letra mayuscula o minuscula
                
            
            }      
        });
        trs=new TableRowSorter(modelo);
        TablaEmp.setRowSorter(trs);
        
        
        
    }//GEN-LAST:event_TxtBuscKeyTyped

    private void TablaEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaEmpMouseClicked
        
    }//GEN-LAST:event_TablaEmpMouseClicked
    
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
            java.util.logging.Logger.getLogger(VISTAEMPLEADOS1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VISTAEMPLEADOS1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VISTAEMPLEADOS1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VISTAEMPLEADOS1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VISTAEMPLEADOS1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RegresarMen;
    private javax.swing.JTable TablaEmp;
    private javax.swing.JTextField TxtBusc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
