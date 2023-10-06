/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import MOTOCICLETAS.Carrera;
import java.util.ArrayList;
import java.util.List;
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        km2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        km3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

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
        jLabel2.setText("MOTOCICLETA 3");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("DISTANCIA");

        jButton3.setText("MOTOCICLETA3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("MOTOCICLETA 2");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("DISTANCIA");

        jButton5.setText("MOTOCICLETA 2");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("MOTOCICLETA 1");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("DISTANCIA");

        jButton4.setText("MOTOCICLETA 1");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(km))
                            .addComponent(jButton3)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(km2))
                            .addComponent(jButton5)
                            .addComponent(jLabel6)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(km3))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4)))
                .addGap(39, 39, 39)
                .addComponent(BARRERA2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MOTOCICLETA2)
                    .addComponent(MOTOCICLETA1)
                    .addComponent(MOTOCICLETA3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 535, Short.MAX_VALUE)
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
                .addGap(81, 81, 81)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(km2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(km3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addGap(55, 55, 55))
        );

        jButton2.setText("MANDAR MOTOS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton6.setText("ACTUALIZAR DATOS");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
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
                        .addComponent(jButton6)
                        .addGap(53, 53, 53))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(jButton6)
                .addGap(56, 56, 56)
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
    // Imprimir las posiciones iniciales de las motocicletas y la barrera
System.out.println("Posición inicial de MOTOCICLETA1 en X: " + MOTOCICLETA1.getLocation().x);
System.out.println("Posición inicial de MOTOCICLETA2 en X: " + MOTOCICLETA2.getLocation().x);
System.out.println("Posición inicial de MOTOCICLETA3 en X: " + MOTOCICLETA3.getLocation().x);
System.out.println("Posición inicial de MOTOCICLETA1 en Y: " + MOTOCICLETA1.getLocation().y);
System.out.println("Posición inicial de MOTOCICLETA2 en Y: " + MOTOCICLETA2.getLocation().y);
System.out.println("Posición inicial de MOTOCICLETA3 en Y: " + MOTOCICLETA3.getLocation().y);
System.out.println("Posición inicial de la BARRERA en X: " + BARRERA.getLocation().x);

// Colocar las motocicletas en la posición inicial en X (0)
MOTOCICLETA1.setLocation(0, MOTOCICLETA1.getLocation().y);
MOTOCICLETA2.setLocation(0, MOTOCICLETA2.getLocation().y);
MOTOCICLETA3.setLocation(0, MOTOCICLETA3.getLocation().y);

// Calcular la distancia deseada antes de llegar a la barrera
int distanciaHastaBarrera = BARRERA.getLocation().x; // Posición de la barrera
int distanciaInicial = 0; // Posición inicial en X (0)
int distanciaDeseada = distanciaHastaBarrera - distanciaInicial;

// Crear las motocicletas con la distancia deseada antes de llegar a la barrera
Carrera moto1 = new Carrera(MOTOCICLETA1, this, distanciaDeseada);
Carrera moto2 = new Carrera(MOTOCICLETA2, this, distanciaDeseada);
Carrera moto3 = new Carrera(MOTOCICLETA3, this, distanciaDeseada);

// Iniciar las carreras de las motocicletas
moto1.start();
moto2.start();
moto3.start();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     int distanciaHastaBarrera = BARRERA.getLocation().x; // Posición de la barrera
int distanciaInicial = 0; // Posición inicial en X (0)
int distanciaDeseada = distanciaHastaBarrera - distanciaInicial;
        Carrera moto1 = new Carrera(MOTOCICLETA1, this, distanciaDeseada);
    moto1.start();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     int distanciaHastaBarrera = BARRERA.getLocation().x; // Posición de la barrera
int distanciaInicial = 0; // Posición inicial en X (0)
int distanciaDeseada = distanciaHastaBarrera - distanciaInicial;
        Carrera moto3 = new Carrera(MOTOCICLETA3, this, distanciaDeseada);
   moto3.start();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int distanciaHastaBarrera = BARRERA.getLocation().x; // Posición de la barrera
int distanciaInicial = 0; // Posición inicial en X (0)
int distanciaDeseada = distanciaHastaBarrera - distanciaInicial;
        Carrera moto2 = new Carrera(MOTOCICLETA2, this, distanciaDeseada);
   moto2.start();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
  Pedido pedidoCargado = SerializablePedidos.cargarPedido("pedido.dat");
List<Pedido> historialPedidos = Pedido.getHistorialPedidos();
  if (!historialPedidos.isEmpty()) {
    km.setText("Distancia: " + historialPedidos.get(historialPedidos.size() - 1).getDistancia());
}

// Luego, puedes continuar con las verificaciones para km2 y km3 como se mencionó anteriormente
if (historialPedidos.size() >= 2) {
    km2.setText("Distancia: " + historialPedidos.get(historialPedidos.size() - 2).getDistancia());
}

if (historialPedidos.size() >= 3) {
    km3.setText("Distancia: " + historialPedidos.get(historialPedidos.size() - 3).getDistancia());
}

    }//GEN-LAST:event_jButton6ActionPerformed
    
    
    
    
    
    
    
    
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
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel km;
    private javax.swing.JLabel km2;
    private javax.swing.JLabel km3;
    // End of variables declaration//GEN-END:variables
}
