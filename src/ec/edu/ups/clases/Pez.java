/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.clasesInterfaces.Acciones;

/**
 *
 * @author jonnathan
 */
public class Pez extends Animal implements Acciones{

    public Pez(String nombre, int edad, double peso, String sexo) {
        super(nombre, edad, peso, sexo);
    }

    @Override
    public void comer() {
        System.out.println("El pez "+this.getNombre()+" esta comiendo");
    }

    @Override
    public void dormir() {
        System.out.println("El pez "+this.getNombre()+" esta durmiendo");
    }

    @Override
    public void moverse() {
        System.out.println("El pez "+this.getNombre()+" esta moviendose");
    }

    @Override
    public void jugar() {
        System.out.println("El pez "+this.getNombre()+" esta jugando");
    }

    @Override
    public void reproducirse() {
        System.out.println("El pez "+this.getNombre()+" esta reproduciendose");
    }
    
}
