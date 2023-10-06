package MOTOCICLETAS;

import Interfaz.VistaEntregaDePedidos;
import javax.swing.JLabel;

public class Carrera extends Thread {
    private JLabel etiqueta;
    private VistaEntregaDePedidos moto;
    private double velocidad; // Velocidad basada en la distancia

    public Carrera(JLabel etiqueta, VistaEntregaDePedidos moto, double distancia) {
        this.etiqueta = etiqueta;
        this.moto = moto;
        this.velocidad = calcularVelocidad(distancia);
    }

    private double calcularVelocidad(double distancia) {
        // Define una relación velocidad/distancia adecuada según tus requisitos
        // Puedes ajustar este valor según sea necesario
        return distancia / 10.0; // Por ejemplo, 10 unidades de distancia = 1 unidad de velocidad
    }

    @Override
    public void run() {
        try {
            int distanciaInicial = moto.getBARRERA2().getLocation().x; // Punto de partida en BARRERA2

            // Mover la etiqueta al punto de partida en BARRERA2
            etiqueta.setLocation(distanciaInicial, etiqueta.getLocation().y);
            moto.repaint();

            // Avanzar hacia BARRERA
            while (etiqueta.getLocation().x < moto.getBARRERA().getLocation().x - 20) { // Distancia deseada
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
