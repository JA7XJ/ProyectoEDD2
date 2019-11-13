package proyectoedd2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jd_listarc = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_campos = new javax.swing.JTable();
        jd_crearC = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_nombrecampo = new javax.swing.JTextField();
        cb_tipo = new javax.swing.JComboBox<>();
        sp_size = new javax.swing.JSpinner();
        rb_yes = new javax.swing.JRadioButton();
        rb_no = new javax.swing.JRadioButton();
        crearC = new javax.swing.JButton();
        jd_modificarC = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt_modificarC = new javax.swing.JTable();
        rb_modi = new javax.swing.JButton();
        jd_borrarC = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_borrarC = new javax.swing.JTable();
        jb_borrarC = new javax.swing.JButton();
        grupo = new javax.swing.ButtonGroup();
        jd_modi = new javax.swing.JDialog();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tf_nombrecampo1 = new javax.swing.JTextField();
        cb_tipo1 = new javax.swing.JComboBox<>();
        sp_size1 = new javax.swing.JSpinner();
        rb_yes1 = new javax.swing.JRadioButton();
        rb_no1 = new javax.swing.JRadioButton();
        rb_modificarF = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jb_nuevoAr = new javax.swing.JButton();
        jb_abrirAr = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jm_archivo = new javax.swing.JMenu();
        jmi_guardarArchivo = new javax.swing.JMenuItem();
        jmi_cerrarArchivo = new javax.swing.JMenuItem();
        jm_campos = new javax.swing.JMenu();
        jmi_crearCampo = new javax.swing.JMenuItem();
        jmi_modificarCampo = new javax.swing.JMenuItem();
        jmi_listarCampo = new javax.swing.JMenuItem();
        jmi_borrarCampos = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Campos");

        jt_campos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jt_campos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jt_campos);

        javax.swing.GroupLayout jd_listarcLayout = new javax.swing.GroupLayout(jd_listarc.getContentPane());
        jd_listarc.getContentPane().setLayout(jd_listarcLayout);
        jd_listarcLayout.setHorizontalGroup(
            jd_listarcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_listarcLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel2)
                .addContainerGap(159, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_listarcLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jd_listarcLayout.setVerticalGroup(
            jd_listarcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_listarcLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Crear Campo");

        jLabel4.setText("Nombre del campo");

        jLabel5.setText("Tipo");

        jLabel6.setText("Longitud");

        jLabel7.setText("¿Es llave primaria?");

        cb_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "int", "String", "double", "char", " " }));

        grupo.add(rb_yes);
        rb_yes.setText("Si");

        grupo.add(rb_no);
        rb_no.setText("No");

        crearC.setText("Crear");
        crearC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearCMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_crearCLayout = new javax.swing.GroupLayout(jd_crearC.getContentPane());
        jd_crearC.getContentPane().setLayout(jd_crearCLayout);
        jd_crearCLayout.setHorizontalGroup(
            jd_crearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_crearCLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(118, 118, 118))
            .addGroup(jd_crearCLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jd_crearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_crearCLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_nombrecampo, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_crearCLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_yes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jd_crearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(crearC)
                            .addComponent(rb_no)))
                    .addGroup(jd_crearCLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_crearCLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sp_size, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jd_crearCLayout.setVerticalGroup(
            jd_crearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_crearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_nombrecampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_crearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_crearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(sp_size, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_crearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jd_crearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rb_yes)
                        .addComponent(rb_no)))
                .addGap(18, 18, 18)
                .addComponent(crearC)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Seleccione archivo a modificar");

        jt_modificarC.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jt_modificarC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jt_modificarC);

        rb_modi.setText("Modificar");
        rb_modi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_modiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_modificarCLayout = new javax.swing.GroupLayout(jd_modificarC.getContentPane());
        jd_modificarC.getContentPane().setLayout(jd_modificarCLayout);
        jd_modificarCLayout.setHorizontalGroup(
            jd_modificarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificarCLayout.createSequentialGroup()
                .addGroup(jd_modificarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_modificarCLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel9))
                    .addGroup(jd_modificarCLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_modificarCLayout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(rb_modi, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jd_modificarCLayout.setVerticalGroup(
            jd_modificarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificarCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rb_modi)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Seleccione campo a borrar");

        jt_borrarC.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jt_borrarC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jt_borrarC);

        jb_borrarC.setText("Borrar");
        jb_borrarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_borrarCMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_borrarCLayout = new javax.swing.GroupLayout(jd_borrarC.getContentPane());
        jd_borrarC.getContentPane().setLayout(jd_borrarCLayout);
        jd_borrarCLayout.setHorizontalGroup(
            jd_borrarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_borrarCLayout.createSequentialGroup()
                .addGroup(jd_borrarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_borrarCLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jd_borrarCLayout.createSequentialGroup()
                        .addGroup(jd_borrarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_borrarCLayout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel8))
                            .addGroup(jd_borrarCLayout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addComponent(jb_borrarC)))
                        .addGap(0, 76, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jd_borrarCLayout.setVerticalGroup(
            jd_borrarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_borrarCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_borrarC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setText("Longitud");

        jLabel11.setText("¿Es llave primaria?");

        cb_tipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "int", "String", "double", "char", " " }));

        grupo.add(rb_yes1);
        rb_yes1.setText("Si");

        grupo.add(rb_no1);
        rb_no1.setText("No");

        rb_modificarF.setText("Modificar");
        rb_modificarF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_modificarFMouseClicked(evt);
            }
        });

        jLabel12.setText("Nombre del campo");

        jLabel13.setText("Tipo");

        javax.swing.GroupLayout jd_modiLayout = new javax.swing.GroupLayout(jd_modi.getContentPane());
        jd_modi.getContentPane().setLayout(jd_modiLayout);
        jd_modiLayout.setHorizontalGroup(
            jd_modiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_modiLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jd_modiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_modiLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_nombrecampo1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_modiLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_yes1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jd_modiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb_modificarF)
                            .addComponent(rb_no1)))
                    .addGroup(jd_modiLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_tipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_modiLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sp_size1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        jd_modiLayout.setVerticalGroup(
            jd_modiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modiLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jd_modiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tf_nombrecampo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_modiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cb_tipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_modiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(sp_size1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_modiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jd_modiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rb_yes1)
                        .addComponent(rb_no1)))
                .addGap(18, 18, 18)
                .addComponent(rb_modificarF)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("File Manager");

        jb_nuevoAr.setText("Nuevo Archivo");
        jb_nuevoAr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_nuevoArMouseClicked(evt);
            }
        });

        jb_abrirAr.setText("Abrir Archivo");
        jb_abrirAr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_abrirArMouseClicked(evt);
            }
        });

        jm_archivo.setText("Archivo");
        jm_archivo.setEnabled(false);

        jmi_guardarArchivo.setText("Guardar Archivo");
        jmi_guardarArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmi_guardarArchivoMouseClicked(evt);
            }
        });
        jmi_guardarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_guardarArchivoActionPerformed(evt);
            }
        });
        jm_archivo.add(jmi_guardarArchivo);

        jmi_cerrarArchivo.setText("Cerrar Archivo");
        jmi_cerrarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_cerrarArchivoActionPerformed(evt);
            }
        });
        jm_archivo.add(jmi_cerrarArchivo);

        jMenuBar1.add(jm_archivo);

        jm_campos.setText("Campos");
        jm_campos.setEnabled(false);

        jmi_crearCampo.setText("Crear Campo");
        jmi_crearCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_crearCampoActionPerformed(evt);
            }
        });
        jm_campos.add(jmi_crearCampo);

        jmi_modificarCampo.setText("Modificar Campo");
        jmi_modificarCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_modificarCampoActionPerformed(evt);
            }
        });
        jm_campos.add(jmi_modificarCampo);

        jmi_listarCampo.setText("Listar Campos");
        jmi_listarCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_listarCampoActionPerformed(evt);
            }
        });
        jm_campos.add(jmi_listarCampo);

        jmi_borrarCampos.setText("Borrar Campos");
        jmi_borrarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_borrarCamposActionPerformed(evt);
            }
        });
        jm_campos.add(jmi_borrarCampos);

        jMenuBar1.add(jm_campos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jb_nuevoAr)
                        .addGap(63, 63, 63)
                        .addComponent(jb_abrirAr, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_nuevoAr, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_abrirAr, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_guardarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_guardarArchivoActionPerformed
        // guardar
        try {
            //aqui guardar archivo;
            String texto = "";
            File archivo = null;
            FileWriter escribir = null;
            archivo = new File(rutaAbierto);
            escribir = new FileWriter(archivo);
            
            texto = campos.toString();               
            escribir.append(texto);
            escribir.close();
            jm_archivo.setEnabled(false);
            jm_campos.setEnabled(false);
        } catch (Exception ex) {        
        }
    }//GEN-LAST:event_jmi_guardarArchivoActionPerformed

    private void jmi_crearCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_crearCampoActionPerformed
        // TODO add your handling code here:
        try {
            jd_crearC.setModal(true);
            jd_crearC.pack();
            jd_crearC.setLocationRelativeTo(this);
            jd_crearC.setVisible(true);

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jmi_crearCampoActionPerformed

    private void jb_nuevoArMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_nuevoArMouseClicked
        try {
            jm_archivo.setEnabled(true);
            jm_campos.setEnabled(true);
            jb_abrirAr.setEnabled(false);
            //aqui crear archivo
            JFileChooser guardar = new JFileChooser();
            //FileNameExtensionFilter filtro = new FileNameExtensionFilter(".txt","txt");
            //guardar.setFileFilter(filtro);
            guardar.showSaveDialog(null);
            guardar.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

            File archivo = guardar.getSelectedFile();
            
            rutaAbierto = archivo.getPath(); //indicar que es el que se esta usando
            
            CrearArchivo(archivo);
            
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jb_nuevoArMouseClicked

    void CrearArchivo(File archivo_nuevo) {
        File archivo = new File(archivo_nuevo.getPath());
        FileWriter fw;
        try {
            fw = new FileWriter(archivo, true);
            fw.write("");
            fw.close();
        } catch (Exception e) {
        }

    }

    private void jb_abrirArMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_abrirArMouseClicked
        // TODO add your handling code here:
        try {
            jb_nuevoAr.setEnabled(false);
            jm_archivo.setEnabled(true);
            jm_campos.setEnabled(true);
            JFileChooser abrir = new JFileChooser();
            abrir.showSaveDialog(null);
            abrir.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

            File archivo = abrir.getSelectedFile();
            
            rutaAbierto = archivo.getPath(); //indicar que es el que se esta usando
            
            AbrirArchivo(archivo);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jb_abrirArMouseClicked

    public void AbrirArchivo(File archivo){
        File archivo_nuevo = new File(archivo.getPath());
        FileWriter fw;
        try {
            fw = new FileWriter(archivo_nuevo, true);
            fw.append(campos.toString());
            fw.close();
        } catch (Exception e) {
        }
    }
    
    private void jb_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_exitMouseClicked
        // TODO add your handling code here:
        try {
            System.exit(0);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jb_exitMouseClicked

    private void jmi_cerrarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_cerrarArchivoActionPerformed
        // TODO add your handling code here:
        try {
            jm_archivo.setEnabled(false);
            jm_campos.setEnabled(false);
            jb_nuevoAr.setEnabled(true);
            jb_abrirAr.setEnabled(true);
            rutaAbierto = "";
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jmi_cerrarArchivoActionPerformed

    private void jmi_listarCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_listarCampoActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            int size = campos.size();
            //for (int i = 0; i < size; i++) {
            modelo.addColumn("Nombre");
            modelo.addColumn("Tipo");
            modelo.addColumn("longitud");
            modelo.addColumn("Llave primaria");
            //}
            jt_campos.setModel(modelo);
            String[] c = new String[4];
            for (int i = 0; i < size; i++) {
                //String tipo = Integer.toString(campos.get(i).getTipo());
                String tipo = "";
                if (campos.get(i).getTipo() == 0) {
                    tipo = "int";
                }
                if (campos.get(i).getTipo() == 1) {
                    tipo = "String";
                }
                if (campos.get(i).getTipo() == 2) {
                    tipo = "double";
                }
                if (campos.get(i).getTipo() == 3) {
                    tipo = "char";
                }
                c[0] = campos.get(i).getNombreCampo();
                c[1] = tipo;
                c[2] = Integer.toString(campos.get(i).getLongitud());
                if (campos.get(i).isLlave() == false) {
                    c[3] = "No";
                } else {
                    c[3] = "Si";
                }
                modelo.addRow(c);
            }
            jt_campos.setModel(modelo);
            jd_listarc.setModal(true);
            jd_listarc.pack();
            jd_listarc.setLocationRelativeTo(this);
            jd_listarc.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jmi_listarCampoActionPerformed

    private void jmi_modificarCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_modificarCampoActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            int size = campos.size();
            //for (int i = 0; i < size; i++) {
            modelo.addColumn("Nombre");
            modelo.addColumn("Tipo");
            modelo.addColumn("longitud");
            modelo.addColumn("Llave primaria");
            //}
            jt_modificarC.setModel(modelo);
            String[] c = new String[4];
            for (int i = 0; i < size; i++) {
                //String tipo = Integer.toString(campos.get(i).getTipo());
                String tipo = "";
                if (campos.get(i).getTipo() == 0) {
                    tipo = "int";
                }
                if (campos.get(i).getTipo() == 1) {
                    tipo = "String";
                }
                if (campos.get(i).getTipo() == 2) {
                    tipo = "double";
                }
                if (campos.get(i).getTipo() == 3) {
                    tipo = "char";
                }
                c[0] = campos.get(i).getNombreCampo();
                c[1] = tipo;
                c[2] = Integer.toString(campos.get(i).getLongitud());
                if (campos.get(i).isLlave() == false) {
                    c[3] = "No";
                } else {
                    c[3] = "Si";
                }
                modelo.addRow(c);
            }
            jt_modificarC.setModel(modelo);
            jd_modificarC.setModal(true);
            jd_modificarC.pack();
            jd_modificarC.setLocationRelativeTo(this);
            jd_modificarC.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jmi_modificarCampoActionPerformed

    private void jmi_borrarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_borrarCamposActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            int size = campos.size();
            //for (int i = 0; i < size; i++) {
            modelo.addColumn("Nombre");
            modelo.addColumn("Tipo");
            modelo.addColumn("longitud");
            modelo.addColumn("Llave primaria");
            //}
            jt_borrarC.setModel(modelo);
            String[] c = new String[4];
            for (int i = 0; i < size; i++) {
                //String tipo = Integer.toString(campos.get(i).getTipo());
                String tipo = "";
                if (campos.get(i).getTipo() == 0) {
                    tipo = "int";
                }
                if (campos.get(i).getTipo() == 1) {
                    tipo = "String";
                }
                if (campos.get(i).getTipo() == 2) {
                    tipo = "double";
                }
                if (campos.get(i).getTipo() == 3) {
                    tipo = "char";
                }
                c[0] = campos.get(i).getNombreCampo();
                c[1] = tipo;
                c[2] = Integer.toString(campos.get(i).getLongitud());
                if (campos.get(i).isLlave() == false) {
                    c[3] = "No";
                } else {
                    c[3] = "Si";
                }
                modelo.addRow(c);
            }
            jt_borrarC.setModel(modelo);
            jd_borrarC.setModal(true);
            jd_borrarC.pack();
            jd_borrarC.setLocationRelativeTo(this);
            jd_borrarC.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jmi_borrarCamposActionPerformed

    private void crearCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearCMouseClicked
        // TODO add your handling code here:
        try {
            /*int tipo;
            if (cb_tipo.getSelectedIndex()==0) {
                int
            }*/
            boolean key;
            if (rb_yes.isSelected()) {
                key = true;
            } else {
                key = false;
            }
            campos.add(new Campo(tf_nombrecampo.getText(), cb_tipo.getSelectedIndex(), (int) sp_size.getValue(), key));
            JOptionPane.showMessageDialog(jd_crearC, "Campo creado con exito");
            jd_crearC.setVisible(false);
            tf_nombrecampo.setText("");
            cb_tipo.setSelectedIndex(0);
            sp_size.setValue(0);

        } catch (Exception e) {
        }
    }//GEN-LAST:event_crearCMouseClicked

    private void jb_borrarCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_borrarCMouseClicked
        // TODO add your handling code here:
        try {
            campos.remove(jt_borrarC.getSelectedRow());
            DefaultTableModel modelo = new DefaultTableModel();
            int size = campos.size();
            //for (int i = 0; i < size; i++) {
            modelo.addColumn("Nombre");
            modelo.addColumn("Tipo");
            modelo.addColumn("longitud");
            modelo.addColumn("Llave primaria");
            //}
            jt_borrarC.setModel(modelo);
            String[] c = new String[4];
            for (int i = 0; i < size; i++) {
                //String tipo = Integer.toString(campos.get(i).getTipo());
                String tipo = "";
                if (campos.get(i).getTipo() == 0) {
                    tipo = "int";
                }
                if (campos.get(i).getTipo() == 1) {
                    tipo = "String";
                }
                if (campos.get(i).getTipo() == 2) {
                    tipo = "double";
                }
                if (campos.get(i).getTipo() == 3) {
                    tipo = "char";
                }
                c[0] = campos.get(i).getNombreCampo();
                c[1] = tipo;
                c[2] = Integer.toString(campos.get(i).getLongitud());
                if (campos.get(i).isLlave() == false) {
                    c[3] = "No";
                } else {
                    c[3] = "Si";
                }
                modelo.addRow(c);
            }
            jt_borrarC.setModel(modelo);
            JOptionPane.showMessageDialog(jd_borrarC, "Campo borrado con exito");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jb_borrarCMouseClicked

    private void rb_modiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_modiMouseClicked
        // TODO add your handling code here:
        try {
            if (jt_modificarC.getSelectedRow() >= 0) {
//                tf_nombrecampo1.setText((String) jt_modificarC.getValueAt(jt_modificarC.getSelectedRow(), 0));
//                if ("int".equals((String) jt_modificarC.getValueAt(jt_modificarC.getSelectedRow(), 1))) {
//                    cb_tipo1.setSelectedIndex(1);
//                }
//                if ("String".equals((String) jt_modificarC.getValueAt(jt_modificarC.getSelectedRow(), 1))) {
//                    cb_tipo1.setSelectedIndex(1);
//                }
//                if ("double".equals((String) jt_modificarC.getValueAt(jt_modificarC.getSelectedRow(), 1))) {
//                    cb_tipo1.setSelectedIndex(1);
//                }
//                if ("char".equals((String) jt_modificarC.getValueAt(jt_modificarC.getSelectedRow(), 1))) {
//                    cb_tipo1.setSelectedIndex(1);
//                }
//                sp_size1.setValue((int) jt_modificarC.getValueAt(jt_modificarC.getSelectedRow(), 2));
//                if ("Si".equals((String) jt_modificarC.getValueAt(jt_modificarC.getSelectedRow(), 3))) {
//                    rb_yes1.setSelected(true);
//                } else {
//                    rb_no1.setSelected(true);
//                }
                jd_modi.setModal(true);
                jd_modi.pack();
                jd_modi.setLocationRelativeTo(this);
                jd_modi.setVisible(true);
//                jd_modi.setModal(true);
//                jd_modi.pack();
//                jd_modi.setLocationRelativeTo(this);
//                jd_modi.setVisible(true);
//                campos.get(jt_modificarC.getSelectedRow()).setNombreCampo(tf_nombrecampo1.getText());
//                campos.get(jt_modificarC.getSelectedRow()).setTipo(cb_tipo1.getSelectedIndex());
//                campos.get(jt_modificarC.getSelectedRow()).setLongitud((int) sp_size1.getValue());
//                if (rb_yes1.isSelected()) {
//                    campos.get(jt_modificarC.getSelectedRow()).setLlave(true);
//                } else {
//                    campos.get(jt_modificarC.getSelectedRow()).setLlave(false);
//                }
//                JOptionPane.showMessageDialog(jd_modi, "Modificado con exito");
                jd_modi.setVisible(false);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_rb_modiMouseClicked

    private void rb_modificarFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_modificarFMouseClicked
        // TODO add your handling code here:
        try {
            campos.get(jt_modificarC.getSelectedRow()).setNombreCampo(tf_nombrecampo1.getText());
            campos.get(jt_modificarC.getSelectedRow()).setTipo(cb_tipo1.getSelectedIndex());
            campos.get(jt_modificarC.getSelectedRow()).setLongitud((int) sp_size1.getValue());
            if (rb_yes1.isSelected()) {
                campos.get(jt_modificarC.getSelectedRow()).setLlave(true);
            } else {
                campos.get(jt_modificarC.getSelectedRow()).setLlave(false);
            }
            JOptionPane.showMessageDialog(jd_modi, "Modificado con exito");
            jd_modi.setVisible(false);
            DefaultTableModel modelo = new DefaultTableModel();
            int size = campos.size();
            //for (int i = 0; i < size; i++) {
            modelo.addColumn("Nombre");
            modelo.addColumn("Tipo");
            modelo.addColumn("longitud");
            modelo.addColumn("Llave primaria");
            //}
            jt_modificarC.setModel(modelo);
            String[] c = new String[4];
            for (int i = 0; i < size; i++) {
                //String tipo = Integer.toString(campos.get(i).getTipo());
                String tipo = "";
                if (campos.get(i).getTipo() == 0) {
                    tipo = "int";
                }
                if (campos.get(i).getTipo() == 1) {
                    tipo = "String";
                }
                if (campos.get(i).getTipo() == 2) {
                    tipo = "double";
                }
                if (campos.get(i).getTipo() == 3) {
                    tipo = "char";
                }
                c[0] = campos.get(i).getNombreCampo();
                c[1] = tipo;
                c[2] = Integer.toString(campos.get(i).getLongitud());
                if (campos.get(i).isLlave() == false) {
                    c[3] = "No";
                } else {
                    c[3] = "Si";
                }
                modelo.addRow(c);
            }
            jt_modificarC.setModel(modelo);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_rb_modificarFMouseClicked

    private void jmi_guardarArchivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmi_guardarArchivoMouseClicked
//        try {
//            //aqui guardar archivo;
//            JOptionPane.showMessageDialog(this, rutaAbierto);
//            String texto = "";
//            File archivo = null;
//            FileWriter escribir = null;
//            archivo = new File(rutaAbierto);
//            escribir = new FileWriter(archivo);
//            for (int i = 0; i < campos.size(); i++) {
//            texto += "|"+campos.get(i).getNombreCampo()+","
//                    +campos.get(i).getTipo()
//                    +campos.get(i).getLongitud()
//                    +"|";    
//            }
////            String texto = "|"+campos.get(0).getNombreCampo()+","
////                    +campos.get(0).getTipo()
////                    +campos.get(0).getLongitud()
////                    +"|";
//            escribir.write(texto);
//            escribir.close();
//        } catch (Exception ex) {        
//        }
    }//GEN-LAST:event_jmi_guardarArchivoMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_tipo;
    private javax.swing.JComboBox<String> cb_tipo1;
    private javax.swing.JButton crearC;
    private javax.swing.ButtonGroup grupo;
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jb_abrirAr;
    private javax.swing.JButton jb_borrarC;
    private javax.swing.JButton jb_nuevoAr;
    private javax.swing.JDialog jd_borrarC;
    private javax.swing.JDialog jd_crearC;
    private javax.swing.JDialog jd_listarc;
    private javax.swing.JDialog jd_modi;
    private javax.swing.JDialog jd_modificarC;
    private javax.swing.JMenu jm_archivo;
    private javax.swing.JMenu jm_campos;
    private javax.swing.JMenuItem jmi_borrarCampos;
    private javax.swing.JMenuItem jmi_cerrarArchivo;
    private javax.swing.JMenuItem jmi_crearCampo;
    private javax.swing.JMenuItem jmi_guardarArchivo;
    private javax.swing.JMenuItem jmi_listarCampo;
    private javax.swing.JMenuItem jmi_modificarCampo;
    private javax.swing.JTable jt_borrarC;
    private javax.swing.JTable jt_campos;
    private javax.swing.JTable jt_modificarC;
    private javax.swing.JButton rb_modi;
    private javax.swing.JButton rb_modificarF;
    private javax.swing.JRadioButton rb_no;
    private javax.swing.JRadioButton rb_no1;
    private javax.swing.JRadioButton rb_yes;
    private javax.swing.JRadioButton rb_yes1;
    private javax.swing.JSpinner sp_size;
    private javax.swing.JSpinner sp_size1;
    private javax.swing.JTextField tf_nombrecampo;
    private javax.swing.JTextField tf_nombrecampo1;
    // End of variables declaration//GEN-END:variables
    ArrayList<Campo> campos = new ArrayList();
    String rutaAbierto;
}
