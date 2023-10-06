
package MOTOCICLETAS;

import Interfaz.VistaEntregaDePedidos;
import static java.lang.Math.random;
import javax.swing.JLabel;

public class Carrera extends Thread {
    private JLabel etiqueta;
    private VistaEntregaDePedidos moto;
    private int distanciaDeseada = 20; // La distancia deseada antes de detenerse

    public Carrera(JLabel etiqueta, VistaEntregaDePedidos moto) {
        this.etiqueta = etiqueta;
        this.moto = moto;
    }

    @Override
    public void run() {
        try {
            int velocidad = (int) (Math.random() * 100); // Velocidad aleatoria
            int distanciaInicial = moto.getBARRERA2().getLocation().x; // Punto de partida en BARRERA2

            // Mover la etiqueta al punto de partida en BARRERA2
            etiqueta.setLocation(distanciaInicial, etiqueta.getLocation().y);
            moto.repaint();

            // Avanzar hacia BARRERA
            while (etiqueta.getLocation().x < moto.getBARRERA().getLocation().x - distanciaDeseada) {
                Thread.sleep(velocidad);
                etiqueta.setLocation(etiqueta.getLocation().x + 10, etiqueta.getLocation().y);
                moto.repaint();
            }

            // Cuando llegan a la barrera, regresan al punto de partida en BARRERA2
            while (etiqueta.getLocation().x > distanciaInicial) {
                Thread.sleep(velocidad);
                etiqueta.setLocation(etiqueta.getLocation().x - 10, etiqueta.getLocation().y);
                moto.repaint();
            }
        } catch (InterruptedException e) {
            System.out.println("Se produjo una excepción: " + e.getMessage());
        }
    }
}


