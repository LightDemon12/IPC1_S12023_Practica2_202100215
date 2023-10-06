/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import practica.pkg2ipc1.Comidas;
import practica.pkg2ipc1.DatosGlobales1;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import practica.pkg2ipc1.DatosMotocicletas;
import practica.pkg2ipc1.Pedido;
import practica.pkg2ipc1.SerializablePedidos;


/**
 *
 * @author LightDemon12
 */
public class VistaPedidos extends javax.swing.JFrame {
 private ArrayList<Pedido> listaPedidos;
private int numeroPedidosGuardados = 0;
 private DefaultTableModel modeloTabla;

  
    public VistaPedidos() {
        initComponents();
         modeloTabla = new DefaultTableModel(new String[]{"Producto", "Precio"}, 0);
        
        // Obtener los datos de comidas desde DatosGlobales1
        ArrayList<Comidas> comidas = DatosGlobales1.getInstance().getComidas();
        
        // Llenar el modelo de tabla con los datos de comidas
        for (Comidas comida : comidas) {
            modeloTabla.addRow(new Object[]{comida.getNombre(), comida.getPrecio()});
        }
        
        // Establecer el modelo de tabla en el JTable
        jTable1.setModel(modeloTabla);
    ArrayList<String> motos = DatosMotocicletas.getMotocicletas();
      for (String moto : motos) {
            jComboBox1.addItem(moto);
        }


    }
 public void mostrarInformacionPedido() {
    // Obtén la información del pedido desde DatosGlobales1
    ArrayList<Pedido> pedidos = DatosGlobales1.getInstance().getPedidos();

    // Aquí puedes recorrer la lista de pedidos y mostrar la información en tu nuevo JFrame
    for (Pedido pedido : pedidos) {
        System.out.println("Información del pedido:");
        System.out.println("Distancia: " + pedido.getDistancia());
        System.out.println("Vehículo: " + pedido.getVehiculo());
        System.out.println("Total: " + pedido.getTotal());
    }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabeltotal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        distancia = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("REGRESAR AL MENU PRINCIPAL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Precio"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jButton2.setText("Agregar producto");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("PRODUCTOS");

        jLabel2.setText("PEDIDOS");

        jButton3.setText("CONFIRMAR PEDIDO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("VEHICULO");

        jLabel4.setText("TOTAL");

        jLabel5.setText("DISTANCIA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(208, 208, 208))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(627, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(435, 435, 435)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(distancia, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(27, 27, 27)
                        .addComponent(jLabeltotal)
                        .addGap(123, 123, 123))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jButton2)
                        .addGap(30, 30, 30)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabeltotal))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(distancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     Inicio inicio = new Inicio(); 
         inicio.setVisible(true);
 inicio.setLocationRelativeTo(null);   
   this.dispose();  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         int filaSeleccionada = jTable1.getSelectedRow();
 if (filaSeleccionada != -1) {
        // Obtiene los valores de la fila seleccionada del primer JTable
        String producto = jTable1.getValueAt(filaSeleccionada, 0).toString();
        String precio = jTable1.getValueAt(filaSeleccionada, 1).toString();

        // Agrega la fila seleccionada al segundo JTable (jTable2)
        DefaultTableModel modeloSegundoJTable = (DefaultTableModel) jTable2.getModel();
        modeloSegundoJTable.addRow(new Object[]{producto, precio});
 actualizarSumaTotalLabel();
 }
 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   if (numeroPedidosGuardados >= 3) {
        JOptionPane.showMessageDialog(this, "No se pueden guardar más de 3 pedidos.", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        // Código para guardar un pedido
        String distanciaStr = distancia.getText();
        String vehiculo = jComboBox1.getSelectedItem().toString();

        try {
            double distancia = Double.parseDouble(distanciaStr);
            if (distancia > 1 && distancia < 10) {
                // La distancia es válida, puedes continuar con tu lógica aquí
                System.out.println("Distancia válida: " + distancia);

                // Calcular el total de los precios de los productos en el pedido
                int total = calcularSumaTotalPrecios();

                // Crear un nuevo pedido con la distancia, vehículo y total
                Pedido pedido = new Pedido(distancia, vehiculo, total);

                // Guardar el pedido usando la clase SerializablePedidos
                SerializablePedidos.guardarPedido(pedido, "pedido" + numeroPedidosGuardados + ".dat");

                // Mostrar información del pedido (esto es opcional)
                mostrarInformacionPedido();

                // Incrementar el contador de pedidos guardados
                numeroPedidosGuardados++;

                // Verificar si se llegó al límite de 3 pedidos
                if (numeroPedidosGuardados >= 3) {
                    jButton3.setEnabled(false); // Desactivar el botón cuando se alcanza el límite
                }

                // Eliminar el elemento seleccionado del JComboBox
                jComboBox1.removeItem(vehiculo);
            } else {
                JOptionPane.showMessageDialog(this, "La distancia debe estar entre 1 y 10.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese una distancia válida.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
      Inicio inicio = new Inicio(); 
         inicio.setVisible(true);
 inicio.setLocationRelativeTo(null);   
this.dispose();

    }//GEN-LAST:event_jButton3ActionPerformed

public int calcularSumaTotalPrecios() {
    int sumaTotal = 0;
    DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
    int rowCount = modelo.getRowCount();
    for (int i = 0; i < rowCount; i++) {
        int precio = Integer.parseInt(modelo.getValueAt(i, 1).toString()); // Suponiendo que el precio está en la columna 1
        sumaTotal += precio;
    }
    return sumaTotal;
}

// Método para actualizar el JLabel con la suma total
public void actualizarSumaTotalLabel() {
    int sumaTotal = calcularSumaTotalPrecios();
    jLabeltotal.setText("Total: Q" + sumaTotal); // Suponiendo que jLabelTotal es el nombre de tu JLabel
}

// Llama a actualizarSumaTotalLabel cuando sea necesario, por ejemplo, después de cargar la tabla



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField distancia;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabeltotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
