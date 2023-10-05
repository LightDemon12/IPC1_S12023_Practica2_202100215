/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg2ipc1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;


public class DatosGlobales1  implements Serializable {
     private static DatosGlobales1 instance; 
     public static ArrayList<Comidas> comidas; 
 
     private DatosGlobales1() {
    comidas = new ArrayList<>();
}

  
     
         public static synchronized  DatosGlobales1 getInstance(){
        if  ( instance == null){ 
            instance = new DatosGlobales1(); 
            
        }
        
        return instance; 
    }
          public ArrayList<Comidas> getComidas() {
        return comidas;}
         
          public void guardarDatos() {
        serializarDatos(this, "datos.dat");
        System.out.println("Datos guardados correctamente en datos.dat");
    }
          public void serializarDatos(DatosGlobales1 datos, String rutaArchivo) {
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(rutaArchivo))) {
            salida.writeObject(datos);
            System.out.println("Datos serializados correctamente en " + rutaArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    
   }
  public static DatosGlobales1 deserializarDATOS(String rutaArchivo) {
          Comidas comida1 = new Comidas();
        comida1.setNombre("Hamburguesa");
        comida1.setPrecio(10);  // Precio en dólares

        Comidas comida2 = new Comidas();
        comida2.setNombre("Pizza");
        comida2.setPrecio(8);

        Comidas comida3 = new Comidas();
        comida3.setNombre("Papas Fritas");
        comida3.setPrecio(4);

        Comidas comida4 = new Comidas();
        comida4.setNombre("Ensalada");
        comida4.setPrecio(6);
        
         DatosGlobales1.getInstance().getComidas().add(comida1);
        DatosGlobales1.getInstance().getComidas().add(comida2);
        DatosGlobales1.getInstance().getComidas().add(comida3);
        DatosGlobales1.getInstance().getComidas().add(comida4);
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(rutaArchivo))) {
            DatosGlobales1 datos = (DatosGlobales1) entrada.readObject();
            System.out.println("Los datos se deserializaron correctamente desde " + rutaArchivo);
            return datos;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
    }
   
    
}

         
}
