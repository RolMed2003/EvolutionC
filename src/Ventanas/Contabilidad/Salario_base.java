package Ventanas.Contabilidad;

import Clases.Apoyo.PlaceHolder;
import Clases.Generales.Salario;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class Salario_base extends javax.swing.JInternalFrame {

    Salario salario = new Salario();
    
    public Salario_base() {
        
        initComponents();
        
        //Modelando
        setTitle("Salarios base");
        setSize(950, 494);
        setLocation(165, 103);
        
        //Mostrando tabla de salarios base
        DefaultTableModel model = (DefaultTableModel) salariosTbl.getModel();
        
        new Thread(){
            
            @Override
            public void run(){
                
                loading.setVisible(true);
                salariosTbl.setModel(salario.mostrarSalarios(model));
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
        jButton3 = new javax.swing.JButton();
        loading = new javax.swing.JLabel();
        buscarTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        buscarBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        salariosTbl = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jFrame1.setAlwaysOnTop(true);
        jFrame1.setUndecorated(true);
        jFrame1.setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton3.setText("Aceptar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(625, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(335, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
                false, true, true, true, true
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

        jButton1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/Login/editar-documento.png"))); // NOI18N
        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(807, 162, 117, -1));

        jButton2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/Otros/expediente.png"))); // NOI18N
        jButton2.setText("Eliminar");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(807, 251, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed

        DefaultTableModel model = (DefaultTableModel) salariosTbl.getModel();
        String buscar = buscarTxt.getText().trim();
        
        salario.mostrarSalarios(buscar, model);

    }//GEN-LAST:event_buscarBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
       jFrame1.setVisible(true);
       jFrame1.setSize(710, 371);
       jFrame1.setLocationRelativeTo(null);
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        jFrame1.setVisible(false);
        
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarBtn;
    private javax.swing.JTextField buscarTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel loading;
    private javax.swing.JTable salariosTbl;
    // End of variables declaration//GEN-END:variables
}
