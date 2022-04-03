package Ventanas.Perfil;

import Ventanas.Usuarios.login;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class verPerfil extends javax.swing.JInternalFrame {

    String rolUser = login.rolUser;
   
    public verPerfil() {
        
        initComponents();
        
        //Modelando ventana
        setLocation(387, 115);
        
        if(rolUser.equals("Administrador")){
            
            Icon icon = new ImageIcon(getClass().getResource("../../Recursos/Iconos/Empleados/Oscar.jpeg"));
            empleadoFoto.setIcon(icon);
            
        }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        fotoEmpleado_panel = new javax.swing.JPanel();
        empleadoFoto = new javax.swing.JLabel();
        nombre_txt = new javax.swing.JLabel();
        nombre_field = new javax.swing.JTextField();
        sexo_txt = new javax.swing.JLabel();
        sexo_field = new javax.swing.JTextField();
        edad_Txt = new javax.swing.JLabel();
        edad_field = new javax.swing.JTextField();
        puesto_txt = new javax.swing.JLabel();
        puesto_field = new javax.swing.JTextField();
        tipo_txt = new javax.swing.JLabel();
        tipo_field = new javax.swing.JTextField();
        salario_txt = new javax.swing.JLabel();
        salario_field = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Perfil ");
        setToolTipText("");

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout fotoEmpleado_panelLayout = new javax.swing.GroupLayout(fotoEmpleado_panel);
        fotoEmpleado_panel.setLayout(fotoEmpleado_panelLayout);
        fotoEmpleado_panelLayout.setHorizontalGroup(
            fotoEmpleado_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(empleadoFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
        );
        fotoEmpleado_panelLayout.setVerticalGroup(
            fotoEmpleado_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(empleadoFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );

        Fondo.add(fotoEmpleado_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 128, 208));

        nombre_txt.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        nombre_txt.setText("Nombre:");
        Fondo.add(nombre_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));
        Fondo.add(nombre_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 260, 30));

        sexo_txt.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        sexo_txt.setText("Sexo:");
        Fondo.add(sexo_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));
        Fondo.add(sexo_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 140, 30));

        edad_Txt.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        edad_Txt.setText("Edad:");
        Fondo.add(edad_Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));
        Fondo.add(edad_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 40, 30));

        puesto_txt.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        puesto_txt.setText("Puesto:");
        Fondo.add(puesto_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));
        Fondo.add(puesto_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 110, -1));

        tipo_txt.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        tipo_txt.setText("Tipo:");
        Fondo.add(tipo_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));
        Fondo.add(tipo_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 110, -1));

        salario_txt.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        salario_txt.setText("Salario base:");
        Fondo.add(salario_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));
        Fondo.add(salario_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel edad_Txt;
    private javax.swing.JTextField edad_field;
    private javax.swing.JLabel empleadoFoto;
    private javax.swing.JPanel fotoEmpleado_panel;
    private javax.swing.JTextField nombre_field;
    private javax.swing.JLabel nombre_txt;
    private javax.swing.JTextField puesto_field;
    private javax.swing.JLabel puesto_txt;
    private javax.swing.JTextField salario_field;
    private javax.swing.JLabel salario_txt;
    private javax.swing.JTextField sexo_field;
    private javax.swing.JLabel sexo_txt;
    private javax.swing.JTextField tipo_field;
    private javax.swing.JLabel tipo_txt;
    // End of variables declaration//GEN-END:variables
}
