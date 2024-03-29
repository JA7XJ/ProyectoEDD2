package proyectoedd2;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main extends javax.swing.JFrame {

    public Main() {
        //raiz=new Nodo(6);
//        tree = new ArbolB(6);
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
        jd_listarRegistros = new javax.swing.JDialog();
        jScrollPane4 = new javax.swing.JScrollPane();
        jt_listaR = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        atras = new javax.swing.JButton();
        adelante = new javax.swing.JButton();
        jd_insertarR = new javax.swing.JDialog();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jt_introR = new javax.swing.JTable();
        jb_introD = new javax.swing.JButton();
        jb_introR = new javax.swing.JButton();
        jd_opcionesM = new javax.swing.JDialog();
        jLabel16 = new javax.swing.JLabel();
        op1 = new javax.swing.JButton();
        jd_op1 = new javax.swing.JDialog();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaBM = new javax.swing.JTable();
        modificar1 = new javax.swing.JButton();
        jd_buscarR = new javax.swing.JDialog();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablaBM1 = new javax.swing.JTable();
        jd_cruzarAr = new javax.swing.JDialog();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jt_camposC = new javax.swing.JTable();
        jb_seleccionar = new javax.swing.JButton();
        jb_cruzar = new javax.swing.JButton();
        ArchivoFinal = new javax.swing.JDialog();
        jScrollPane9 = new javax.swing.JScrollPane();
        tablafinal = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jd_borrarR = new javax.swing.JDialog();
        jLabel21 = new javax.swing.JLabel();
        jb_bkey = new javax.swing.JButton();
        jb_bkeys = new javax.swing.JButton();
        jd_bkey = new javax.swing.JDialog();
        jScrollPane10 = new javax.swing.JScrollPane();
        jt_bkey = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        sibkey = new javax.swing.JButton();
        nobkey = new javax.swing.JButton();
        jd_bkeys = new javax.swing.JDialog();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jt_bkeys = new javax.swing.JTable();
        jb_addr = new javax.swing.JButton();
        jb_keys = new javax.swing.JButton();
        jd_bc = new javax.swing.JDialog();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jt_bc = new javax.swing.JTable();
        select = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        jt_xml = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jb_nuevoAr = new javax.swing.JButton();
        jb_abrirAr = new javax.swing.JButton();
        btn_Salida = new javax.swing.JButton();
        bb = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jm_archivo = new javax.swing.JMenu();
        jmi_guardarArchivo = new javax.swing.JMenuItem();
        jmi_cerrarArchivo = new javax.swing.JMenuItem();
        jm_campos = new javax.swing.JMenu();
        jmi_crearCampo = new javax.swing.JMenuItem();
        jmi_modificarCampo = new javax.swing.JMenuItem();
        jmi_listarCampo = new javax.swing.JMenuItem();
        jmi_borrarCampos = new javax.swing.JMenuItem();
        jm_registros = new javax.swing.JMenu();
        jmi_introducirR = new javax.swing.JMenuItem();
        jmi_modificarR = new javax.swing.JMenuItem();
        jmi_buscarR = new javax.swing.JMenuItem();
        jmi_borrarR = new javax.swing.JMenuItem();
        jmi_listarR = new javax.swing.JMenuItem();
        jmi_cruzar = new javax.swing.JMenuItem();
        jm_indices = new javax.swing.JMenu();
        jmi_crearI = new javax.swing.JMenuItem();
        jmi_reIndexarA = new javax.swing.JMenuItem();
        jm_utilidades = new javax.swing.JMenu();
        jmi_exportarE = new javax.swing.JMenuItem();
        jmi_exportarXML = new javax.swing.JMenuItem();

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
        cb_tipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_tipoItemStateChanged(evt);
            }
        });

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

        jt_listaR.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jt_listaR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jt_listaR);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("Registros");

        atras.setText("<");
        atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atrasMouseClicked(evt);
            }
        });

        adelante.setText(">");
        adelante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adelanteMouseClicked(evt);
            }
        });
        adelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adelanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_listarRegistrosLayout = new javax.swing.GroupLayout(jd_listarRegistros.getContentPane());
        jd_listarRegistros.getContentPane().setLayout(jd_listarRegistrosLayout);
        jd_listarRegistrosLayout.setHorizontalGroup(
            jd_listarRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_listarRegistrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_listarRegistrosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(193, 193, 193))
            .addGroup(jd_listarRegistrosLayout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(atras)
                .addGap(38, 38, 38)
                .addComponent(adelante)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_listarRegistrosLayout.setVerticalGroup(
            jd_listarRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_listarRegistrosLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_listarRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atras)
                    .addComponent(adelante))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setText("Introducir Registro");

        jt_introR.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jt_introR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(jt_introR);

        jb_introD.setText("Introducir dato");
        jb_introD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_introDMouseClicked(evt);
            }
        });

        jb_introR.setText("Introducir registro");
        jb_introR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_introRMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_insertarRLayout = new javax.swing.GroupLayout(jd_insertarR.getContentPane());
        jd_insertarR.getContentPane().setLayout(jd_insertarRLayout);
        jd_insertarRLayout.setHorizontalGroup(
            jd_insertarRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_insertarRLayout.createSequentialGroup()
                .addGroup(jd_insertarRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_insertarRLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE))
                    .addGroup(jd_insertarRLayout.createSequentialGroup()
                        .addGroup(jd_insertarRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_insertarRLayout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(jLabel15))
                            .addGroup(jd_insertarRLayout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(jb_introD)
                                .addGap(29, 29, 29)
                                .addComponent(jb_introR)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jd_insertarRLayout.setVerticalGroup(
            jd_insertarRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_insertarRLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_insertarRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_introD)
                    .addComponent(jb_introR))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setText("Elija una opcion");

        op1.setText("Modificar registro buscando por su llave");
        op1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                op1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_opcionesMLayout = new javax.swing.GroupLayout(jd_opcionesM.getContentPane());
        jd_opcionesM.getContentPane().setLayout(jd_opcionesMLayout);
        jd_opcionesMLayout.setHorizontalGroup(
            jd_opcionesMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_opcionesMLayout.createSequentialGroup()
                .addGroup(jd_opcionesMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_opcionesMLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel16))
                    .addGroup(jd_opcionesMLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(op1)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jd_opcionesMLayout.setVerticalGroup(
            jd_opcionesMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_opcionesMLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(op1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Edite el campo a modifcar y luego de guardar");

        tablaBM.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablaBM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(tablaBM);

        modificar1.setText("Guardar");
        modificar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificar1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_op1Layout = new javax.swing.GroupLayout(jd_op1.getContentPane());
        jd_op1.getContentPane().setLayout(jd_op1Layout);
        jd_op1Layout.setHorizontalGroup(
            jd_op1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_op1Layout.createSequentialGroup()
                .addGroup(jd_op1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_op1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel17))
                    .addGroup(jd_op1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_op1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(modificar1)
                .addGap(210, 210, 210))
        );
        jd_op1Layout.setVerticalGroup(
            jd_op1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_op1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(modificar1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Registro encontrado");

        tablaBM1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablaBM1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(tablaBM1);

        javax.swing.GroupLayout jd_buscarRLayout = new javax.swing.GroupLayout(jd_buscarR.getContentPane());
        jd_buscarR.getContentPane().setLayout(jd_buscarRLayout);
        jd_buscarRLayout.setHorizontalGroup(
            jd_buscarRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_buscarRLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jd_buscarRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_buscarRLayout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_buscarRLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(142, 142, 142))))
        );
        jd_buscarRLayout.setVerticalGroup(
            jd_buscarRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_buscarRLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel19.setText("Seleccione los campos a utilizar");

        jt_camposC.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jt_camposC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane8.setViewportView(jt_camposC);

        jb_seleccionar.setText("Seleccionar");
        jb_seleccionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_seleccionarMouseClicked(evt);
            }
        });

        jb_cruzar.setText("Cruzar");
        jb_cruzar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_cruzarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_cruzarArLayout = new javax.swing.GroupLayout(jd_cruzarAr.getContentPane());
        jd_cruzarAr.getContentPane().setLayout(jd_cruzarArLayout);
        jd_cruzarArLayout.setHorizontalGroup(
            jd_cruzarArLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_cruzarArLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jb_seleccionar)
                .addGap(28, 28, 28)
                .addComponent(jb_cruzar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_cruzarArLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jd_cruzarArLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_cruzarArLayout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_cruzarArLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(73, 73, 73))))
        );
        jd_cruzarArLayout.setVerticalGroup(
            jd_cruzarArLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_cruzarArLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_cruzarArLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_seleccionar)
                    .addComponent(jb_cruzar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablafinal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablafinal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane9.setViewportView(tablafinal);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel20.setText("Archivo final");

        javax.swing.GroupLayout ArchivoFinalLayout = new javax.swing.GroupLayout(ArchivoFinal.getContentPane());
        ArchivoFinal.getContentPane().setLayout(ArchivoFinalLayout);
        ArchivoFinalLayout.setHorizontalGroup(
            ArchivoFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ArchivoFinalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(ArchivoFinalLayout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ArchivoFinalLayout.setVerticalGroup(
            ArchivoFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ArchivoFinalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel21.setText("De click en una opcion");

        jb_bkey.setText("Borrar registro a traves de llave");
        jb_bkey.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_bkeyMouseClicked(evt);
            }
        });

        jb_bkeys.setText("Borrar varios registros a traves de llaves");
        jb_bkeys.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_bkeysMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_borrarRLayout = new javax.swing.GroupLayout(jd_borrarR.getContentPane());
        jd_borrarR.getContentPane().setLayout(jd_borrarRLayout);
        jd_borrarRLayout.setHorizontalGroup(
            jd_borrarRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_borrarRLayout.createSequentialGroup()
                .addGroup(jd_borrarRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_borrarRLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jb_bkeys))
                    .addGroup(jd_borrarRLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jd_borrarRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addGroup(jd_borrarRLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jb_bkey)))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jd_borrarRLayout.setVerticalGroup(
            jd_borrarRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_borrarRLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_bkey)
                .addGap(30, 30, 30)
                .addComponent(jb_bkeys)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jt_bkey.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jt_bkey.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane10.setViewportView(jt_bkey);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText("¿Esta seguro que quiere borrar este registro?");

        sibkey.setText("Si");
        sibkey.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sibkeyMouseClicked(evt);
            }
        });

        nobkey.setText("No");
        nobkey.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nobkeyMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_bkeyLayout = new javax.swing.GroupLayout(jd_bkey.getContentPane());
        jd_bkey.getContentPane().setLayout(jd_bkeyLayout);
        jd_bkeyLayout.setHorizontalGroup(
            jd_bkeyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_bkeyLayout.createSequentialGroup()
                .addGroup(jd_bkeyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_bkeyLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE))
                    .addGroup(jd_bkeyLayout.createSequentialGroup()
                        .addGroup(jd_bkeyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_bkeyLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel22))
                            .addGroup(jd_bkeyLayout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(sibkey)
                                .addGap(89, 89, 89)
                                .addComponent(nobkey)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jd_bkeyLayout.setVerticalGroup(
            jd_bkeyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_bkeyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jd_bkeyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sibkey)
                    .addComponent(nobkey))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel23.setText("De click en agregar llave para agregar una llave");

        jt_bkeys.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jt_bkeys.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane11.setViewportView(jt_bkeys);

        jb_addr.setText("Agregar llave a borrar");
        jb_addr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_addrMouseClicked(evt);
            }
        });

        jb_keys.setText("Borrar Registros");
        jb_keys.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_keysMouseClicked(evt);
            }
        });
        jb_keys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_keysActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_bkeysLayout = new javax.swing.GroupLayout(jd_bkeys.getContentPane());
        jd_bkeys.getContentPane().setLayout(jd_bkeysLayout);
        jd_bkeysLayout.setHorizontalGroup(
            jd_bkeysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_bkeysLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jd_bkeysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jd_bkeysLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(48, 48, 48))
                    .addGroup(jd_bkeysLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jd_bkeysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jb_addr, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(jb_keys, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(135, 135, 135))))
        );
        jd_bkeysLayout.setVerticalGroup(
            jd_bkeysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_bkeysLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addGroup(jd_bkeysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_bkeysLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jb_addr, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jb_keys, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setText("Elija el campo por el cual quiere borrar");

        jt_bc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jt_bc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane12.setViewportView(jt_bc);

        select.setText("Elegir campo seleccionado");
        select.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_bcLayout = new javax.swing.GroupLayout(jd_bc.getContentPane());
        jd_bc.getContentPane().setLayout(jd_bcLayout);
        jd_bcLayout.setHorizontalGroup(
            jd_bcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_bcLayout.createSequentialGroup()
                .addGroup(jd_bcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_bcLayout.createSequentialGroup()
                        .addContainerGap(20, Short.MAX_VALUE)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_bcLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel24)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jd_bcLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(select)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_bcLayout.setVerticalGroup(
            jd_bcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_bcLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(select)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jt_xml.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane13.setViewportView(jt_xml);

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

        btn_Salida.setText("❌");
        btn_Salida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_SalidaMouseClicked(evt);
            }
        });

        bb.setText("Imprimir Arbol");
        bb.setEnabled(false);
        bb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bbMouseClicked(evt);
            }
        });

        jm_archivo.setText("Archivo");
        jm_archivo.setEnabled(false);

        jmi_guardarArchivo.setText("Guardar Archivo");
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

        jm_registros.setText("Registros");
        jm_registros.setEnabled(false);

        jmi_introducirR.setText("Introducir registros");
        jmi_introducirR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_introducirRActionPerformed(evt);
            }
        });
        jm_registros.add(jmi_introducirR);

        jmi_modificarR.setText("Modificar registros");
        jmi_modificarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_modificarRActionPerformed(evt);
            }
        });
        jm_registros.add(jmi_modificarR);

        jmi_buscarR.setText("Buscar registros");
        jmi_buscarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_buscarRActionPerformed(evt);
            }
        });
        jm_registros.add(jmi_buscarR);

        jmi_borrarR.setText("Borrar registros");
        jmi_borrarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_borrarRActionPerformed(evt);
            }
        });
        jm_registros.add(jmi_borrarR);

        jmi_listarR.setText("Listar registros");
        jmi_listarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_listarRActionPerformed(evt);
            }
        });
        jm_registros.add(jmi_listarR);

        jmi_cruzar.setText("Cruzar archivos");
        jmi_cruzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_cruzarActionPerformed(evt);
            }
        });
        jm_registros.add(jmi_cruzar);

        jMenuBar1.add(jm_registros);

        jm_indices.setText("Indices");
        jm_indices.setEnabled(false);

        jmi_crearI.setText("Crear Indices");
        jmi_crearI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_crearIActionPerformed(evt);
            }
        });
        jm_indices.add(jmi_crearI);

        jmi_reIndexarA.setText("Re indexar Archivos");
        jmi_reIndexarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_reIndexarAActionPerformed(evt);
            }
        });
        jm_indices.add(jmi_reIndexarA);

        jMenuBar1.add(jm_indices);

        jm_utilidades.setText("Utilidades");
        jm_utilidades.setEnabled(false);

        jmi_exportarE.setText("Exportar a Excel");
        jmi_exportarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_exportarEActionPerformed(evt);
            }
        });
        jm_utilidades.add(jmi_exportarE);

        jmi_exportarXML.setText("Exportar a XML con Schema");
        jmi_exportarXML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_exportarXMLActionPerformed(evt);
            }
        });
        jm_utilidades.add(jmi_exportarXML);

        jMenuBar1.add(jm_utilidades);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb_nuevoAr)
                                .addGap(63, 63, 63)
                                .addComponent(jb_abrirAr, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bb)
                        .addGap(113, 113, 113)
                        .addComponent(btn_Salida)
                        .addContainerGap())))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btn_Salida))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bb)))
                .addContainerGap())
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
            if (Abrir) {
                archivo = new File(rutaAbierto);
                escribir = new FileWriter(archivo);
            } else {
                archivo = new File(rutaAbierto + ".txt");
                escribir = new FileWriter(archivo);
            }
//            archivo = new File(rutaAbierto);
//            escribir = new FileWriter(archivo);
            texto += "|";
            for (int i = 0; i < campos.size(); i++) {
                //texto+=campos.get(i).toString();
                texto += campos.get(i).getNombreCampo() + "," + campos.get(i).getTipo() + "," + campos.get(i).getLongitud() + "," + campos.get(i).isLlave() + "|";
            }
            texto += "\n|";
            int cc = 0;
            for (int i = 0; i < elementos.size(); i++) {
                if (cc < campos.size()) {
                    texto += elementos.get(i) + "|";
                }
                cc++;
                if (cc == campos.size()) {
                    texto += "\n";
                    cc = 0;
                    if (i == elementos.size() - 1) {

                    } else {
                        texto += "|";
                    }
                    //System.out.println("y");
                }
            }
            //texto = campos.toString();
//            rb_yes.setEnabled(true);
//            rb_no.setEnabled(true);
            System.out.println(rutaAbierto);
            System.out.println(ruta2);
            System.out.println(ruta3);
            if (elementos.isEmpty()) {

            } else {
                escribirArbol();
            }

            escribir.append(texto);
            escribir.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jmi_guardarArchivoActionPerformed

    private void jmi_crearCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_crearCampoActionPerformed
        // Cre
        try {
            if (campos.isEmpty()) {
                rb_yes.setSelected(false);
                rb_no.setSelected(true);
            } else {
                boolean hay = false;
                for (int i = 0; i < campos.size(); i++) {
                    if (campos.get(i).isLlave()) {
                        hay = true;
                    }
                }
                if (hay) {
                    rb_yes.setSelected(false);
                    rb_no.setSelected(true);
                    rb_yes.setEnabled(false);
                    rb_no.setEnabled(false);
                } else {
                    rb_yes.setSelected(false);
                    rb_no.setSelected(true);
                    rb_yes.setEnabled(true);
                    rb_no.setEnabled(true);
                }
            }
            sp_size.setEnabled(false);
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
            jm_registros.setEnabled(true);
            jm_indices.setEnabled(true);
            jm_utilidades.setEnabled(true);
            rb_yes.setEnabled(true);
            rb_no.setEnabled(true);
            jb_abrirAr.setEnabled(false);
            tree = new ArbolB(6);
            //aqui crear archivo
            JFileChooser guardar = new JFileChooser();
            FileFilter filtro = new FileNameExtensionFilter("Archivos de texto(.txt)", "txt");
            guardar.setFileFilter(filtro);
            guardar.showSaveDialog(null);
            //guardar.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

            File archivo = guardar.getSelectedFile();
            //File archivo=new File(g)
            rutaAbierto = archivo.getPath(); //indicar que es el que se esta usando
            if (rutaAbierto.endsWith(".txt")) {
                ruta2 = rutaAbierto;
                String replace = ruta2.replace(".txt", ".tree");
                ruta2 = replace;
            } else {
                ruta2 = rutaAbierto;
                //String replace = ruta2.replace(".txt", ".tree");
                ruta2 = ruta2 + ".tree";
            }
            if (rutaAbierto.endsWith(".txt")) {
                ruta3 = rutaAbierto;
                String replace = ruta3.replace(".txt", "index");
                ruta3 = replace;
                ruta3 = ruta3 + ".txt";
            } else {
                ruta3 = rutaAbierto;
                //String replace = ruta3.replace(".txt", "index");
                //ruta3 = replace;
                ruta3 = ruta3 + "index.txt";
            }
            Abrir = false;
            System.out.println(rutaAbierto);
            System.out.println(ruta2);
            bb.setEnabled(true);
            //CrearArchivo(archivo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jb_nuevoArMouseClicked

    void CrearArchivo(File archivo_nuevo) {
        File archivo = new File(archivo_nuevo.getPath() + ".txt");
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
            JFileChooser abrir = new JFileChooser();
            FileFilter filtro = new FileNameExtensionFilter("Archivos de texto(.txt)", "txt");
            abrir.setFileFilter(filtro);
            int valor = abrir.showOpenDialog(abrir);
            if (valor == JFileChooser.APPROVE_OPTION) {
//                jm_archivo.setEnabled(true);
//                jm_campos.setEnabled(true);
//                jm_registros.setEnabled(true);
//                jm_indices.setEnabled(true);
//                jm_utilidades.setEnabled(true);
                rutaAbierto = abrir.getSelectedFile().getPath();
                if (rutaAbierto.endsWith(".txt")) {
                    ruta2 = rutaAbierto;
                    String replace = ruta2.replace(".txt", ".tree");
                    ruta2 = replace;
                }
                if (rutaAbierto.endsWith(".txt")) {
                    ruta3 = rutaAbierto;
                    String replace = ruta3.replace(".txt", "index");
                    ruta3 = replace;
                    ruta3 = ruta3 + ".txt";
                }
                System.out.println(ruta2);
                System.out.println(ruta3);
                abrirArchivoCampos(rutaAbierto);
                abrirArchivoRegistros(rutaAbierto);
                tree = new ArbolB(6);
                leerArbol();
                if (elementos.isEmpty()) {
                    jm_archivo.setEnabled(true);
                    jm_campos.setEnabled(true);
                    jm_registros.setEnabled(true);
                    jm_indices.setEnabled(true);
                    jm_utilidades.setEnabled(true);
                } else {
                    jm_archivo.setEnabled(true);
                    jm_campos.setEnabled(false);
                    jm_registros.setEnabled(true);
                    jm_indices.setEnabled(true);
                    jm_utilidades.setEnabled(true);
                }
                jb_nuevoAr.setEnabled(false);
                System.out.println(rutaAbierto);
                imprimir(tree.raiz, 0);
                Abrir = true;
                bb.setEnabled(true);
                elementos.clear();
            } else {
                JOptionPane.showMessageDialog(this, "Archivo no seleccionado");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jb_abrirArMouseClicked

    void abrirArchivoRegistros(String ruta) throws IOException {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            //archivo = new File("c:/Files/prueba.txt");
            archivo = new File(ruta); //cualquier ruta
            fr = new FileReader(archivo); //apunta al archivo
            br = new BufferedReader(fr); //apunta al canal
            String texto = "", texto2 = "";
            int c = 0;
            while ((texto = br.readLine()) != null) {  //leer archivo de texto            
                if (c > 0) {
                    texto2 += texto;
                }
                c++;
            }
            //System.out.println(texto2);
            StringTokenizer tokens = new StringTokenizer(texto2, "|");
            while (tokens.hasMoreTokens()) {
                elementos.add(tokens.nextToken());
            }
//            for (int i = 0; i < elementos.size(); i++) {
//                System.out.println(elementos.get(i).toString());
//            }
        } catch (Exception e) {
        }
        br.close();
        fr.close();
    }

    void abrirArchivoCampos(String ruta) throws IOException {
        campos.clear();
        Scanner lea = null;
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        //Scanner lea2 = null;
        try {
//            File archivo = new File(ruta);
            archivo = new File(ruta); //cualquier ruta
            fr = new FileReader(archivo); //apunta al archivo
            br = new BufferedReader(fr); //apunta al canalF
            lea = new Scanner(archivo);
            String nombrec = "";
            int tipo, longitud;
            boolean llave = false;
            lea.useDelimiter("|");
            String texto = "", texto2 = "";
            int c = 0;
            while ((texto = br.readLine()) != null) {  //leer archivo de texto            
                if (c == 0) {
                    texto2 += texto;
                    break;
                }
                c++;
            }
            StringTokenizer tokens = new StringTokenizer(texto2, "|");
            while (tokens.hasMoreTokens()) {
                String texto3 = tokens.nextToken();
                StringTokenizer tokens2 = new StringTokenizer(texto3, ",");
                //int c = 0, c2 = 0;
                while (tokens2.hasMoreTokens()) {
//                        System.out.println(tokens2.nextToken());
//                        System.out.println(c);
//                        c=c+1;
                    nombrec = tokens2.nextToken();
                    tipo = Integer.parseInt(tokens2.nextToken());
                    longitud = Integer.parseInt(tokens2.nextToken());
                    if ("true".equals(tokens2.nextToken())) {
                        llave = true;
                    } else {
                        llave = false;
                    }
                    campos.add(new Campo(nombrec, tipo, longitud, llave));
                }
            }
            JOptionPane.showMessageDialog(this, "Archivo cargado con exito");
            //System.out.println(texto);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error, archivo de texto no compatible");
        }
        br.close();
        fr.close();
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
            jm_registros.setEnabled(false);
            jm_indices.setEnabled(false);
            jm_utilidades.setEnabled(false);
            bb.setEnabled(false);
            jb_nuevoAr.setEnabled(true);
            jb_abrirAr.setEnabled(true);
            rutaAbierto = "";
            campos.clear();
            elementos.clear();
            indices.clear();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jmi_cerrarArchivoActionPerformed

    private void jmi_listarCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_listarCampoActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            int size = campos.size();
            modelo.addColumn("Nombre");
            modelo.addColumn("Tipo");
            modelo.addColumn("longitud");
            modelo.addColumn("Llave primaria");
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
            //jd_crearC.setVisible(false);
            tf_nombrecampo.setText("");
            cb_tipo.setSelectedIndex(0);
            sp_size.setValue(0);
            for (int i = 0; i < campos.size(); i++) {
                if (campos.get(i).isLlave()) {
                    rb_yes.setSelected(false);
                    rb_no.setSelected(true);
                    rb_yes.setEnabled(false);
                    rb_no.setEnabled(false);
                }
            }
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

    private void cb_tipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_tipoItemStateChanged

        if (cb_tipo.getSelectedIndex() == 0) {
            sp_size.setEnabled(false);
        } else {
            sp_size.setEnabled(true);
        }
    }//GEN-LAST:event_cb_tipoItemStateChanged

    private void btn_SalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SalidaMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btn_SalidaMouseClicked

    private void jmi_modificarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_modificarRActionPerformed
        // TODO add your handling code here:
        try {
            elementos.clear();
//            abrirArchivoRegistros(rutaAbierto);
            jd_opcionesM.setModal(true);
            jd_opcionesM.pack();
            jd_opcionesM.setLocationRelativeTo(this);
            jd_opcionesM.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jmi_modificarRActionPerformed

    private void jmi_exportarXMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_exportarXMLActionPerformed
        // exportar XML
        
        
    }//GEN-LAST:event_jmi_exportarXMLActionPerformed

    private void jmi_exportarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_exportarEActionPerformed
        // TODO add your handling code here:
        try {
            elementos.clear();
            abrirArchivoRegistros(rutaAbierto);
            DefaultTableModel modelo = new DefaultTableModel();
            int size = campos.size();
            //for (int i = 0; i < size; i++) {
            for (int i = 0; i < campos.size(); i++) {
                modelo.addColumn(campos.get(i).getNombreCampo());
            }
            String[] c = new String[size];
            int cc = 0;
            for (int i = 0; i < elementos.size(); i++) {
                if (cc < size) {
                    c[cc] = (String) elementos.get(i);
                }
                cc++;
                if (cc == size) {
                    modelo.addRow(c);
                    cc = 0;
                    //System.out.println("y");
                }
            }
            jt_xml.setModel(modelo);
            elementos.clear();
            JFileChooser seleccionar = new JFileChooser();
            File archivo;

            if (seleccionar.showDialog(null, "Exportar a Excel") == JFileChooser.APPROVE_OPTION) {
                archivo = seleccionar.getSelectedFile();
                int cantFila = jt_xml.getRowCount();
                int cantColumna = jt_xml.getColumnCount();
                XSSFWorkbook wb;
                wb = new XSSFWorkbook();
                Sheet hoja = ((org.apache.poi.ss.usermodel.Workbook) wb).createSheet(" ");
                try {
                    for (int i = -1; i < cantFila; i++) {
                        Row fila = hoja.createRow(i + 1);
                        for (int j = 0; j < cantColumna; j++) {
                            Cell celda = fila.createCell(j);
                            if (i == -1) {
                                celda.setCellValue(String.valueOf(jt_xml.getColumnName(j)));
                            } else {
                                celda.setCellValue(String.valueOf(jt_xml.getValueAt(i, j)));
                            }
                            wb.write(new FileOutputStream(archivo + ".xlsx"));
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Exportacion exitosa");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Vuelve a intentarlo");
                }
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jmi_exportarEActionPerformed

    private void jmi_crearIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_crearIActionPerformed
        // TODO add your handling code here:
//        try {
        try {
            abrirArchivoRegistros(rutaAbierto);
            ArbolB a = new ArbolB(6);
            crearIndices();
            leerIndices();
            for (int i = 0; i < indices.size(); i++) {
                a.insertar(Integer.parseInt((String) indices.get(i)));
            }
            tree = a;
            escribirArbol();
            indices.clear();
            elementos.clear();
            JOptionPane.showMessageDialog(this, "Operacion completada");
        } catch (Exception e) {
            e.printStackTrace();
        }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }//GEN-LAST:event_jmi_crearIActionPerformed
//    public String readLineArchivo(){
//        
//    }
    private void jmi_reIndexarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_reIndexarAActionPerformed
        // TODO add your handling code here:
        try {
            abrirArchivoRegistros(rutaAbierto);
            crearIndices();
            elementos.clear();
            JOptionPane.showMessageDialog(this, "Archivo de indices creado");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jmi_reIndexarAActionPerformed

    public void leerIndices() throws IOException {
        Scanner lea = null;
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        //Scanner lea2 = null;
        try {
//            File archivo = new File(ruta);
            archivo = new File(ruta3); //cualquier ruta
            fr = new FileReader(archivo); //apunta al archivo
            br = new BufferedReader(fr); //apunta al canalF
            lea = new Scanner(archivo);
//            String nombrec = "";
//            int tipo, longitud;
//            boolean llave = false;
            lea.useDelimiter("|");
//            String texto = "", texto2 = "";
            String texto = "";
//            int c = 0;
            while ((texto = br.readLine()) != null) {  //leer archivo de texto   
                //System.out.println(texto);
                indices.add(texto);
            }
//            StringTokenizer tokens = new StringTokenizer(texto2, "|");
//            while (tokens.hasMoreTokens()) {
//                String texto3 = tokens.nextToken();
//                StringTokenizer tokens2 = new StringTokenizer(texto3, ",");
//                //int c = 0, c2 = 0;
//                while (tokens2.hasMoreTokens()) {
////                        System.out.println(tokens2.nextToken());
////                        System.out.println(c);
////                        c=c+1;
//                    nombrec = tokens2.nextToken();
//                    tipo = Integer.parseInt(tokens2.nextToken());
//                    longitud = Integer.parseInt(tokens2.nextToken());
//                    if ("true".equals(tokens2.nextToken())) {
//                        llave = true;
//                    } else {
//                        llave = false;
//                    }
//                    campos.add(new Campo(nombrec, tipo, longitud, llave));
//                }
//            }
//            JOptionPane.showMessageDialog(this, "Archivo cargado con exito");
            //System.out.println(texto);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error, archivo de texto no compatible");
        }
        br.close();
        fr.close();
    }

    public void crearIndices() throws IOException {
        String texto = "";
        File archivo = null;
        FileWriter escribir = null;
        archivo = new File(ruta3);
        escribir = new FileWriter(archivo);
//        for (int i = 0; i < campos.size(); i++) {
//            if (campos.get(i).isLlave()) {
//                for (int j = 0; j < elementos.size(); j++) {
//                    if (rootPaneCheckingEnabled) {
//                        
//                    }
//                    texto += elementos.get(campos.indexOf(campos.get(i))) + "\n";
//                }
//            }
//        }
        int indi = 0;
        for (int i = 0; i < campos.size(); i++) {
            if (campos.get(i).isLlave()) {
                indi = campos.indexOf(campos.get(i));
                // System.out.println(indi);
            }
        }
        int counter = 0;
        for (int j = 0; j < campos.size(); j++) {
            if (campos.get(j).getTipo() == 0) {
//                                    counter++;
                if (campos.get(j).isLlave()) {
                    break;
                }
//                                    counter++;
            }
            if (campos.get(j).getTipo() == 1) {
//                                    counter++;
                if (campos.get(j).isLlave()) {
                    break;
                }
//                                    counter++;
            }
            if (campos.get(j).getTipo() == 2) {
//                                    counter++;
                if (campos.get(j).isLlave()) {
                    break;
                }
//                                    counter++;
            }
            if (campos.get(j).getTipo() == 3) {
//                                    counter++;
                if (campos.get(j).isLlave()) {
                    break;
                }
//                                    counter++;
            }
            counter++;
        }
        System.out.println("counter " + counter);
        System.out.println("indi " + indi);
        System.out.println("campos " + campos.size());
        //indi=indi;
        // int res = 0;
        if (indi == 0) {
            counter = 1;
        }
//        System.out.println(res);
        int c = 0;
        for (int i = 0; i < elementos.size(); i++) {
            if (indi < elementos.size()) {
                texto += elementos.get(indi) + "\n";
                if (indi == 0) {
                    indi = indi + counter;
                    indi = indi + campos.size() - 1;
                } else {
                    indi = indi + campos.size();
                }
                System.out.println(indi);
            }
        }
        escribir.append(texto);
        escribir.close();
    }

    public void escribirArbol() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        File archivo = new File(ruta2);
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            //for (Alumno t : listaAlumnos) {
            bw.writeObject(tree);
            //}
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }

//    public void escribirArbol() {
//        File archivo = null;
//        FileWriter escribir = null;
//        try {
//            archivo = new File("Arbol"+rutaAbierto);
//            escribir = new FileWriter(archivo);
//            //for (Alumno t : listaAlumnos) {
//            String texto;
//            for (int i = 0; i < ; i++) {
//                
//            }
//            //}
//            bw.flush();
//        } catch (Exception ex) {
//        } finally {
//            try {
//                bw.close();
//                fw.close();
//            } catch (Exception ex) {
//            }
//        }
//    }
    public void leerArbol() {
        try {
            File archivo = new File(ruta2);
//            ArbolB tree=new ArbolB();
//            Nodo raiz=new Nodo(6);
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    Object temp;
//                    while ((temp = objeto.readObject()) != null) {
//                        //tree.insertar(raiz, (int) temp);
//                        tree = (ArbolB) temp;
//                    }
                    while ((temp = objeto.readObject()) != null) {
                        //tree.insertar(raiz, (int) temp);
                        tree = (ArbolB) temp;
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    private void jmi_introducirRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_introducirRActionPerformed
        // TODO add your handling code here:
        try {
            elementos.clear();
            //abrirArchivoRegistros(rutaAbierto);
            DefaultTableModel modelo = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    if (column == 4) {
                        return true;
                    }
                    return false;
                }
            };
            int size = campos.size();
            //for (int i = 0; i < size; i++) {
            modelo.addColumn("Nombre");
            modelo.addColumn("Tipo");
            modelo.addColumn("longitud");
            modelo.addColumn("Llave primaria");
            modelo.addColumn("Dato");
            //}
//            for (int i = 0; i < campos.size(); i++) {
//              
//            }
            jt_modificarC.setModel(modelo);
            String[] c = new String[5];
            for (int i = 0; i < size; i++) {
                c[0] = campos.get(i).getNombreCampo();
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
                c[1] = tipo;
                c[2] = Integer.toString(campos.get(i).getLongitud());
                if (campos.get(i).isLlave() == false) {
                    c[3] = "No";
                } else {
                    c[3] = "Si";
                }
                c[4] = "";
                modelo.addRow(c);
            }
            jt_introR.setModel(modelo);
            jd_insertarR.setModal(true);
            jd_insertarR.pack();
            jd_insertarR.setLocationRelativeTo(this);
            jd_insertarR.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jmi_introducirRActionPerformed

    private void jmi_buscarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_buscarRActionPerformed
        // TODO add your handling code here:
        try {
            int key = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese la llave a buscar"));
            //ArrayList busqueda2 = tree.busqueda(tree.raiz, key);
            int ii = 0;
            ArrayList busqueda2 = tree.busqueda(key);
//            System.out.println("indice " + busqueda2.get(1));
//            System.out.println("llave " + busqueda2.get(0));
            if (key == (int) busqueda2.get(0)) {
                elementos.clear();
                //abrirArchivoRegistros(rutaAbierto);
                k = key;
                DefaultTableModel modelo = new DefaultTableModel();
                int size = campos.size();
                //for (int i = 0; i < size; i++) {
                for (int i = 0; i < campos.size(); i++) {
                    modelo.addColumn(campos.get(i).getNombreCampo());
                }
                int c = 0, c2 = 0;
                int indice = (int) busqueda2.get(1);
                in = indice;
                //System.out.println(in);
                String[] cc = new String[size];
                String result;
                Path filePath = Paths.get(rutaAbierto);
                leerIndices();
                for (int i = 0; i < indices.size(); i++) {
                    if (k == Integer.parseInt((String) indices.get(i))) {
                        break;
                    } else {
                        c2++;
                    }
                }
                //System.out.println(c2);
                try (Stream<String> lines = Files.lines(filePath)) {
                    result = lines.skip(c2 + 1).findFirst().get();
                }
                //System.out.println(result);
                StringTokenizer tokens = new StringTokenizer(result, "|");
                while (tokens.hasMoreTokens()) {
                    elementos.add(tokens.nextToken());
                }
                for (int i = 0; i < elementos.size(); i++) {
                    if (c < size) {
                        cc[c] = (String) elementos.get(i);
                    }
                    c++;
                    if (c == size) {
                        modelo.addRow(cc);
                        c = 0;
                        //System.out.println("y");
                    }
                }
                tablaBM1.setModel(modelo);
                elementos.clear();
                indices.clear();
                jd_buscarR.setModal(true);
                jd_buscarR.pack();
                jd_buscarR.setLocationRelativeTo(this);
                jd_buscarR.setVisible(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error, registro no existe");
        }
    }//GEN-LAST:event_jmi_buscarRActionPerformed

    private void jmi_borrarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_borrarRActionPerformed
        // TODO add your handling code here:
        try {
            jd_borrarR.setModal(true);
            jd_borrarR.pack();
            jd_borrarR.setLocationRelativeTo(this);
            jd_borrarR.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jmi_borrarRActionPerformed

    private void jmi_listarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_listarRActionPerformed
        // TODO add your handling code here:
        try {
//            for (int i = 0; i < elementos.size(); i++) {
//                System.out.println(elementos.get(i).toString());
//            }
//            llenaTabla();
            abrirArchivoRegistros(rutaAbierto);
            DefaultTableModel modelo = new DefaultTableModel();
            int size = campos.size();
            //for (int i = 0; i < size; i++) {
            for (int i = 0; i < campos.size(); i++) {
                modelo.addColumn(campos.get(i).getNombreCampo());
            }
            String[] c = new String[size];
            int cc = 0;
            for (int i = 0; i < elementos.size(); i++) {
                if (cc < size) {
                    c[cc] = (String) elementos.get(i);
                }
                cc++;
                if (cc == size) {
                    modelo.addRow(c);
                    cc = 0;
                    //System.out.println("y");
                }
            }
            jt_listaR.setModel(modelo);
            elementos.clear();
            jd_listarRegistros.setModal(true);
            jd_listarRegistros.pack();
            jd_listarRegistros.setLocationRelativeTo(this);
            jd_listarRegistros.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jmi_listarRActionPerformed

//    public void llenaTabla() {
//        DefaultTableModel modelo = new DefaultTableModel();
//        int size = campos.size();
//        //for (int i = 0; i < size; i++) {
//        for (int i = 0; i < campos.size(); i++) {
//            modelo.addColumn(campos.get(i).getNombreCampo());
//        }
//        String[] c = new String[size];
//        int cc = 0;
//        for (int i = 0; i < elementos.size(); i++) {
//            for (int j = 0; j < size; j++) {
//                c[j] = (String) elementos.get(j + cc);
//                cc++;
//            }
//            modelo.addRow(c);
//        }
//        jt_listaR.setModel(modelo);
//    }

    private void jmi_cruzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_cruzarActionPerformed
        // TODO add your handling code here:
        try {
            ArrayList<Campo> temporal = new ArrayList();
            JFileChooser abrir = new JFileChooser();
            FileFilter filtro = new FileNameExtensionFilter("Archivos de texto(.txt)", "txt");
            abrir.setFileFilter(filtro);
            int valor = abrir.showOpenDialog(abrir);
            if (valor == JFileChooser.APPROVE_OPTION) {
                rutaCruzar = abrir.getSelectedFile().getPath();
            }
            temporal = obtenerCampos();
            DefaultTableModel modelo = new DefaultTableModel();
            int size = campos.size();
            int size2 = temporal.size() - 1;
            int total = size + size2;
            //for (int i = 0; i < size; i++) {
            modelo.addColumn("Nombre");
            modelo.addColumn("Tipo");
            modelo.addColumn("longitud");
            modelo.addColumn("Llave primaria");
            String[] c = new String[4];
            int cc = 0;
            for (int i = 0; i < size; i++) {
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
            for (int i = 0; i < size2; i++) {
                String tipo = "";
                if (temporal.get(i).getTipo() == 0) {
                    tipo = "int";
                }
                if (temporal.get(i).getTipo() == 1) {
                    tipo = "String";
                }
                if (temporal.get(i).getTipo() == 2) {
                    tipo = "double";
                }
                if (temporal.get(i).getTipo() == 3) {
                    tipo = "char";
                }
                c[0] = temporal.get(i).getNombreCampo();
                c[1] = tipo;
                c[2] = Integer.toString(temporal.get(i).getLongitud());
                if (temporal.get(i).isLlave() == false) {
                    c[3] = "No";
                } else {
                    c[3] = "Si";
                }
                modelo.addRow(c);
            }
            jt_camposC.setModel(modelo);
            jd_cruzarAr.setModal(true);
            jd_cruzarAr.pack();
            jd_cruzarAr.setLocationRelativeTo(this);
            jd_cruzarAr.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jmi_cruzarActionPerformed
    public ArrayList<Campo> obtenerCampos() throws IOException {
        Scanner lea = null;
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        ArrayList<Campo> other = new ArrayList();
        //Scanner lea2 = null;
        try {
//            File archivo = new File(ruta);
            archivo = new File(rutaCruzar); //cualquier ruta
            fr = new FileReader(archivo); //apunta al archivo
            br = new BufferedReader(fr); //apunta al canalF
            lea = new Scanner(archivo);
            String nombrec = "";
            int tipo, longitud;
            boolean llave = false;
            lea.useDelimiter("|");
            String texto = "", texto2 = "";
            int c = 0;
            while ((texto = br.readLine()) != null) {  //leer archivo de texto            
                if (c == 0) {
                    texto2 += texto;
                }
                c++;
            }
            StringTokenizer tokens = new StringTokenizer(texto2, "|");
            while (tokens.hasMoreTokens()) {
                String texto3 = tokens.nextToken();
                StringTokenizer tokens2 = new StringTokenizer(texto3, ",");
                //int c = 0, c2 = 0;
                while (tokens2.hasMoreTokens()) {
//                        System.out.println(tokens2.nextToken());
//                        System.out.println(c);
//                        c=c+1;
                    nombrec = tokens2.nextToken();
                    tipo = Integer.parseInt(tokens2.nextToken());
                    longitud = Integer.parseInt(tokens2.nextToken());
                    if ("true".equals(tokens2.nextToken())) {
                        llave = true;
                    } else {
                        llave = false;
                    }
                    other.add(new Campo(nombrec, tipo, longitud, llave));
                }
            }
            JOptionPane.showMessageDialog(this, "Archivo cargado con exito");
            //System.out.println(texto);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error, archivo de texto no compatible");
        }
        br.close();
        fr.close();
        return other;
    }
    private void adelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adelanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adelanteActionPerformed

    private void adelanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adelanteMouseClicked
        // TODO add your handling code here:
        try {

        } catch (Exception e) {
        }
    }//GEN-LAST:event_adelanteMouseClicked

    private void atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseClicked
        // TODO add your handling code here:
        try {

        } catch (Exception e) {
        }
    }//GEN-LAST:event_atrasMouseClicked

    private void jb_introDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_introDMouseClicked
        // TODO add your handling code here:
        try {
            if (jt_introR.getSelectedRow() >= 0) {
//                campos.get(jt_modificarC.getSelectedRow()).setNombreCampo(tf_nombrecampo1.getText());
//                campos.get(jt_modificarC.getSelectedRow()).setTipo(cb_tipo1.getSelectedIndex());
//                campos.get(jt_modificarC.getSelectedRow()).setLongitud((int) sp_size1.getValue());
                if (jt_introR.getValueAt(jt_introR.getSelectedRow(), 1) == "int") {
                    int dato = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese el dato tipo int"));
                    jt_introR.setValueAt(Integer.toString(dato), jt_introR.getSelectedRow(), 4);
                }
                if (jt_introR.getValueAt(jt_introR.getSelectedRow(), 1) == "String") {
                    String dato = JOptionPane.showInputDialog(this, "Ingrese el dato tipo String");
                    if (dato.length() > Integer.parseInt((String) jt_introR.getValueAt(jt_introR.getSelectedRow(), 2))) {
                        JOptionPane.showMessageDialog(this, "error, el String es muy grande");
                    } else {
                        jt_introR.setValueAt(dato, jt_introR.getSelectedRow(), 4);
                    }
                }
                if (jt_introR.getValueAt(jt_introR.getSelectedRow(), 1) == "double") {
                    double dato = Double.parseDouble(JOptionPane.showInputDialog(this, "Ingrese el dato tipo double"));
                    jt_introR.setValueAt(dato, jt_introR.getSelectedRow(), 4);
                }
                if (jt_introR.getValueAt(jt_introR.getSelectedRow(), 1) == "char") {
                    char origen = JOptionPane.showInputDialog(this, "Ingrese el dato tipo char").charAt(0);
//                    if (origen.length() > 0) {
//                        JOptionPane.showMessageDialog(this, "Error, este dato no es un char");
//                    } else {
//                        char dato = origen.charAt(0);
                    jt_introR.setValueAt(origen, jt_introR.getSelectedRow(), 4);
//                    }
                    //char dato=JOptionPane.showInputDialog(this, "Ingrese el dato tipo char");
                }
//                if (jt_introR.getValueAt(jt_introR.getSelectedRow(), 3) == "Si") {
//                    tree.insertar((int) jt_introR.getValueAt(jt_introR.getSelectedRow(), 4));
//                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error, dato incorrecto ingresado");
        }
    }//GEN-LAST:event_jb_introDMouseClicked

    private void jb_introRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_introRMouseClicked
        // TODO add your handling code here:
        try {
            int size = jt_introR.getRowCount();
            boolean probar = false;
            for (int i = 0; i < size; i++) {
                if (jt_introR.getValueAt(i, 4) == "") {
                    probar = true;
                }
//                if (jt_introR.getValueAt(i, 1) == "int") {
//                    if (jt_introR.getValueAt(i, 4) instanceof String) {
//                        probar = true;
//                    }
//                }
                if (jt_introR.getValueAt(i, 1) == "String") {
                    if (((String) jt_introR.getValueAt(i, 4)).length() > Integer.parseInt((String) jt_introR.getValueAt(i, 2))) {
                        probar = true;
                        // JOptionPane.showMessageDialog(this, "error, el String es muy grande");
                    }
                }
//                if (jt_introR.getValueAt(i, 1) == "double") {
//                    if (jt_introR.getValueAt(i, 4) instanceof String) {
//                        probar = true;
//                    }
//                }
                if (jt_introR.getValueAt(i, 1) == "char") {
                    if (((String) jt_introR.getValueAt(i, 4)).length() > 1) {
                        probar = true;
                        // JOptionPane.showMessageDialog(this, "error, el String es muy grande");
                    }
                }
            }
            if (probar == true) {
                JOptionPane.showMessageDialog(this, "Error, por favor llene correctamente todos los campos");
            } else {
                for (int i = 0; i < size; i++) {
                    elementos.add(jt_introR.getValueAt(i, 4));
//                    elementos.add(jt_introR.getValueAt(i, 4));
//                    elementos.add(jt_introR.getValueAt(i, 4));
//                    elementos.add(jt_introR.getValueAt(i, 4));
//                    elementos.add(jt_introR.getValueAt(i, 4));
                    if (jt_introR.getValueAt(i, 3) == "Si") {
                        //System.out.println("y");
                        tree.insertar(Integer.parseInt((String) jt_introR.getValueAt(i, 4)));
                        k = Integer.parseInt((String) jt_introR.getValueAt(i, 4));
                        escribirArbol();
                        //guardar();
                    }
                }
//                if (jt_introR.getValueAt(jt_introR.getSelectedRow(), 3) == "Si") {
//                    System.out.println("y");
//                    tree.insertar(Integer.parseInt((String) jt_introR.getValueAt(jt_introR.getSelectedRow(), 4)));
//                }
                String regist2 = "\n|";
                for (int i = 0; i < elementos.size(); i++) {
                    regist2 += elementos.get(i) + "|";
                }
//                System.out.println(regist2);
//                Path path = Paths.get(rutaAbierto);
//                List<String> lineas = Files.readAllLines(path);
//                lineas = lineas.stream()
//                        .filter(linea -> !linea.contains(regist))
//                        .collect(Collectors.toList());
//                Files.write(path, lineas);
                File archivo = null;
                FileWriter escribir = null;
                if (Abrir) {
                    archivo = new File(rutaAbierto);
                    escribir = new FileWriter(archivo, true);
                } else {
                    archivo = new File(rutaAbierto + ".txt");
                    escribir = new FileWriter(archivo, true);
                }
//                FileWriter escribir = new FileWriter(archivo, true);
                escribir.append(regist2);
                escribir.close();
                jm_campos.setEnabled(false);
                JOptionPane.showMessageDialog(this, "Registro agregado con exito");
                String ind = "\n" + Integer.toString(k);
                File archivo2 = new File(ruta3);
                FileWriter escribir2 = new FileWriter(archivo2, true);
                escribir2.append(ind);
                escribir2.close();
                elementos.clear();
                for (int i = 0; i < size; i++) {
                    jt_introR.setValueAt("", i, 4);
                }
            }
//            for (int i = 0; i < size; i++) {
//                elementos.add(jt_introR.getValueAt(i, 0));
//                elementos.add(jt_introR.getValueAt(i, 1));
//                elementos.add(jt_introR.getValueAt(i, 2));
//                elementos.add(jt_introR.getValueAt(i, 3));
//                elementos.add(jt_introR.getValueAt(i, 4));
//            }
//            JOptionPane.showMessageDialog(this, "Registro agregado con exito");
//            for (int i = 0; i < size; i++) {
//                jt_introR.setValueAt("", i, 4);
//            }
        } catch (Exception e) {
            //e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error, llene correctamente los campos");
        }
    }//GEN-LAST:event_jb_introRMouseClicked
    void guardar() throws IOException {
        String texto = "";
        File archivo = null;
        FileWriter escribir = null;
        if (Abrir) {
            archivo = new File(rutaAbierto);
            escribir = new FileWriter(archivo);
        } else {
            archivo = new File(rutaAbierto + ".txt");
            escribir = new FileWriter(archivo);
        }
//            archivo = new File(rutaAbierto);
//            escribir = new FileWriter(archivo);
        texto += "|";
        for (int i = 0; i < campos.size(); i++) {
            //texto+=campos.get(i).toString();
            texto += campos.get(i).getNombreCampo() + "," + campos.get(i).getTipo() + "," + campos.get(i).getLongitud() + "," + campos.get(i).isLlave() + "|";
        }
        texto += "\n|";
        int cc = 0;
        for (int i = 0; i < elementos.size(); i++) {
            if (cc < campos.size()) {
                texto += elementos.get(i) + "|";
            }
            cc++;
            if (cc == campos.size()) {
                texto += "\n";
                cc = 0;
                if (i == elementos.size() - 1) {

                } else {
                    texto += "|";
                }
                //System.out.println("y");
            }
        }
        //texto = campos.toString();
//            rb_yes.setEnabled(true);
//            rb_no.setEnabled(true);
        System.out.println(rutaAbierto);
        System.out.println(ruta2);
        System.out.println(ruta3);
        if (elementos.isEmpty()) {

        } else {
            escribirArbol();
        }

        escribir.append(texto);
        escribir.close();
    }
    private void op1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_op1MouseClicked
        // TODO add your handling code here:
        try {
            int key = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese la llave a buscar"));
//            ArrayList busqueda2 = tree.busqueda(tree.raiz, key);
            int ii = 0;
            ArrayList busqueda2 = tree.busqueda(key);
            if (key == (int) busqueda2.get(0)) {
                k = key;
                DefaultTableModel modelo = new DefaultTableModel();
                int size = campos.size();
                //for (int i = 0; i < size; i++) {
                for (int i = 0; i < campos.size(); i++) {
                    modelo.addColumn(campos.get(i).getNombreCampo());
                }
                int c = 0, c2 = 0;
                int indice = (int) busqueda2.get(1);
                in = indice;
                //System.out.println(in);
                String[] cc = new String[size];
                String result;
                Path filePath = Paths.get(rutaAbierto);
                leerIndices();
                for (int i = 0; i < indices.size(); i++) {
                    if (k == Integer.parseInt((String) indices.get(i))) {
                        break;
                    } else {
                        c2++;
                    }
                }
                try (Stream<String> lines = Files.lines(filePath)) {
                    result = lines.skip(c2 + 1).findFirst().get();
                }
                //System.out.println(result);
                StringTokenizer tokens = new StringTokenizer(result, "|");
                while (tokens.hasMoreTokens()) {
                    elementos.add(tokens.nextToken());
                }
                regist = "|";
                for (int i = 0; i < elementos.size(); i++) {
                    regist += elementos.get(i) + "|";
                }
                for (int i = 0; i < elementos.size(); i++) {
                    if (c < size) {
                        cc[c] = (String) elementos.get(i);
                    }
                    c++;
                    if (c == size) {
                        modelo.addRow(cc);
                        c = 0;
                        //System.out.println("y");
                    }
                }
                tablaBM.setModel(modelo);
                jd_op1.setModal(true);
                jd_op1.pack();
                jd_op1.setLocationRelativeTo(this);
                jd_op1.setVisible(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error, registro no existe");
            //e.printStackTrace();
        }
    }//GEN-LAST:event_op1MouseClicked

    public static void imprimir(Nodo nodo, int iAltura) {
        char c[] = new char[iAltura];
        for (int i = 0; i < c.length; i++) {
            c[i] = '-';
        }
        if (nodo == null) {
            return;
        }
        System.out.print(new String(c) + "[");
        for (int i = 0; i < nodo.n; i++) {
            if (i == 0) {
                System.out.print(nodo.llaves[i]);
            } else {
                System.out.print(", " + nodo.llaves[i]);
            }
        }
        System.out.println("]");
        iAltura++;
        for (int i = 0; i < nodo.orden; i++) {
            imprimir(nodo.puntadores[i], iAltura);
        }
    }

    private void modificar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificar1MouseClicked
        // TODO add your handling code here:
        try {
            if (tablaBM.getSelectedRow() >= 0) {
//                boolean si;
//                ArrayList busqueda2 = tree.busqueda(tree.raiz, k);
//                if (k == (int) busqueda2.get(0)) {
//
//                }
                int c = 1, cc = 0;
                int size = campos.size();
//                int c = 0, c2 = 1;
//                int indice = (int) busqueda2.get(1);
//                in = indice;
//                String[] cc = new String[size];
                for (int i = 0; i < elementos.size(); i++) {
                    //System.out.println(elementos.get(i));
                    if (Character.isDigit(((String) elementos.get(i)).charAt(0))) {
                        //System.out.println("entro");
                        if (Integer.parseInt((String) elementos.get(i)) == k) {
                            cc = elementos.indexOf(elementos.get(i));
                            int counter = 0;
                            for (int j = 0; j < campos.size(); j++) {
                                if (campos.get(j).getTipo() == 0) {
//                                    counter++;
                                    if (campos.get(j).isLlave()) {
                                        break;
                                    }
//                                    counter++;
                                }
                                if (campos.get(j).getTipo() == 1) {
//                                    counter++;
                                    if (campos.get(j).isLlave()) {
                                        break;
                                    }
//                                    counter++;
                                }
                                if (campos.get(j).getTipo() == 2) {
//                                    counter++;
                                    if (campos.get(j).isLlave()) {
                                        break;
                                    }
//                                    counter++;
                                }
                                if (campos.get(j).getTipo() == 3) {
//                                    counter++;
                                    if (campos.get(j).isLlave()) {
                                        break;
                                    }
//                                    counter++;
                                }
                                counter++;
                            }
                            cc = cc - counter;
                            for (int j = 0; j < size; j++) {
                                elementos.set(cc, tablaBM.getValueAt(0, j));
                                cc++;
                                //System.out.println(c2);
                            }
                        }
                    }
                }
                String regist2 = "|";
                for (int i = 0; i < elementos.size(); i++) {
                    regist2 += elementos.get(i) + "|";
                }
                for (int i = 0; i < campos.size(); i++) {
                    if (campos.get(i).isLlave()) {
                        indic = (String) elementos.get(i);
                    }
                }
//                System.out.println(regist2);
                Path path = Paths.get(rutaAbierto);
                List<String> lineas = Files.readAllLines(path);
                lineas = lineas.stream()
                        .filter(linea -> !linea.contains(regist))
                        .collect(Collectors.toList());
                Files.write(path, lineas);
                File archivo = new File(rutaAbierto);
                FileWriter escribir = new FileWriter(archivo, true);
                escribir.append(regist2);
                escribir.close();
                Path path2 = Paths.get(ruta3);
                List<String> lineas2 = Files.readAllLines(path2);
                lineas2 = lineas2.stream()
                        .filter(linea -> !linea.contains(indic))
                        .collect(Collectors.toList());
                Files.write(path2, lineas2);
                File archivo2 = new File(ruta3);
                FileWriter escribir2 = new FileWriter(archivo2, true);
                escribir2.append(indic);
                escribir2.close();
//                for (int i = 0; i < elementos.size(); i++) {
//                    if (cc < size) {
//                        elementos.set(in, tablaBM.getValueAt(0, i));
//                        //System.out.println(indice);
//                        in = in + c;
//                    }
//                    cc++;
//                    if (cc == size) {
//                        break;
//                        //System.out.println("y");
//                    }
//                }
//                elementos.set(in, tablaBM.getValueAt(0, i));
//                
//                for (int i = 0; i < tablaBM.getRowCount(); i++) {
//                    tablaBM.setValueAt("", 0, i);
//                }
                //guardar();
                elementos.clear();
                jd_op1.setVisible(false);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_modificar1MouseClicked

    private void bbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bbMouseClicked
        // TODO add your handling code here:
        imprimir(tree.raiz, 0);
    }//GEN-LAST:event_bbMouseClicked

    private void jb_seleccionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_seleccionarMouseClicked
        // TODO add your handling code here:
        try {
            //System.out.println(jt_camposC.getValueAt(jt_camposC.getSelectedRow(), 0));
            boolean bandera = false;
            if (t2.isEmpty()) {
                t2.add(new Campo());
                if (jt_camposC.getValueAt(jt_camposC.getSelectedRow(), 1) == "int") {
                    t2.get(t2.size() - 1).setTipo(0);
                }
                if (jt_camposC.getValueAt(jt_camposC.getSelectedRow(), 1) == "String") {
                    t2.get(t2.size() - 1).setTipo(1);
                }
                if (jt_camposC.getValueAt(jt_camposC.getSelectedRow(), 1) == "double") {
                    t2.get(t2.size() - 1).setTipo(2);
                }
                if (jt_camposC.getValueAt(jt_camposC.getSelectedRow(), 1) == "char") {
                    t2.get(t2.size() - 1).setTipo(3);
                }
                t2.get(t2.size() - 1).setNombreCampo((String) jt_camposC.getValueAt(jt_camposC.getSelectedRow(), 0));
                t2.get(t2.size() - 1).setLongitud(Integer.parseInt((String) jt_camposC.getValueAt(jt_camposC.getSelectedRow(), 2)));
                if (jt_camposC.getValueAt(jt_camposC.getSelectedRow(), 3) == "No") {
                    t2.get(t2.size() - 1).setLlave(false);
                } else {
                    t2.get(t2.size() - 1).setLlave(true);
                }
                //System.out.println(t2.get(t2.size() - 1).toString());
                JOptionPane.showMessageDialog(this, "Campo agregado");
            } else {
                for (int i = 0; i < t2.size(); i++) {
                    if (jt_camposC.getValueAt(jt_camposC.getSelectedRow(), 0) == t2.get(i).getNombreCampo()) {
//                        System.out.println(t2.get(i).getNombreCampo());
                        bandera = true;
                    }
                }
                if (bandera) {
                    JOptionPane.showMessageDialog(this, "campo ya agregado, por favor escoja otro");
                } else {
                    t2.add(new Campo());
                    if (jt_camposC.getValueAt(jt_camposC.getSelectedRow(), 1) == "int") {
                        t2.get(t2.size() - 1).setTipo(0);
                    }
                    if (jt_camposC.getValueAt(jt_camposC.getSelectedRow(), 1) == "String") {
                        t2.get(t2.size() - 1).setTipo(1);
                    }
                    if (jt_camposC.getValueAt(jt_camposC.getSelectedRow(), 1) == "double") {
                        t2.get(t2.size() - 1).setTipo(2);
                    }
                    if (jt_camposC.getValueAt(jt_camposC.getSelectedRow(), 1) == "char") {
                        t2.get(t2.size() - 1).setTipo(3);
                    }
                    t2.get(t2.size() - 1).setNombreCampo((String) jt_camposC.getValueAt(jt_camposC.getSelectedRow(), 0));
                    t2.get(t2.size() - 1).setLongitud(Integer.parseInt((String) jt_camposC.getValueAt(jt_camposC.getSelectedRow(), 2)));
                    if (jt_camposC.getValueAt(jt_camposC.getSelectedRow(), 3) == "No") {
                        t2.get(t2.size() - 1).setLlave(false);
                    } else {
                        t2.get(t2.size() - 1).setLlave(true);
                    }
                    //System.out.println(t2.get(t2.size() - 1).toString());
                    JOptionPane.showMessageDialog(this, "Campo agregado");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jb_seleccionarMouseClicked

    private void jb_cruzarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_cruzarMouseClicked
        // TODO add your handling code here:
        try {
            boolean bandera = false;
            for (int i = 0; i < t2.size(); i++) {
                if (t2.get(i).isLlave()) {
                    bandera = true;
                }
            }
            if (bandera) {
                JFileChooser guardar = new JFileChooser();
                FileFilter filtro = new FileNameExtensionFilter("Archivos de texto(.txt)", "txt");
                guardar.setFileFilter(filtro);
                guardar.showSaveDialog(null);
                //guardar.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

                File archivo = guardar.getSelectedFile();
                //File archivo=new File(g)
                String rutaTemp = archivo.getPath();
                String texto = "";
                //File archivo = null;
                FileWriter escribir = null;
                archivo = new File(rutaTemp + ".txt");
                escribir = new FileWriter(archivo);
//            archivo = new File(rutaAbierto);
//            escribir = new FileWriter(archivo);
                texto += "|";
                for (int i = 0; i < t2.size(); i++) {
                    //texto+=campos.get(i).toString();
                    texto += t2.get(i).getNombreCampo() + "," + t2.get(i).getTipo() + "," + t2.get(i).getLongitud() + "," + t2.get(i).isLlave() + "|";
                }
                escribir.append(texto);
                escribir.close();
                DefaultTableModel modelo = new DefaultTableModel();
                int size = t2.size();
                modelo.addColumn("Nombre");
                modelo.addColumn("Tipo");
                modelo.addColumn("longitud");
                modelo.addColumn("Llave primaria");
                tablafinal.setModel(modelo);
                String[] c = new String[4];
                for (int i = 0; i < size; i++) {
                    //String tipo = Integer.toString(campos.get(i).getTipo());
                    String tipo = "";
                    if (t2.get(i).getTipo() == 0) {
                        tipo = "int";
                    }
                    if (t2.get(i).getTipo() == 1) {
                        tipo = "String";
                    }
                    if (t2.get(i).getTipo() == 2) {
                        tipo = "double";
                    }
                    if (t2.get(i).getTipo() == 3) {
                        tipo = "char";
                    }
                    c[0] = t2.get(i).getNombreCampo();
                    c[1] = tipo;
                    c[2] = Integer.toString(t2.get(i).getLongitud());
                    if (t2.get(i).isLlave() == false) {
                        c[3] = "No";
                    } else {
                        c[3] = "Si";
                    }
                    modelo.addRow(c);
                }
                tablafinal.setModel(modelo);
                t2.clear();
                ArchivoFinal.setModal(true);
                ArchivoFinal.pack();
                ArchivoFinal.setLocationRelativeTo(this);
                ArchivoFinal.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Error, no ha seleccionado una llave primaria, agregue y vuelva a intentarlo");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jb_cruzarMouseClicked

    private void jb_bkeyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_bkeyMouseClicked
        // TODO add your handling code here:
        try {
            int key = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese la llave del registro a eliminar"));
            //ArrayList busqueda2 = tree.busqueda(tree.raiz, key);
            int ii = 0;
            ArrayList busqueda2 = tree.busqueda(key);
            if (key == (int) busqueda2.get(0)) {
                elementos.clear();
                //abrirArchivoRegistros(rutaAbierto);
                k = key;
                DefaultTableModel modelo = new DefaultTableModel();
                int size = campos.size();
                //for (int i = 0; i < size; i++) {
                for (int i = 0; i < campos.size(); i++) {
                    modelo.addColumn(campos.get(i).getNombreCampo());
                }
                int c = 0, c2 = 0;
                int indice = (int) busqueda2.get(1);
                in = indice;
                //System.out.println(in);
                String[] cc = new String[size];
//                String result;
                Path filePath = Paths.get(rutaAbierto);
                leerIndices();
                for (int i = 0; i < indices.size(); i++) {
                    if (k == Integer.parseInt((String) indices.get(i))) {
                        break;
                    } else {
                        c2++;
                    }
                }
                //System.out.println(c2);
                try (Stream<String> lines = Files.lines(filePath)) {
                    regist = lines.skip(c2 + 1).findFirst().get();
                }
                //System.out.println(result);
                StringTokenizer tokens = new StringTokenizer(regist, "|");
                while (tokens.hasMoreTokens()) {
                    elementos.add(tokens.nextToken());
                }
                for (int i = 0; i < elementos.size(); i++) {
                    if (c < size) {
                        cc[c] = (String) elementos.get(i);
                    }
                    c++;
                    if (c == size) {
                        modelo.addRow(cc);
                        c = 0;
                        //System.out.println("y");
                    }
                }
                jt_bkey.setModel(modelo);
                elementos.clear();
                indices.clear();
                jd_bkey.setModal(true);
                jd_bkey.pack();
                jd_bkey.setLocationRelativeTo(this);
                jd_bkey.setVisible(true);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jb_bkeyMouseClicked

    private void sibkeyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sibkeyMouseClicked
        // TODO add your handling code here:
        try {
            Path path = Paths.get(rutaAbierto);
            List<String> lineas = Files.readAllLines(path);
            lineas = lineas.stream()
                    .filter(linea -> !linea.contains(regist))
                    .collect(Collectors.toList());
            Files.write(path, lineas);
            Path path2 = Paths.get(ruta3);
            List<String> lineas2 = Files.readAllLines(path2);
            lineas = lineas2.stream()
                    .filter(linea2 -> !linea2.contains(Integer.toString(k)))
                    .collect(Collectors.toList());
            Files.write(path2, lineas2);
            tree.remover(k);
            regist = "";
            JOptionPane.showMessageDialog(this, "Registro eliminado con exito");
            jd_bkey.setVisible(false);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_sibkeyMouseClicked

    private void nobkeyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nobkeyMouseClicked
        // TODO add your handling code here:
        try {
            JOptionPane.showMessageDialog(this, "Saliendo");
            jb_bkey.setVisible(false);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_nobkeyMouseClicked

    private void jb_bkeysMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_bkeysMouseClicked
        // TODO add your handling code here:
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Llave");
            jt_bkeys.setModel(modelo);
            jd_bkeys.setModal(true);
            jd_bkeys.pack();
            jd_bkeys.setLocationRelativeTo(this);
            jd_bkeys.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jb_bkeysMouseClicked

    private void jb_addrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_addrMouseClicked
        // TODO add your handling code here:
        try {
            int llave = Integer.parseInt(JOptionPane.showInputDialog("Escriba la llave"));
            eliminart.add(llave);
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Llave");
            jt_bkeys.setModel(modelo);
            String[] cc = new String[1];
            for (int i = 0; i < eliminart.size(); i++) {
                cc[0] = Integer.toString((int) eliminart.get(i));
                modelo.addRow(cc);
            }
            jt_bkeys.setModel(modelo);
        } catch (Exception e) {
            // e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error, ingrese una llave correcta");
        }
    }//GEN-LAST:event_jb_addrMouseClicked

    private void jb_keysMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_keysMouseClicked
        // TODO add your handling code here:
        try {
//            String borrar;
            int c2 = 0, key;
            for (int i = 0; i < eliminart.size(); i++) {
                k = (int) eliminart.get(i);
                System.out.println(k);
                ArrayList busqueda2 = tree.busqueda(k);

                if (k == (int) busqueda2.get(0)) {
                    leerIndices();
                    for (int j = 0; j < indices.size(); j++) {
                        if (k == Integer.parseInt((String) indices.get(j))) {
                            break;
                        } else {
                            c2++;
                        }
                    }
                    System.out.println(c2);
                    Path path = Paths.get(rutaAbierto);
                    try (Stream<String> lines = Files.lines(path)) {
                        borrar = lines.skip(c2 + 1).findFirst().get();
                    }
//                    Path path = Paths.get(rutaAbierto);
                    List<String> lineas = Files.readAllLines(path);
                    lineas = lineas.stream()
                            .filter(linea -> !linea.contains(borrar))
                            .collect(Collectors.toList());
                    Files.write(path, lineas);
                    Path path2 = Paths.get(ruta3);
                    List<String> lineas2 = Files.readAllLines(path2);
                    lineas = lineas2.stream()
                            .filter(linea2 -> !linea2.contains(Integer.toString(k)))
                            .collect(Collectors.toList());
                    Files.write(path2, lineas2);
                    tree.remover(k);
                    c2 = 0;
                }
            }
            indices.clear();
            eliminart.clear();
            JOptionPane.showMessageDialog(this, "Registros borrados con exito");
            jd_bkeys.setVisible(false);
        } catch (Exception e) {
            //e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error fatal, dato ingresado incorrectamente");
        }
    }//GEN-LAST:event_jb_keysMouseClicked

    private void jb_keysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_keysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_keysActionPerformed

    private void selectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectMouseClicked
        // TODO add your handling code here:
        try {
            int c = 0;
            if (jt_bc.getSelectedRow() >= 0) {
                for (int i = 0; i < campos.size(); i++) {
                    if (jt_bc.getSelectedRow() == i) {
                        if (campos.get(i).getTipo() == 0) {
                            //tipo = "int";
                            int op = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese el dato tipo int para filtrar"));

                        }
                        if (campos.get(i).getTipo() == 1) {
                            //tipo = "String";
                            String op = JOptionPane.showInputDialog(this, "Ingrese el dato tipo String para filtrar");
                            while (op.length() > campos.get(i).getLongitud()) {
                                op = JOptionPane.showInputDialog(this, "Error, por favor ingrese el dato tipo String con longitud correcta para filtrar");
                            }
                        }
                        if (campos.get(i).getTipo() == 2) {
                            //tipo = "double";
                            Double op = Double.parseDouble(JOptionPane.showInputDialog(this, "Ingrese el dato tipo String para filtrar"));
                        }
                        if (campos.get(i).getTipo() == 3) {
                            //tipo = "char";
                            char op = JOptionPane.showInputDialog(this, "Ingrese el dato tipo String para filtrar").charAt(0);
                        }
                    }
                    c++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error, dato incorrecto");
        }
    }//GEN-LAST:event_selectMouseClicked

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
    private javax.swing.JDialog ArchivoFinal;
    private javax.swing.JButton adelante;
    private javax.swing.JButton atras;
    private javax.swing.JButton bb;
    private javax.swing.JButton btn_Salida;
    private javax.swing.JComboBox<String> cb_tipo;
    private javax.swing.JComboBox<String> cb_tipo1;
    private javax.swing.JButton crearC;
    private javax.swing.ButtonGroup grupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
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
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JButton jb_abrirAr;
    private javax.swing.JButton jb_addr;
    private javax.swing.JButton jb_bkey;
    private javax.swing.JButton jb_bkeys;
    private javax.swing.JButton jb_borrarC;
    private javax.swing.JButton jb_cruzar;
    private javax.swing.JButton jb_introD;
    private javax.swing.JButton jb_introR;
    private javax.swing.JButton jb_keys;
    private javax.swing.JButton jb_nuevoAr;
    private javax.swing.JButton jb_seleccionar;
    private javax.swing.JDialog jd_bc;
    private javax.swing.JDialog jd_bkey;
    private javax.swing.JDialog jd_bkeys;
    private javax.swing.JDialog jd_borrarC;
    private javax.swing.JDialog jd_borrarR;
    private javax.swing.JDialog jd_buscarR;
    private javax.swing.JDialog jd_crearC;
    private javax.swing.JDialog jd_cruzarAr;
    private javax.swing.JDialog jd_insertarR;
    private javax.swing.JDialog jd_listarRegistros;
    private javax.swing.JDialog jd_listarc;
    private javax.swing.JDialog jd_modi;
    private javax.swing.JDialog jd_modificarC;
    private javax.swing.JDialog jd_op1;
    private javax.swing.JDialog jd_opcionesM;
    private javax.swing.JMenu jm_archivo;
    private javax.swing.JMenu jm_campos;
    private javax.swing.JMenu jm_indices;
    private javax.swing.JMenu jm_registros;
    private javax.swing.JMenu jm_utilidades;
    private javax.swing.JMenuItem jmi_borrarCampos;
    private javax.swing.JMenuItem jmi_borrarR;
    private javax.swing.JMenuItem jmi_buscarR;
    private javax.swing.JMenuItem jmi_cerrarArchivo;
    private javax.swing.JMenuItem jmi_crearCampo;
    private javax.swing.JMenuItem jmi_crearI;
    private javax.swing.JMenuItem jmi_cruzar;
    private javax.swing.JMenuItem jmi_exportarE;
    private javax.swing.JMenuItem jmi_exportarXML;
    private javax.swing.JMenuItem jmi_guardarArchivo;
    private javax.swing.JMenuItem jmi_introducirR;
    private javax.swing.JMenuItem jmi_listarCampo;
    private javax.swing.JMenuItem jmi_listarR;
    private javax.swing.JMenuItem jmi_modificarCampo;
    private javax.swing.JMenuItem jmi_modificarR;
    private javax.swing.JMenuItem jmi_reIndexarA;
    private javax.swing.JTable jt_bc;
    private javax.swing.JTable jt_bkey;
    private javax.swing.JTable jt_bkeys;
    private javax.swing.JTable jt_borrarC;
    private javax.swing.JTable jt_campos;
    private javax.swing.JTable jt_camposC;
    private javax.swing.JTable jt_introR;
    private javax.swing.JTable jt_listaR;
    private javax.swing.JTable jt_modificarC;
    private javax.swing.JTable jt_xml;
    private javax.swing.JButton modificar1;
    private javax.swing.JButton nobkey;
    private javax.swing.JButton op1;
    private javax.swing.JButton rb_modi;
    private javax.swing.JButton rb_modificarF;
    private javax.swing.JRadioButton rb_no;
    private javax.swing.JRadioButton rb_no1;
    private javax.swing.JRadioButton rb_yes;
    private javax.swing.JRadioButton rb_yes1;
    private javax.swing.JButton select;
    private javax.swing.JButton sibkey;
    private javax.swing.JSpinner sp_size;
    private javax.swing.JSpinner sp_size1;
    private javax.swing.JTable tablaBM;
    private javax.swing.JTable tablaBM1;
    private javax.swing.JTable tablafinal;
    private javax.swing.JTextField tf_nombrecampo;
    private javax.swing.JTextField tf_nombrecampo1;
    // End of variables declaration//GEN-END:variables
    ArrayList<Campo> campos = new ArrayList();
    ArrayList<Campo> t2 = new ArrayList();
    ArrayList elementos = new ArrayList();
    ArrayList eliminart = new ArrayList();
    boolean Abrir, camposm;
    //Nodo raiz;
    int in, k;
    String rutaAbierto, indic, borrar;
    String ruta2, ruta3, rutaCruzar, regist;
    ArrayList indices = new ArrayList();
    ArbolB tree;
}
