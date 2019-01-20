/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.zoologico.animales;

import co.appreactor.zoologico.Animal;
import co.appreactor.zoologico.Comestible;

/**
 *
 * @author Lord_Nightmare
 */
public class Mojarra extends Animal implements Comestible{

    public int capacidadProfundidad;
    public String color;

    public Mojarra() {
    }

    public Mojarra(int capacidadProfundidad) {
        this.capacidadProfundidad = capacidadProfundidad;
    }

    public Mojarra(int capacidadProfundidad, String color) {
        this.capacidadProfundidad = capacidadProfundidad;
        this.color = color;
    }
    
    public void nadar(){
        System.out.println("Glu... Glu...");
    }
    
    @Override
    public void refrigerar() {
        System.out.println("Temperatura a -15-C");
    }

    @Override
    public void sazonar() {
        System.out.println("Aplicando cebolla, cilanto, perejil");
    }

    @Override
    public void cocinar() {
        System.out.println("Temperatura a 110-C");
    }
    
}
