/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg2ipc1;

import java.io.Serializable;

/**
 *
 * @author LightDemon12
 */
public class Pedido implements Serializable {
    private double distancia;
    private String vehiculo;
    private int total;

    public Pedido(double distancia, String vehiculo, int total) {
        this.distancia = distancia;
        this.vehiculo = vehiculo;
        this.total = total;
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
}

