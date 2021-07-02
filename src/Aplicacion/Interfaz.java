package Aplicacion;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import java.applet.AudioClip;

public class Interfaz extends javax.swing.JFrame {
    
    Juego j = new Juego();
    ArrayList<Personaje> personajes = new ArrayList();
    int VidaUsuario = 100, VidaMaquina = 100;
    AudioClip Battle;
    AudioClip Ganador;
    AudioClip Batalla;
    AudioClip Derrota;
    AudioClip Btn;
    public Interfaz() {
         //Son los datos ya establecido para la interfaz
          initComponents();
          this.setLocationRelativeTo(null);
          
          //this.setResizable(true);
          //txtArea.setEditable(true);
          //this.setLocation(280, 100);
          //this.setTitle("MagBattle");
          //JConbox en el cual tendra los personajes y los ataques 
          personajes.add(j.CrearPersonaje("Goku", "Puñetaso", "Patada", "kamehameha"));
          personajes.add(j.CrearPersonaje("Jiren", "Puñetaso", "patada", "???"));
          personajes.add(j.CrearPersonaje("Hit", "Golpe", "Patada", "Golpe a escondidas"));
          personajes.add(j.CrearPersonaje("Vegeta", "Puñetaso", "Patada", "ira"));
          personajes.add(j.CrearPersonaje("Zeno-Zama", "Jugar", "Reir", "Destrucion"));
          
          //combox que seran utilizados
          Combo(cbUsuario);
          Combo(cbMaquina);
          
          btnBatallar.grabFocus();
          //label donde se actualizara la vida de el usuario y la maquina
          lblUsuario.setText("Usuario nivel de vida : " + VidaUsuario + " %");
          lblMaquina.setText("Maquina nivel de vida : " + VidaMaquina + " %");
          
          lblUsuario.setVisible(false);
          lblMaquina.setVisible(false);
          
          cbPoderUsuario.setVisible(false);
          cbPoderMaquina.setVisible(false);
          lblMensaje.setVisible(false);
    }
    //creador de Combox para dar a conocer a los campeones
    private void Combo(JComboBox cb) {
          DefaultComboBoxModel cbModel = (DefaultComboBoxModel) cb.getModel();
          for (int i = 0; i < personajes.size(); i++) {
               cbModel.addElement(personajes.get(i).getNombre());
          }
    }
    
    @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          jPanel3 = new javax.swing.JPanel();
          lblMensaje = new javax.swing.JLabel();
          Regresar = new javax.swing.JButton();
          jPanel1 = new javax.swing.JPanel();
          cbUsuario = new javax.swing.JComboBox<>();
          jScrollPane1 = new javax.swing.JScrollPane();
          txtArea = new javax.swing.JTextArea();
          jPanel2 = new javax.swing.JPanel();
          cbMaquina = new javax.swing.JComboBox<>();
          btnBatallar = new javax.swing.JButton();
          lblUsuario = new javax.swing.JLabel();
          lblMaquina = new javax.swing.JLabel();
          cbPoderUsuario = new javax.swing.JComboBox<>();
          cbPoderMaquina = new javax.swing.JComboBox<>();
          lblTiempo = new javax.swing.JLabel();
          Salir = new javax.swing.JButton();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
          setUndecorated(true);

          jPanel3.setBackground(new java.awt.Color(204, 255, 255));
          jPanel3.setToolTipText("");

          lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          lblMensaje.setText("Maquina en ataque...");

          Regresar.setText("Menu");
          Regresar.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    RegresarActionPerformed(evt);
               }
          });

          jPanel1.setBackground(new java.awt.Color(153, 153, 255));
          jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuario"));
          jPanel1.setForeground(new java.awt.Color(255, 51, 51));

          cbUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija un Campeon" }));
          cbUsuario.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cbUsuarioActionPerformed(evt);
               }
          });

          javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
          jPanel1.setLayout(jPanel1Layout);
          jPanel1Layout.setHorizontalGroup(
               jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(cbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          );
          jPanel1Layout.setVerticalGroup(
               jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(cbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(19, Short.MAX_VALUE))
          );

          txtArea.setColumns(20);
          txtArea.setFont(new java.awt.Font("MS Gothic", 1, 12)); // NOI18N
          txtArea.setRows(5);
          txtArea.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 3), "Batalla"));
          jScrollPane1.setViewportView(txtArea);

          jPanel2.setBackground(new java.awt.Color(255, 51, 51));
          jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Maquina"));

          cbMaquina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eleccion Automatica (bot)" }));
          cbMaquina.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cbMaquinaActionPerformed(evt);
               }
          });

          javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
          jPanel2.setLayout(jPanel2Layout);
          jPanel2Layout.setHorizontalGroup(
               jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(cbMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(32, Short.MAX_VALUE))
          );
          jPanel2Layout.setVerticalGroup(
               jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(cbMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(19, Short.MAX_VALUE))
          );

          btnBatallar.setText("Batallar");
          btnBatallar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
          btnBatallar.setContentAreaFilled(false);
          btnBatallar.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnBatallarActionPerformed(evt);
               }
          });

          lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          lblUsuario.setText("NIVEL DE VIDA : ");

          lblMaquina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          lblMaquina.setText("NIVEL DE VIDA : ");

          cbPoderUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elije un poder" }));
          cbPoderUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
          cbPoderUsuario.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cbPoderUsuarioActionPerformed(evt);
               }
          });

          cbPoderMaquina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elije un poder" }));
          cbPoderMaquina.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

          lblTiempo.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
          lblTiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

          Salir.setText("Exit");
          Salir.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    SalirActionPerformed(evt);
               }
          });

          javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
          jPanel3.setLayout(jPanel3Layout);
          jPanel3Layout.setHorizontalGroup(
               jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                              .addGap(0, 0, Short.MAX_VALUE)
                              .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                             .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                             .addComponent(cbPoderUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                             .addComponent(lblTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                             .addComponent(btnBatallar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(14, 14, 14)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                             .addComponent(lblMaquina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                             .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                             .addComponent(cbPoderMaquina, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                   .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                             .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                             .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                              .addGap(58, 58, 58))
                         .addGroup(jPanel3Layout.createSequentialGroup()
                              .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap())
          );
          jPanel3Layout.setVerticalGroup(
               jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                         .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                         .addComponent(btnBatallar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(lblMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(cbPoderUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(cbPoderMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(lblTiempo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(jPanel3Layout.createSequentialGroup()
                              .addComponent(Regresar)
                              .addGap(18, 18, 18)
                              .addComponent(Salir)
                              .addGap(0, 0, Short.MAX_VALUE))
                         .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
                    .addContainerGap())
          );

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
          );

          pack();
     }// </editor-fold>//GEN-END:initComponents

    private void cbUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUsuarioActionPerformed
          int aleatorio = (int) (Math.random() * 5) + 0;
          String Jugador = personajes.get(aleatorio).getNombre();
          cbMaquina.getModel().setSelectedItem(Jugador);
          btnBatallar.grabFocus();
    }//GEN-LAST:event_cbUsuarioActionPerformed

    private void btnBatallarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatallarActionPerformed
          Btn=java.applet.Applet.newAudioClip(getClass().getResource("/Sound/espada_1.wav"));
          Btn.play();
          
          Battle=java.applet.Applet.newAudioClip(getClass().getResource("/Sound/Battle.wav"));
          Battle.play();

          //boton para iniciar batalla
          if (cbUsuario.getSelectedIndex() > 0 && cbMaquina.getSelectedIndex() > 0) {
               cbUsuario.setEnabled(false);
               cbMaquina.setEnabled(false);
               lblUsuario.setVisible(true);
               lblMaquina.setVisible(true);
               cbPoderUsuario.setVisible(true);
               cbPoderMaquina.setVisible(true);
               this.setTitle("MagBattle " + cbUsuario.getSelectedItem().toString() + " y " + cbMaquina.getSelectedItem().toString());
               ComboAtaques(cbUsuario, cbPoderUsuario);
               ComboAtaques(cbMaquina, cbPoderMaquina);
               cbPoderMaquina.setEnabled(false);
               btnBatallar.setEnabled(false);
          }
    }//GEN-LAST:event_btnBatallarActionPerformed
    //creacion del combox de los ataques a realizar 
    private void ComboAtaques(JComboBox cb, JComboBox cbAt) {
          DefaultComboBoxModel cbModel = (DefaultComboBoxModel) cbAt.getModel();
          for (int i = 0; i < personajes.size(); i++) {
               if (personajes.get(i).getNombre().equals(cb.getSelectedItem().toString())) {
                    cbModel.addElement(personajes.get(i).getPoder1());
                    cbModel.addElement(personajes.get(i).getPoder2());
                    cbModel.addElement(personajes.get(i).getPoder3());
               }
          }
    }

    private void cbPoderUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPoderUsuarioActionPerformed
          Ganador=java.applet.Applet.newAudioClip(getClass().getResource("/Sound/Ganador.wav"));
          if (cbPoderUsuario.getSelectedIndex() > 0) {
                    cbPoderMaquina.setSelectedIndex(0);
                    int aleatorio = (int) (Math.random() * 30) + 10;
                    txtArea.append("\nUsuario Nivel Vida : " + VidaUsuario + " %");
                    txtArea.append("\nMaquina Nivel Vida : " + VidaMaquina + " %");
                    txtArea.append("\n");
                    txtArea.append("\nEl Usuario ejecutó " + cbPoderUsuario.getSelectedItem().toString() + " con una fuerza de " + aleatorio + " %");
                    VidaMaquina = VidaMaquina - aleatorio;
                    
               if (VidaMaquina <= 0) {
                    VidaMaquina = 0;
                    lblMaquina.setText("Maquina nivel de vida : " + VidaMaquina + " %");
                    cbPoderUsuario.setEnabled(false);
                    cbPoderMaquina.setEnabled(false);
                    lblMensaje.setVisible(false);
                    Battle.stop();
                    JOptionPane.showMessageDialog(null, "El GANADOR : " + cbUsuario.getSelectedItem().toString());
                    Batalla.stop();
                    Ganador.play();
               } else {
                    lblMaquina.setText("Maquina nivel de vida : " + VidaMaquina + " %");
                    txtArea.append("\nMaquina bajó nivel de vida a " + VidaMaquina + " %\n");
                    cbPoderUsuario.setEnabled(false);
                    Tiempo t = new Tiempo();
                    t.start();
               }
          }
    }//GEN-LAST:event_cbPoderUsuarioActionPerformed

     private void cbMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMaquinaActionPerformed

     }//GEN-LAST:event_cbMaquinaActionPerformed

     private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
          Btn=java.applet.Applet.newAudioClip(getClass().getResource("/Sound/espada_1.wav"));
          Btn.play();
          System.exit(0);
     }//GEN-LAST:event_SalirActionPerformed

     private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
          Btn=java.applet.Applet.newAudioClip(getClass().getResource("/Sound/espada_1.wav"));
          Btn.play();
          GUI Ventana=new GUI();
          Ventana.setVisible(true);
          this.setVisible(false);
     }//GEN-LAST:event_RegresarActionPerformed
    
     public static void main(String args[]) {
        
          java.awt.EventQueue.invokeLater(new Runnable() {
               public void run() {
                    new Interfaz().setVisible(true);
                
               }
          });
     }

     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JButton Regresar;
     private javax.swing.JButton Salir;
     private javax.swing.JButton btnBatallar;
     private javax.swing.JComboBox<String> cbMaquina;
     private javax.swing.JComboBox<String> cbPoderMaquina;
     private javax.swing.JComboBox<String> cbPoderUsuario;
     private javax.swing.JComboBox<String> cbUsuario;
     private javax.swing.JPanel jPanel1;
     private javax.swing.JPanel jPanel2;
     private javax.swing.JPanel jPanel3;
     private javax.swing.JScrollPane jScrollPane1;
     private javax.swing.JLabel lblMaquina;
     private javax.swing.JLabel lblMensaje;
     private javax.swing.JLabel lblTiempo;
     private javax.swing.JLabel lblUsuario;
     private javax.swing.JTextArea txtArea;
     // End of variables declaration//GEN-END:variables

    public class Tiempo extends Thread {
          
         
          //eesta es la clase que ejecuta la cuenta regresiva para que la maquina ejeute su ataque
          public int contador = 10;

          public void run() {
               Batalla=java.applet.Applet.newAudioClip(getClass().getResource("/Sound/Batalla.wav"));
               lblTiempo.setVisible(true);
          while (contador >= 0) {
               Batalla.play();
               lblTiempo.setText(Integer.toString(contador--));
               lblMensaje.setVisible(true);
               try {
                    Thread.sleep(1000);
               } catch (InterruptedException ex) {
                    Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
               }
          }
               cbPoderMaquina.setEnabled(true);
               int al = (int) (Math.random() * 3) + 1;
               cbPoderMaquina.setSelectedIndex(al);
               int aleatorio2 = (int) (Math.random() * 30) + 10;
               
               Derrota=java.applet.Applet.newAudioClip(getClass().getResource("/Sound/Batalla_perdida.wav"));
               txtArea.append("\nUsuario Nivel Vida : " + VidaUsuario + " %");
               txtArea.append("\nMaquina Nivel Vida : " + VidaMaquina + " %");
               txtArea.append("\nMaquina ejecutó " + cbPoderMaquina.getSelectedItem().toString() + " con una fuerza de " + aleatorio2 + " %");
               VidaUsuario = VidaUsuario - aleatorio2;
               
               if (VidaUsuario <= 0) {
                    VidaUsuario = 0;
                    lblUsuario.setText("Usuario nivel de vida : " + VidaUsuario + " %");
                    cbPoderUsuario.setEnabled(false);
                    cbPoderMaquina.setEnabled(false);
                    lblMensaje.setVisible(false);
                    Battle.stop();
                    Derrota.play();
                    Batalla.play();
                    JOptionPane.showMessageDialog(null, "EL GANADOR ES: " + cbMaquina.getSelectedItem().toString());
                    Derrota.play();
               } else {
                    lblUsuario.setText("Usuario nivel de vida : " + VidaUsuario + " %");
                    txtArea.append("\nUsuario bajó nivel de vida a " + VidaUsuario + " %\n");
                    cbPoderUsuario.setSelectedIndex(0);
                    cbPoderUsuario.setEnabled(true);
                    cbPoderMaquina.setEnabled(false);
                    lblMensaje.setVisible(false);
                    Batalla.stop();
                    lblTiempo.setVisible(false);
               }
          }
     }

         

}
