package Aplicacion;

import java.applet.AudioClip;

public class GUI extends javax.swing.JFrame {
     AudioClip menu;
     AudioClip Battle;
     
     public GUI() {
          initComponents();
          this.setLocationRelativeTo(null);
          menu=java.applet.Applet.newAudioClip(getClass().getResource("/Sound/Menu.wav"));
          menu.play();
          
          Battle=java.applet.Applet.newAudioClip(getClass().getResource("/Sound/espada_1.wav"));
          
          
     }
     
     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          jLabel2 = new javax.swing.JLabel();
          jLabel3 = new javax.swing.JLabel();
          Play = new javax.swing.JButton();
          jButton1 = new javax.swing.JButton();
          jButton2 = new javax.swing.JButton();
          jLabel1 = new javax.swing.JLabel();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
          setLocationByPlatform(true);
          setUndecorated(true);
          getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

          jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
          jLabel2.setForeground(new java.awt.Color(255, 255, 102));
          jLabel2.setText("MagBattle");
          getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

          jLabel3.setFont(new java.awt.Font("Terminator Two", 1, 18)); // NOI18N
          jLabel3.setForeground(new java.awt.Color(102, 102, 255));
          jLabel3.setText("Manager");
          getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 170, 50));

          Play.setText("Play");
          Play.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    PlayActionPerformed(evt);
               }
          });
          getContentPane().add(Play, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 120, -1));

          jButton1.setText("Exit");
          jButton1.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
               }
          });
          getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

          jButton2.setText("Como Jugar");
          jButton2.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton2ActionPerformed(evt);
               }
          });
          getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

          jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Gif Menu.gif"))); // NOI18N
          jLabel1.addAncestorListener(new javax.swing.event.AncestorListener() {
               public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
               }
               public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                    jLabel1AncestorAdded(evt);
               }
               public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
               }
          });
          getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 260));

          pack();
     }// </editor-fold>//GEN-END:initComponents

     private void PlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayActionPerformed
          
          menu.stop();
          Battle.play();
          
          Interfaz Ventana=new Interfaz();
          Ventana.setVisible(true);
          this.setVisible(false);
          
     }//GEN-LAST:event_PlayActionPerformed

     private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          menu.stop();
          Battle.play();
          
          Ayuda Ventana=new Ayuda();
          Ventana.setVisible(true);
          this.setVisible(false);
     }//GEN-LAST:event_jButton2ActionPerformed

     private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          menu.stop();
          Battle.play();
          System.exit(0);
     }//GEN-LAST:event_jButton1ActionPerformed

     private void jLabel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1AncestorAdded
          
     }//GEN-LAST:event_jLabel1AncestorAdded

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
               java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (InstantiationException ex) {
               java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (IllegalAccessException ex) {
               java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (javax.swing.UnsupportedLookAndFeelException ex) {
               java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          }
          //</editor-fold>

          /* Create and display the form */
          java.awt.EventQueue.invokeLater(new Runnable() {
               public void run() {
                    new GUI().setVisible(true);
               }
          });
     }

     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JButton Play;
     private javax.swing.JButton jButton1;
     private javax.swing.JButton jButton2;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JLabel jLabel3;
     // End of variables declaration//GEN-END:variables

}
