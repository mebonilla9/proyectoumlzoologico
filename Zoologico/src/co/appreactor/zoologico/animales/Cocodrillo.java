/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.zoologico.animales;

import co.appreactor.zoologico.Animal;

/**
 *
 * @author Lord_Nightmare
 */
public class Cocodrillo extends Animal{
    
    public int dientes;
    public double longitud;

    public Cocodrillo() {
    }

    public Cocodrillo(int dientes) {
        this.dientes = dientes;
    }

    public Cocodrillo(int dientes, double longitud) {
        this.dientes = dientes;
        this.longitud = longitud;
    }
    
    public void morder(){
        System.out.println("WWWW      WWWW");
        System.out.println("     WWWW     ");
        System.out.println("     WWWW     ");
        System.out.println("WWWW      WWWW");
    }
    
    public void emboscar(){
        System.out.println("Esperando mi preza");
    }
}
