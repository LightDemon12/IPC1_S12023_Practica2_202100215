/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg2ipc1;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author LightDemon12
 */
public class PedidoManager {
    private List<Pedido> pedidos;

    public PedidoManager() {
        pedidos = new ArrayList<>();
    }

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

   public void guardarPedidosEnArchivo(ArrayList<Pedido> pedidos) {
    try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("pedidos.dat"))) {
        salida.writeObject(pedidos);
    } catch (IOException e) {
        e.printStackTrace();
    }
}

// Método para cargar los pedidos desde un archivo
public ArrayList<Pedido> cargarPedidosDesdeArchivo() {
    try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("pedidos.dat"))) {
        return (ArrayList<Pedido>) entrada.readObject();
    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
        return null;
    }
}
}