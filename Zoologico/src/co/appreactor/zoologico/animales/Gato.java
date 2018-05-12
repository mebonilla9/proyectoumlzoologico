/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.zoologico.animales;

import co.appreactor.zoologico.Animal;
import co.appreactor.zoologico.Domesticable;

/**
 *
 * @author Lord_Nightmare
 */
public class Gato extends Animal implements Domesticable{
    
    public boolean peloLargo;
    public boolean garrasLargas;

    public Gato() {
    }

    public Gato(boolean peloLargo) {
        this.peloLargo = peloLargo;
    }

    public Gato(boolean peloLargo, boolean garrasLargas) {
        this.peloLargo = peloLargo;
        this.garrasLargas = garrasLargas;
    }
    
    public void ronronear(){
        System.out.println("Rrrrr... Rrrrr...");
    }
    
    public void maullar(){
        System.out.println("Miau... Miau...");
    }

    @Override
    public void jugar() {
        System.out.println("Me divierto con mis cosas, no me molestes humano");
    }

    @Override
    public void pasear() {
        System.out.println("Me voy por un rato, no me esperes humano");
    }

    @Override
    public void acariciar() {
        System.out.println("Ya era hora de que me dedicaras tiempo maldito humano");
    }
    
}
