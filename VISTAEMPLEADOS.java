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

import javax.swing.JOptionPane;
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
public final class VISTAEMPLEADOS extends javax.swing.JFrame {
  Administrativo  admin=new Administrativo(); int sele;
  Vendedor vend=new Vendedor ();ArrayList listaad=new ArrayList<>();static ArrayList listaemp=new ArrayList<>();
  static DefaultTableModel modelo;
    OperaArchivosEmp Opem=new OperaArchivosEmp();
    OperaArchivosAdmin Opad = new OperaArchivosAdmin();TableRowSorter trs;
    private ImageIcon imagen;
    private Icon icono;
    public VISTAEMPLEADOS() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.setLocationRelativeTo(this);
        this.Imagenzs2(this.jLabel13, "src/Imagenes/IconoElim.png");
        this.Imagenzs2(this.jLabel12, "src/Imagenes/IconoSignoMas.png");
        modelo=(DefaultTableModel) TablaEmp.getModel();
     
        
       Datos(); 
        
    }
   

    public void valueChanged(ListSelectionEvent e) {
        System.out.println("si");
        int fsel=TablaEmp.getSelectedRow();String [] n;
        String NombreComp=(String) TablaEmp.getValueAt(fsel, 0);
        n=NombreComp.split("\\s+");
        TxtNom.setText(n[0]);TxtAP.setText(n[1]);TxtAM.setText(n[2]);
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
        AgregarOpcion = new javax.swing.JButton();
        RegresarMen = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaEmp = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        TxtNom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TxtAP = new javax.swing.JTextField();
        TxtAM = new javax.swing.JTextField();
        TxtTel = new javax.swing.JTextField();
        TxtTipo = new javax.swing.JTextField();
        TxtPuest = new javax.swing.JTextField();
        TxtSuel = new javax.swing.JTextField();
        Spinnerd = new javax.swing.JSpinner();
        TxtObs = new javax.swing.JTextField();
        Editar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        BotonEliminar = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtBusc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(131, 209, 149));
        jPanel1.setForeground(new java.awt.Color(153, 153, 255));

        AgregarOpcion.setFont(new java.awt.Font("Momcake", 1, 24)); // NOI18N
        AgregarOpcion.setText("Agregar Empleados");
        AgregarOpcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarOpcionActionPerformed(evt);
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

        TxtNom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TxtNom.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Telefono:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Puesto:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Sueldo: $");
        jLabel6.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Dias de descanso:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Observaciones:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Apellido Paterno:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Apellido Materno:");

        TxtAP.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        TxtAM.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TxtAM.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        TxtTel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TxtTel.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        TxtTipo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TxtTipo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtTipo.setEnabled(false);

        TxtPuest.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TxtPuest.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        TxtSuel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TxtSuel.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Editar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel11.setText("DATOS DEL EMPLEADO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(TxtSuel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(TxtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxtPuest, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Editar)
                                    .addComponent(TxtObs, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel6))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Spinnerd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TxtAM))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TxtAP, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TxtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel11)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TxtAP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TxtAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TxtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtPuest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TxtSuel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Spinnerd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TxtObs, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(Editar)
                .addGap(41, 41, 41))
        );

        jPanel3.setBackground(new java.awt.Color(40, 172, 140));

        BotonEliminar.setBackground(new java.awt.Color(204, 0, 0));
        BotonEliminar.setFont(new java.awt.Font("Momcake", 1, 18)); // NOI18N
        BotonEliminar.setText("Eliminar Empleado");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(BotonEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtBusc, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtBusc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
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
                                .addGap(26, 26, 26)
                                .addComponent(RegresarMen, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(212, 212, 212)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AgregarOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RegresarMen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AgregarOpcion, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarOpcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarOpcionActionPerformed
        AgregarEmp n=new AgregarEmp();
        n.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AgregarOpcionActionPerformed

    private void RegresarMenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarMenActionPerformed
        MenuPrincipal m= new MenuPrincipal();
        m.setVisible(true);this.setVisible(false);
    }//GEN-LAST:event_RegresarMenActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
     
        int fsel,resp,fil;String id,nom,nom2[],nomemp,nomemp2[];
        listaad=OperaArchivosAdmin.leerArchivoad();
        listaemp=OperaArchivosEmp.leerArchivoem();
        try{
            fsel =  TablaEmp.getSelectedRow();
            if(fsel==-1){
                JOptionPane.showMessageDialog(null, "Debe Seleccionar el producto a eliminar","Advertencia",JOptionPane.WARNING_MESSAGE);
  
            }else{
                resp=JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar a este empleado?","Elminar",
                        JOptionPane.YES_NO_OPTION);
                if(resp==JOptionPane.YES_OPTION){
                    id=TablaEmp.getValueAt(fsel, 5).toString().substring(0, 5);//Se obtiene el tipo de Usuario
                    
                    if("Admin".equals(id)){
                        
                        for (Administrativo admin: (ArrayList<Administrativo>)listaad){
                            nom=(String) TablaEmp.getValueAt(fsel, 0);
                            nom2=nom.split(" ");
                            
                            if(admin.getNombre().equals(nom2[0])) {
                                
                                listaad.remove(admin);
                                
                                OperaArchivosAdmin.crearArchivoad(listaad);
                                
                                break;
                            }  
                        }
    
                    }else{
                        for(Vendedor vend:(ArrayList<Vendedor>)listaemp){
                            nomemp=(String)TablaEmp.getValueAt(fsel, 0);
                            nomemp2=nomemp.split(" ");
                            if(vend.getNombre().equals(nomemp2[0])){
                                listaemp.remove(vend);
                                
                                OperaArchivosEmp.crearArchivoem(listaemp);
                                
                                break;
                            }
                        }
                    }
                    
                    
                    modelo=(DefaultTableModel)TablaEmp.getModel();
                    
                    modelo.removeRow(fsel);
                }
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se realizo la eliminacion del producto,verifique","Error"
                    ,JOptionPane.ERROR_MESSAGE);
            
        }
        
        
        
        
    }//GEN-LAST:event_BotonEliminarActionPerformed

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

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
         
        ArrayList listamod =new ArrayList<>();
        String id=TablaEmp.getValueAt(sele, 5).toString().substring(0, 5);//Se obtiene el tipo de Usuario
                    
        if("Admin".equals(id)){

            for (Administrativo admin: (ArrayList<Administrativo>)listaad){
                
                
                if(admin.getUsuario().equals(TablaEmp.getValueAt(sele, 5))){
                    admin.setNombre(TxtNom.getText());
                    admin.setApellidoPaterno(TxtAP.getText());
                    admin.setApellidoMaterno(TxtAM.getText());
                    admin.setTelefono(Integer.parseInt(TxtTel.getText()));
                    admin.setPuesto(TxtPuest.getText()  );
                    admin.setSueldo(Float.parseFloat(TxtSuel.getText()));
                    admin.setDiasDescanso(Integer.parseInt(Spinnerd.getValue().toString()));
                    admin.setObservaciones(TxtObs.getText());
                }
                
                listamod.add(admin);
            }
              OperaArchivosAdmin.Modificar(listamod);  
        }else{
            for(Vendedor vend:(ArrayList<Vendedor>)listaemp){
                if(vend.getUsuario().equals(TablaEmp.getValueAt(sele, 5))){
                    vend.setNombre(TxtNom.getText());
                    vend.setApellidoPaterno(TxtAP.getText());
                    vend.setApellidoMaterno(TxtAM.getText());
                    vend.setTelefono(Integer.parseInt(TxtTel.getText()));
                    vend.setPuesto(TxtPuest.getText()  );
                    vend.setSueldo(Float.parseFloat(TxtSuel.getText()));
                    vend.setDiasDescanso(Integer.parseInt(Spinnerd.getValue().toString()));
                    vend.setObservaciones(TxtObs.getText());
                }
                listamod.add(vend);
            }
            OperaArchivosEmp.Modificar(listamod);
        }
        Limpiar();
        Datos();
    
        
    }//GEN-LAST:event_EditarActionPerformed

    private void TablaEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaEmpMouseClicked
        sele=TablaEmp.rowAtPoint(evt.getPoint());
        System.out.println("sele"+sele);
        System.out.println("si");
        String [] n;String [] p;
        String NombreComp=(String) TablaEmp.getValueAt(sele, 0);
        String Puesto=(String)TablaEmp.getValueAt(sele, 2);
        
        n=NombreComp.split("\\s+"); p=Puesto.split("-");
        TxtNom.setText(n[0]);TxtAP.setText(n[1]);TxtAM.setText(n[2]);
        TxtTel.setText(""+(int)TablaEmp.getValueAt(sele,1));
        TxtTipo.setText(p[0]);TxtPuest.setText(p[1]);
        TxtSuel.setText(""+(float)TablaEmp.getValueAt(sele, 3));
        Spinnerd.setValue((int)TablaEmp.getValueAt(sele, 4));
        TxtObs.setText((String)TablaEmp.getValueAt(sele, 6));
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
            java.util.logging.Logger.getLogger(VISTAEMPLEADOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VISTAEMPLEADOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VISTAEMPLEADOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VISTAEMPLEADOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VISTAEMPLEADOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarOpcion;
    private javax.swing.JToggleButton BotonEliminar;
    private javax.swing.JButton Editar;
    private javax.swing.JButton RegresarMen;
    private javax.swing.JSpinner Spinnerd;
    private javax.swing.JTable TablaEmp;
    private javax.swing.JTextField TxtAM;
    private javax.swing.JTextField TxtAP;
    private javax.swing.JTextField TxtBusc;
    private javax.swing.JTextField TxtNom;
    private javax.swing.JTextField TxtObs;
    private javax.swing.JTextField TxtPuest;
    private javax.swing.JTextField TxtSuel;
    private javax.swing.JTextField TxtTel;
    private javax.swing.JTextField TxtTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
