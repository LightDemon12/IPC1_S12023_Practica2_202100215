/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import MOTOCICLETAS.Carrera;
import javax.swing.JLabel;
import practica.pkg2ipc1.Pedido;
import practica.pkg2ipc1.SerializablePedidos;

/**
 *
 * @author LightDemon12
 */
public class VistaEntregaDePedidos extends javax.swing.JFrame {

    /**
     * Creates new form VistaEntregaDePedidos
     */
    public VistaEntregaDePedidos() {
        initComponents();
        Pedido pedidoCargado = SerializablePedidos.cargarPedido("pedido.dat");
        this.setLocationRelativeTo(null);
        this.setTitle("ENTREGAS");
    }
    public JLabel getMOTOCICLETA1(){
        return MOTOCICLETA1;
    }
     public JLabel getMOTOCICLETA2(){
        return MOTOCICLETA2;
    }
      public JLabel getMOTOCICLETA3(){
        return MOTOCICLETA3;
    }
     public JLabel getBARRERA2() {
        return BARRERA2;
     }
     public JLabel getBARRERA(){
        return BARRERA;
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        MOTOCICLETA1 = new javax.swing.JLabel();
        MOTOCICLETA2 = new javax.swing.JLabel();
        MOTOCICLETA3 = new javax.swing.JLabel();
        BARRERA = new javax.swing.JLabel();
        BARRERA2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        km = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("REGRESAR AL MENU PRINCIPAL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("VISUALIZACION DE TRAYECTORIAS");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        MOTOCICLETA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTILIDADES/3dfc4ac50eca195cc2b1a4fd8ac56e05-icono-de-motocicleta-deportiva.png"))); // NOI18N

        MOTOCICLETA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTILIDADES/3dfc4ac50eca195cc2b1a4fd8ac56e05-icono-de-motocicleta-deportiva.png"))); // NOI18N

        MOTOCICLETA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTILIDADES/3dfc4ac50eca195cc2b1a4fd8ac56e05-icono-de-motocicleta-deportiva.png"))); // NOI18N

        BARRERA.setBackground(new java.awt.Color(255, 0, 0));
        BARRERA.setOpaque(true);

        BARRERA2.setBackground(new java.awt.Color(255, 0, 0));
        BARRERA2.setOpaque(true);

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("MOTOCICLETA 1");

        jLabel3.setText("DISTANCIA");

        jButton3.setText("MOTOCICLETA1");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(km))
                    .addComponent(jButton3))
                .addGap(89, 89, 89)
                .addComponent(BARRERA2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MOTOCICLETA2)
                    .addComponent(MOTOCICLETA1)
                    .addComponent(MOTOCICLETA3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 488, Short.MAX_VALUE)
                .addComponent(BARRERA, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(MOTOCICLETA1)
                .addGap(68, 68, 68)
                .addComponent(MOTOCICLETA2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(MOTOCICLETA3)
                .addGap(26, 26, 26))
            .addComponent(BARRERA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BARRERA2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(km))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton2.setText("MANDAR MOTOS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("ACTUALIZAR INFORMACION");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(374, 374, 374))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(88, 88, 88)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(394, 394, 394))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(50, 50, 50))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addComponent(jButton4)
                .addGap(46, 46, 46)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void setDistanciaLabelText(String text) {
    km.setText(text);
}

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Inicio inicio = new Inicio(); 
         inicio.setVisible(true);
 inicio.setLocationRelativeTo(null);   
   this.dispose();  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.out.println(MOTOCICLETA1.getLocation().x);
        System.out.println(MOTOCICLETA2.getLocation().x);
        System.out.println(MOTOCICLETA3.getLocation().x);
        System.out.println(MOTOCICLETA1.getLocation().y);
        System.out.println(MOTOCICLETA2.getLocation().y);
        System.out.println(MOTOCICLETA3.getLocation().y);
        System.out.println(BARRERA.getLocation().x);
        MOTOCICLETA1.setLocation(0, MOTOCICLETA1.getLocation().y);
        MOTOCICLETA2.setLocation(0, MOTOCICLETA2.getLocation().y);
        MOTOCICLETA3.setLocation(0, MOTOCICLETA3.getLocation().y);
        
        Carrera moto1 = new Carrera(MOTOCICLETA1, this);
        Carrera moto2 = new Carrera(MOTOCICLETA2, this);
        Carrera moto3 = new Carrera(MOTOCICLETA3, this);
        
        moto1.start();
        moto2.start();
        moto3.start();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Carrera moto1 = new Carrera(getMOTOCICLETA1(), this);
    moto1.start();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         Pedido pedidoCargado = SerializablePedidos.cargarPedido("pedido.dat");
if (pedidoCargado != null) {
    // Aquí puedes usar el objeto pedidoCargado como desees
    // Por ejemplo, puedes mostrar la distancia en el JLabel km
    km.setText("Distancia: " + pedidoCargado.getDistancia());
    }//GEN-LAST:event_jButton4ActionPerformed
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BARRERA;
    private javax.swing.JLabel BARRERA2;
    private javax.swing.JLabel MOTOCICLETA1;
    private javax.swing.JLabel MOTOCICLETA2;
    private javax.swing.JLabel MOTOCICLETA3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel km;
    // End of variables declaration//GEN-END:variables
}
