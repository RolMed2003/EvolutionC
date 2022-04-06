package Ventanas.Contabilidad;

import Clases.Apoyo.Conexion;
import Clases.Apoyo.Utilities;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Agregar extends javax.swing.JInternalFrame {

    Utilities ut = new Utilities();

    public Agregar() {

        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cargoTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        salarioTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tipotxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ingresoTxt = new javax.swing.JTextField();
        agregarBtn = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel1.setText("Cargo:");

        cargoTxt.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel2.setText("Tipo:");

        salarioTxt.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel3.setText("Salario base:");

        tipotxt.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel4.setText("Ingreso hora extra:");

        ingresoTxt.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N

        agregarBtn.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        agregarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/Otros/agregar-archivo.png"))); // NOI18N
        agregarBtn.setText("Agregar");
        agregarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salarioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipotxt)
                            .addComponent(cargoTxt)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(agregarBtn)
                            .addComponent(ingresoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cargoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tipotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(salarioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ingresoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(agregarBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBtnActionPerformed

        //Variables
        String cargo = cargoTxt.getText();
        String tipo = tipotxt.getText();
        boolean floatOK = true;
        float Salario = 0, horasExtra = 0;

        int Val = 0;

        //Validando 
        if (cargo.equals("")) {

            Val++;

        }
        if (tipo.equals("")) {

            Val++;

        }
        if (ut.isInt(ingresoTxt.getText())) {

            horasExtra = Float.parseFloat(ingresoTxt.getText());         

        }else{
            
            floatOK = false;
            
        }
        if (ut.isInt(salarioTxt.getText())) {

            Salario = Float.parseFloat(salarioTxt.getText());

        }else{
            
            floatOK = false;
            
        }

        //Guardando datos.
        if (Val == 0) {

            if (floatOK) {

                try {

                    Connection cn = Conexion.conectar();
                    PreparedStatement pst = cn.prepareStatement("insert into SalariosBase values (?,?,?,?,?)");

                    pst.setInt(1, 0);
                    pst.setString(2, cargo);
                    pst.setString(3, tipo);
                    pst.setFloat(4, Salario);
                    pst.setFloat(5, horasExtra);
                    pst.execute();

                    Icon icon = new ImageIcon(getClass().getResource("../../Recursos/Iconos/JOption/advertencia.png"));
                    JOptionPane.showMessageDialog(null, "Registro agregado exitosamente", " -  Info",
                            JOptionPane.PLAIN_MESSAGE, icon);

                } catch (SQLException e) {

                    System.err.println("Error al registrar salario base"+ e);
                    
                }

            } else {

                Icon icon = new ImageIcon(getClass().getResource("../../Recursos/Iconos/JOption/advertencia.png"));
                JOptionPane.showMessageDialog(null, "Por favor, ingrese valores validos para los campos horas extras"
                        + "y salario.", " -  Advertencia",
                        JOptionPane.PLAIN_MESSAGE, icon);

            }

        } else {

            Icon icon = new ImageIcon(getClass().getResource("../../Recursos/Iconos/JOption/advertencia.png"));
            JOptionPane.showMessageDialog(null, "Por favor, rellene los campos.", " -  Advertencia",
                    JOptionPane.PLAIN_MESSAGE, icon);

        }

    }//GEN-LAST:event_agregarBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarBtn;
    private javax.swing.JTextField cargoTxt;
    private javax.swing.JTextField ingresoTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField salarioTxt;
    private javax.swing.JTextField tipotxt;
    // End of variables declaration//GEN-END:variables

}
