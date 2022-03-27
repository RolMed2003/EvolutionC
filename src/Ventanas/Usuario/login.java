package Ventanas.Usuario;

import Clases.Apoyo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class login extends javax.swing.JInternalFrame {

    public login() {

        initComponents();

        setSize(406, 530);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        login_img = new javax.swing.JLabel();
        fondo_panel = new javax.swing.JPanel();
        user_field = new javax.swing.JTextField();
        pass_field = new javax.swing.JTextField();
        user_txt = new javax.swing.JLabel();
        pass_txt = new javax.swing.JLabel();
        entrar_panel = new javax.swing.JPanel();
        entrar_txtButton = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Login");

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/icons/user (1).png"))); // NOI18N
        Fondo.add(login_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, -1, -1));

        fondo_panel.setBackground(new java.awt.Color(52, 128, 225));

        user_txt.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        user_txt.setForeground(new java.awt.Color(255, 255, 255));
        user_txt.setText("USERNAME");

        pass_txt.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        pass_txt.setForeground(new java.awt.Color(255, 255, 255));
        pass_txt.setText("PASSWORD");

        entrar_panel.setBackground(new java.awt.Color(0, 149, 212));
        entrar_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        entrar_txtButton.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        entrar_txtButton.setForeground(new java.awt.Color(255, 255, 255));
        entrar_txtButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        entrar_txtButton.setText("ENTRAR");
        entrar_txtButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrar_txtButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout entrar_panelLayout = new javax.swing.GroupLayout(entrar_panel);
        entrar_panel.setLayout(entrar_panelLayout);
        entrar_panelLayout.setHorizontalGroup(
            entrar_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entrar_txtButton, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
        );
        entrar_panelLayout.setVerticalGroup(
            entrar_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entrar_txtButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fondo_panelLayout = new javax.swing.GroupLayout(fondo_panel);
        fondo_panel.setLayout(fondo_panelLayout);
        fondo_panelLayout.setHorizontalGroup(
            fondo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondo_panelLayout.createSequentialGroup()
                .addGroup(fondo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondo_panelLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(entrar_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondo_panelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(fondo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(user_txt)
                            .addComponent(pass_txt)
                            .addGroup(fondo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(pass_field, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(user_field, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        fondo_panelLayout.setVerticalGroup(
            fondo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondo_panelLayout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(user_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user_field, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(pass_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pass_field, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(entrar_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        Fondo.add(fondo_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 330, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entrar_txtButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrar_txtButtonMouseClicked
        int Val = 0;
        if (user_field.getText().equals("")) {
            Val++;
        }
        if (pass_field.getText().equals("")) {
            Val++;
        }
        /*
        if(Val==0){
            try {
            
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
            
                   // "select Usuario, Contraseña from Register where Usuario = '"+txt_usuario.getText().trim()+"'"
                    //+" and Contraseña = '"+txt_pass_oculto.getText().trim()+"'"        );
            
            //ResultSet rs = pst.executeQuery();
           
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Sesión iniciada.");
                
                
            } else {
                JOptionPane.showMessageDialog(null, "Datos erroneos.");
            }
            
                    
            
        } catch (SQLException e) {
            System.err.println("Error al iniciar sesión."+e);
        }
            
            
        }else{
            JOptionPane.showMessageDialog(null, "Existen campos vacios.");
        }
       */
        
    }//GEN-LAST:event_entrar_txtButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel entrar_panel;
    private javax.swing.JLabel entrar_txtButton;
    private javax.swing.JPanel fondo_panel;
    private javax.swing.JLabel login_img;
    private javax.swing.JTextField pass_field;
    private javax.swing.JLabel pass_txt;
    private javax.swing.JTextField user_field;
    private javax.swing.JLabel user_txt;
    // End of variables declaration//GEN-END:variables

}
