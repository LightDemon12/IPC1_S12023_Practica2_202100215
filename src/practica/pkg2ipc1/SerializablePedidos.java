/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg2ipc1;

import java.io.*;

public class SerializablePedidos {
    public static void guardarPedido(Pedido pedido, String nombreArchivo) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            outputStream.writeObject(pedido);
            System.out.println("Pedido guardado exitosamente en " + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Pedido cargarPedido(String nombreArchivo) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            Pedido loadedPedido = (Pedido) inputStream.readObject();
            System.out.println("Pedido cargado exitosamente desde " + nombreArchivo);
            return loadedPedido;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
