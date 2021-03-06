package Ventanas.Contabilidad;

import Clases.Apoyo.Conexion;
import Clases.Apoyo.PlaceHolder;
import Clases.Apoyo.Utilities;
import Clases.Generales.Salario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Salario_base extends javax.swing.JInternalFrame {

    Salario salarioobj = new Salario();
    Utilities ut = new Utilities();

    public Salario_base() {

        initComponents();

        //Modelando
        setTitle("Salarios base");
        setSize(950, 494);
        setLocation(165, 103);

        //Mostrando tabla de salarios base
        DefaultTableModel model = (DefaultTableModel) salariosTbl.getModel();

        new Thread() {

            @Override
            public void run() {

                loading.setVisible(true);
                salariosTbl.setModel(salarioobj.mostrarSalarios(model));
                loading.setVisible(false);

            }

        }.start();

        //Placeholder
        PlaceHolder X = new PlaceHolder("Tipo de cargo", buscarTxt);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        AceptarcambiosBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cargoTxt = new javax.swing.JTextField();
        tipoTxt = new javax.swing.JTextField();
        ingresoTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        salarioTxt = new javax.swing.JTextField();
        cerrar = new javax.swing.JButton();
        loading = new javax.swing.JLabel();
        buscarTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        buscarBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        salariosTbl = new javax.swing.JTable();
        editarBtn = new javax.swing.JButton();
        eliminarBtn = new javax.swing.JButton();

        jFrame1.setAlwaysOnTop(true);
        jFrame1.setUndecorated(true);
        jFrame1.setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        AceptarcambiosBtn.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        AceptarcambiosBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/JOption/cheque.png"))); // NOI18N
        AceptarcambiosBtn.setText("Aceptar");
        AceptarcambiosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarcambiosBtnActionPerformed(evt);
            }
        });

        jPanel2.setBackground(java.awt.Color.orange);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel3.setText("Editar Salario Base");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/N??mina/salario.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel3)
                .addGap(116, 116, 116)
                .addComponent(jLabel4)
                .addContainerGap(253, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel5.setText("Cargo:");

        cargoTxt.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N

        tipoTxt.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N

        ingresoTxt.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel6.setText("Tipo:");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel7.setText("Ingreso horas extras:");

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel8.setText("Salario base:");

        salarioTxt.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N

        cerrar.setText("X");
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(salarioTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                    .addComponent(cargoTxt)
                    .addComponent(tipoTxt)
                    .addComponent(ingresoTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AceptarcambiosBtn)
                .addGap(64, 64, 64))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cerrar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(cerrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cargoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tipoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(ingresoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(AceptarcambiosBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salarioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(217, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setClosable(true);
        setTitle("Salarios base");
        setToolTipText("");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loading.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/Otros/cargando.gif"))); // NOI18N
        getContentPane().add(loading, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, -1));

        buscarTxt.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        getContentPane().add(buscarTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 11, 175, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel2.setText("Buscar:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, -1, -1));

        buscarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/Otros/seo.png"))); // NOI18N
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(buscarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 11, -1, -1));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jLabel1.setText("Tabla de salarios base");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 55, -1, -1));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        salariosTbl.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        salariosTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cargo", "Tipo de cargo", "Salario", "Ingreso/HoraExtra"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(salariosTbl);
        if (salariosTbl.getColumnModel().getColumnCount() > 0) {
            salariosTbl.getColumnModel().getColumn(0).setResizable(false);
            salariosTbl.getColumnModel().getColumn(0).setPreferredWidth(10);
            salariosTbl.getColumnModel().getColumn(1).setResizable(false);
            salariosTbl.getColumnModel().getColumn(1).setPreferredWidth(160);
            salariosTbl.getColumnModel().getColumn(2).setResizable(false);
            salariosTbl.getColumnModel().getColumn(2).setPreferredWidth(100);
            salariosTbl.getColumnModel().getColumn(3).setResizable(false);
            salariosTbl.getColumnModel().getColumn(4).setResizable(false);
            salariosTbl.getColumnModel().getColumn(4).setPreferredWidth(20);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 83, 779, 338));

        editarBtn.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        editarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/Login/editar-documento.png"))); // NOI18N
        editarBtn.setText("Editar");
        editarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(editarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(807, 162, 117, -1));

        eliminarBtn.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        eliminarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/Otros/expediente.png"))); // NOI18N
        eliminarBtn.setText("Eliminar");
        eliminarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(807, 251, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed

        DefaultTableModel model = (DefaultTableModel) salariosTbl.getModel();
        String buscar = buscarTxt.getText().trim();

        salarioobj.mostrarSalarios(buscar, model);

    }//GEN-LAST:event_buscarBtnActionPerformed

    private void editarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBtnActionPerformed

        int SelectedRow = salariosTbl.getSelectedRow();

        if (SelectedRow == -1) {

            Icon icon = new ImageIcon(getClass().getResource("../../Recursos/Iconos/JOption/advertencia.png"));
            JOptionPane.showMessageDialog(null, "Por favor, seleccione un registro a editar.", " -  Advertencia",
                    JOptionPane.PLAIN_MESSAGE, icon);

        } else {
            
            //Poniendo los datos en la ventana de editar, segun el campo.
            cargoTxt.setText((String) salariosTbl.getValueAt(SelectedRow, 1));
            tipoTxt.setText((String) salariosTbl.getValueAt(SelectedRow, 2));
            salarioTxt.setText(Float.toString((float) salariosTbl.getValueAt(SelectedRow, 3)));
            ingresoTxt.setText(Float.toString((float) salariosTbl.getValueAt(SelectedRow, 4)));
            
            jFrame1.setVisible(true);
            jFrame1.setSize(772, 450);
            jFrame1.setLocationRelativeTo(null);
            jFrame1.setAlwaysOnTop(false);

        }

    }//GEN-LAST:event_editarBtnActionPerformed

    private void AceptarcambiosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarcambiosBtnActionPerformed

        //Variables
        String Cargo = cargoTxt.getText();
        String Tipo = tipoTxt.getText();
        int Val = 0;
        float salario = 0, horas = 0;
        boolean FloatOk = true;
        
        //Validando campos de edicion
        if (Cargo.equals("")) {

            Val++;

        }if (Tipo.equals("")) {

            Val++;

        }if(ut.isFloat(salarioTxt.getText())) {

            salario = Float.parseFloat(salarioTxt.getText());

        } else {

            FloatOk = false;

        }if (ut.isFloat(ingresoTxt.getText())) {

            horas = Float.parseFloat(ingresoTxt.getText());

        } else {

            FloatOk = false;

        }

        int ID = (int) salariosTbl.getValueAt(salariosTbl.getSelectedRow(), 0);

        if (Val == 0) {

            if (FloatOk) {

                try {

                    Connection cn = Conexion.conectar();
                    PreparedStatement pst = cn.prepareStatement("update SalariosBase set Cargo = ?, TipoCargo = ?,"
                            + "Salario = ?, HoraExtra = ?"
                            + " where ID_Salario = '" + ID + "'");

                    pst.setString(1, Cargo);
                    pst.setString(2, Tipo);
                    pst.setFloat(3, salario);
                    pst.setFloat(4, horas);
                    pst.execute();

                    Icon icon = new ImageIcon(getClass().getResource("../../Recursos/Iconos/JOption/cheque.png"));
                    JOptionPane.showMessageDialog(null, "Registro editado con exito.", " -  Info",
                            JOptionPane.PLAIN_MESSAGE, icon);
                    
                    jFrame1.setVisible(false);
                    
                    cargoTxt.setText("");
                    tipoTxt.setText("");
                    salarioTxt.setText("");
                    ingresoTxt.setText("");
                    
                    DefaultTableModel model = (DefaultTableModel) salariosTbl.getModel();
                    
                    while(model.getRowCount() != 0){
                        
                        model.removeRow(0);
                        
                    }
                    
                    salariosTbl.setModel(salarioobj.mostrarSalarios(model));

                } catch (SQLException e) {

                    System.err.println("Error al actualizar salario base." + e);

                }

            } else {

                Icon icon = new ImageIcon(getClass().getResource("../../Recursos/Iconos/JOption/advertencia.png"));
                JOptionPane.showMessageDialog(null, "Por favor, ingrese valores validos para los campos\n"
                        + "salario e ingreso por horas extras.", " -  Advertencia",
                        JOptionPane.PLAIN_MESSAGE, icon);

            }

        } else {

            Icon icon = new ImageIcon(getClass().getResource("../../Recursos/Iconos/JOption/advertencia.png"));
            JOptionPane.showMessageDialog(null, "Por favor, rellene todos los campos.", " -  Advertencia",
                    JOptionPane.PLAIN_MESSAGE, icon);

        }

    }//GEN-LAST:event_AceptarcambiosBtnActionPerformed

    private void eliminarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBtnActionPerformed

        //Variables
        int selectedRow = salariosTbl.getSelectedRow();

        if (selectedRow == -1) {

            Icon icon = new ImageIcon(getClass().getResource("../../Recursos/Iconos/JOption/advertencia.png"));
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila a eliminar.", " -  Advertencia",
                    JOptionPane.PLAIN_MESSAGE, icon);

        } else {

            int ID = (int) salariosTbl.getValueAt(selectedRow, 0);

            try {

                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("delete from SalariosBase where ID_Salario = '"
                        + ID + "'");

                pst.execute();

                Icon icon = new ImageIcon(getClass().getResource("../../Recursos/Iconos/JOption/cheque.png"));
                JOptionPane.showMessageDialog(null, "Registro eliminado exitosamente.", " -  Info",
                        JOptionPane.PLAIN_MESSAGE, icon);

                DefaultTableModel model = (DefaultTableModel) salariosTbl.getModel();
                while (model.getRowCount() != 0) {

                    model.removeRow(0);

                }

                salariosTbl.setModel(salarioobj.mostrarSalarios(model));

            } catch (SQLException e) {

                System.err.println("Error al eliminar salario base" + e);

            }

        }

    }//GEN-LAST:event_eliminarBtnActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        
        jFrame1.setVisible(false);
        
    }//GEN-LAST:event_cerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarcambiosBtn;
    private javax.swing.JButton buscarBtn;
    private javax.swing.JTextField buscarTxt;
    private javax.swing.JTextField cargoTxt;
    private javax.swing.JButton cerrar;
    private javax.swing.JButton editarBtn;
    private javax.swing.JButton eliminarBtn;
    private javax.swing.JTextField ingresoTxt;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel loading;
    private javax.swing.JTextField salarioTxt;
    private javax.swing.JTable salariosTbl;
    private javax.swing.JTextField tipoTxt;
    // End of variables declaration//GEN-END:variables
}
