
package MOTOCICLETAS;

import Interfaz.VistaEntregaDePedidos;
import static java.lang.Math.random;
import javax.swing.JLabel;

public class Carrera extends Thread {
    private JLabel etiqueta;
    private VistaEntregaDePedidos moto;

    public Carrera(JLabel etiqueta, VistaEntregaDePedidos moto) {
        this.etiqueta = etiqueta;
        this.moto = moto;
    }

    @Override
    public void run() {
        try {
            int distanciaDeseada = 20; // La distancia deseada antes de detenerse
            while (etiqueta.getLocation().x < moto.getBARRERA().getLocation().x - distanciaDeseada) {
                int velocidad = (int) (Math.random() * 100); // Velocidad aleatoria
                Thread.sleep(velocidad);
                etiqueta.setLocation(etiqueta.getLocation().x + 10, etiqueta.getLocation().y);
                moto.repaint();
            }
        } catch (InterruptedException e) {
            System.out.println("Se produjo una excepción: " + e.getMessage());
        }
        if (etiqueta.getLocation().x >= moto.getBARRERA().getLocation().x - 50) {
            System.out.println("Completado");
        }
    }
}

