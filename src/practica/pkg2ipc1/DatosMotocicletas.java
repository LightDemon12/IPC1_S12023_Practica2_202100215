/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg2ipc1;

import java.util.ArrayList;

/**
 *
 * @author LightDemon12
 */
public class DatosMotocicletas {
    private static ArrayList<String> motocicletas = new ArrayList<>();

    static {
        // Agregar datos quemados
        motocicletas.add("Motocicleta 1");
        motocicletas.add("Motocicleta 2");
        motocicletas.add("Motocicleta 3");
    }

    public static ArrayList<String> getMotocicletas() {
        return motocicletas;
    }
}
