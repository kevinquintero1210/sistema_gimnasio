/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistema_gimnasio.vista;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import sistema_gimnasio.controlador.Controlador;

/**
 *
 * @author Charly Cimino
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        Icon mIcono = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/icono.png")).getImage()
                .getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), 0));
        
        jLabel1.setIcon(mIcono);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();
        ingresaradmin = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 118, 241));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 110, 100));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("BIENVENIDO ADMINISTRADOR AL GIMNASIO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("INGRESE SU USUARIO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, -1, -1));

        usuario.setBackground(new java.awt.Color(255, 255, 255));
        usuario.setText("digite su usuario");
        usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usuarioMousePressed(evt);
            }
        });
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 290, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("INGRESE SU CONTRASEÑA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 150, -1));

        contraseña.setBackground(new java.awt.Color(255, 255, 255));
        contraseña.setText("********");
        contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                contraseñaMousePressed(evt);
            }
        });
        contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 290, -1));

        ingresaradmin.setBackground(new java.awt.Color(255, 255, 255));
        ingresaradmin.setForeground(new java.awt.Color(0, 0, 0));
        ingresaradmin.setText("INGRESAR");
        ingresaradmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresaradminActionPerformed(evt);
            }
        });
        jPanel1.add(ingresaradmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 100, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("VOLVER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    private void ingresaradminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresaradminActionPerformed
        // TODO add your handling code here:
        String Usuarios1;
        String Contraseña1;
        //do{
            Usuarios1=usuario.getText();
            Contraseña1=String.valueOf(contraseña.getPassword());
            if (Usuarios1.equalsIgnoreCase("Ingrese su nombre de usuario")&& Contraseña1.equalsIgnoreCase("********")) {
                JOptionPane.showMessageDialog(null, "Los campos no pueden estar vacios");
            } else if (Usuarios1.equalsIgnoreCase("") || Usuarios1.equalsIgnoreCase("Ingrese su nombre de usuario")) {
                JOptionPane.showMessageDialog(null, "Debe ingresar Usuario");
            } else if(Contraseña1.equalsIgnoreCase("") || Contraseña1.equalsIgnoreCase("********") ) {
                JOptionPane.showMessageDialog(null, "Debe ingresar Contraseña");
            }else{Controlador con =new Controlador();
            int vali=con.verificarcredenciales(Usuarios1, Contraseña1);
            if(vali==1){
               funcionalidades menad=new funcionalidades();
               menad.setVisible(true);
               setVisible(false);
            }else if(vali==2){
                funcionalidades men=new funcionalidades();
                men.setVisible(true);
                setVisible(false);
            }else{
                    JOptionPane.showMessageDialog(null, "Usuario y contraseña invalidas");
                }
            }
    }//GEN-LAST:event_ingresaradminActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        iniciar_sesion meth5= new iniciar_sesion();
        meth5.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioMousePressed
        // TODO add your handling code here:
        if(usuario.getText().equals("digite su usuario")){
            usuario.setText("");
            usuario.setForeground(Color.black);
        }
        if(String.valueOf(contraseña.getPassword()).isEmpty()){
            contraseña.setText("********");
            contraseña.setForeground(Color.gray);
        }
    }//GEN-LAST:event_usuarioMousePressed

    private void contraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseñaMousePressed
        // TODO add your handling code here:
        if(usuario.getText().isEmpty()){
            usuario.setText("digite su usuario");
            usuario.setForeground(Color.gray);
        }
        if(String.valueOf(contraseña.getPassword()).equals("********")){
            contraseña.setText("");
            contraseña.setForeground(Color.black);
        }
    }//GEN-LAST:event_contraseñaMousePressed

    private void contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñaActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JButton ingresaradmin;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
