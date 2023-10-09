package MOTOCICLETAS;

import Interfaz.VistaEntregaDePedidos;
import practica.pkg2ipc1.Pedido;

import javax.swing.JLabel;
import java.util.List;

public class Carrera2 extends Thread {
    private JLabel etiqueta;
    private VistaEntregaDePedidos moto;
    private List<Pedido> pedidos; // Lista de pedidos
    private double velocidad; // Velocidad basada en la distancia

    public Carrera2(JLabel etiqueta, VistaEntregaDePedidos moto, List<Pedido> pedidos) {
        this.etiqueta = etiqueta;
        this.moto = moto;
        this.pedidos = pedidos;
        this.velocidad = calcularVelocidad(); // Calcular la velocidad en función del primer pedido
    }

    private double calcularVelocidad() {
        if (!pedidos.isEmpty()) {
            // Obtener la distancia del primer pedido (índice 0)
            double distancia = pedidos.get(1).getDistancia();

            // Ajustar la velocidad en función de la distancia (1 a 10)
            return distancia * 10.0;
        } else {
            // Manejar el caso en que la lista de pedidos esté vacía
            return 0.0;
        }
    }

    @Override
    public void run() {
        try {
            int distanciaInicial = moto.getBARRERA2().getLocation().x; // Punto de partida en BARRERA2

            // Mover la etiqueta al punto de partida en BARRERA2
            etiqueta.setLocation(distanciaInicial, etiqueta.getLocation().y);
            moto.repaint();

            // Avanzar hacia BARRERA
            int distanciaDeseada = moto.getBARRERA().getLocation().x - 20;
            while (etiqueta.getLocation().x < distanciaDeseada) {
                Thread.sleep((long) velocidad); // Usa la velocidad calculada
                etiqueta.setLocation(etiqueta.getLocation().x + 10, etiqueta.getLocation().y);
                moto.repaint();
            }

            // Cuando llegan a la barrera, regresan al punto de partida en BARRERA2
            while (etiqueta.getLocation().x > distanciaInicial) {
                Thread.sleep((long) velocidad); // Usa la velocidad calculada
                etiqueta.setLocation(etiqueta.getLocation().x - 10, etiqueta.getLocation().y);
                moto.repaint();
            }
        } catch (InterruptedException e) {
            System.out.println("Se produjo una excepción: " + e.getMessage());
        }
    }
}
