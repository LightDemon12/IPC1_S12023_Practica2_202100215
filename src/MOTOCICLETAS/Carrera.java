
package MOTOCICLETAS;

import Interfaz.VistaEntregaDePedidos;
import static java.lang.Math.random;
import javax.swing.JLabel;


public class Carrera  extends Thread{ 
    private JLabel etiqueta; 
    private VistaEntregaDePedidos moto; 

    public Carrera(JLabel etiqueta, VistaEntregaDePedidos moto) {
        this.etiqueta = etiqueta;
        this.moto = moto;
    }
    @Override
public void run() {
    int moto1 =0 ;
    int moto2 =0 ;
    int moto3 =0 ;
    try {
        while (true) {
            Thread.sleep((int) (Math.random() * 100));
            moto1 =  moto.getMOTOCICLETA1().getLocation().x;
            moto2 =  moto.getMOTOCICLETA2().getLocation().x;
            moto3 =  moto.getMOTOCICLETA3().getLocation().x;
            
            
            if (moto1 < moto.getLocation().x +125&& moto2 < moto.getLocation().x&&moto3 < moto.getLocation().x){
            etiqueta.setLocation(etiqueta.getLocation().x+10, etiqueta.getLocation().y);
            moto.repaint();
        }else {
                break;
            }
        }
        
    } catch (InterruptedException e) {
        System.out.println("Se produjo una excepción: " + e.getMessage());
    }
    if(etiqueta.getLocation().x>= moto.getBARRERA().getLocation().x){
        System.out.println("completado");
    }
}
}
