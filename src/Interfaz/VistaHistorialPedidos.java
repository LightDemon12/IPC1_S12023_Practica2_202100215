/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;


import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import practica.pkg2ipc1.DatosGlobales1;
import practica.pkg2ipc1.Pedido;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import practica.pkg2ipc1.Comidas;
import practica.pkg2ipc1.Pedido;

/**
 *
 * @author LightDemon12
 */
public class VistaHistorialPedidos extends javax.swing.JFrame {
  
  
    /**
     * Creates new form VistaHistorialPedidos
     */
    public VistaHistorialPedidos() {
        initComponents();
         cargarDatosEnTabla2();
  VistaPedidos vistaPedidos = new VistaPedidos();
        vistaPedidos.mostrarInformacionPedido();

        
    }



    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TABLAHISTORIAL = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TABLAHISTORIAL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Distancia", "Vehiculo", "Total", "Hora"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TABLAHISTORIAL);

        jLabel1.setText("HISTORIAL DE PEDIDOS");

        jButton1.setText("MENU PRINCIPAL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Inicio inicio = new Inicio(); 
         inicio.setVisible(true);
 inicio.setLocationRelativeTo(null);   
   this.dispose();  
    }//GEN-LAST:event_jButton1ActionPerformed
    private void cargarDatosEnTabla2() {
       List<Pedido> historial = Pedido.getHistorialPedidos();

// Crear un modelo de tabla con las columnas necesarias
DefaultTableModel modeloDefaultTableModel = new DefaultTableModel(new String[]{"Distancia", "Vehículo", "Total", "Hora del Pedido"}, historial.size());

// Asignar el modelo a la tabla
TABLAHISTORIAL.setModel(modeloDefaultTableModel);

// Obtener el modelo de datos de la tabla
TableModel modeloDatos = TABLAHISTORIAL.getModel();

// Llenar las filas con los datos de los pedidos
for (int i = 0; i < historial.size(); i++) {
    Pedido pedido = historial.get(i);
    modeloDatos.setValueAt(pedido.getDistancia(), i, 0);
    modeloDatos.setValueAt(pedido.getVehiculo(), i, 1);
    modeloDatos.setValueAt(pedido.getTotal(), i, 2);
    modeloDatos.setValueAt(pedido.getHoraPedido(), i, 3);
}

    }


          
       

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TABLAHISTORIAL;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
