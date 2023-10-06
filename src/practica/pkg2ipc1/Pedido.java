/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg2ipc1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Pedido implements Serializable {
    private double distancia;
    private String vehiculo;
    private int total;
    
    // Lista para mantener un historial de pedidos
    private static List<Pedido> historialPedidos = new ArrayList<>();

    public Pedido(double distancia, String vehiculo, int total) {
        this.distancia = distancia;
        this.vehiculo = vehiculo;
        this.total = total;
        
        // Agregar este pedido al historial
        historialPedidos.add(this);
        
        // Si hay más de 3 pedidos en el historial, eliminar el más antiguo
        if (historialPedidos.size() > 3) {
            historialPedidos.remove(0);
        }
    }

    public double getDistancia() {
        return distancia;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public int getTotal() {
        return total;
    }

    // Método estático para obtener el historial de pedidos
    public static List<Pedido> getHistorialPedidos() {
        return historialPedidos;
    }
}
