/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.zoologico.animales;

import co.appreactor.zoologico.Animal;
import co.appreactor.zoologico.Comestible;
import co.appreactor.zoologico.Domesticable;

/**
 *
 * @author Lord_Nightmare
 */
public class Pato extends Animal implements Domesticable, Comestible {

    public double embergaduraAlas;
    public double tamañoPico;

    public Pato() {
    }

    public Pato(double embergaduraAlas) {
        this.embergaduraAlas = embergaduraAlas;
    }

    public Pato(double embergaduraAlas, double tamañoPico) {
        this.embergaduraAlas = embergaduraAlas;
        this.tamañoPico = tamañoPico;
    }

    public void hacerQuack() {
        System.out.println("Quack... Quack...");
    }

    @Override
    public void jugar() {
        System.out.println("Jugando en el agua, chapoteando");
    }

    @Override
    public void pasear() {
        System.out.println("Nadando en el charco....");
    }

    @Override
    public void acariciar() {
        System.out.println("Tengo plumas suaves");
    }

    @Override
    public void refrigerar() {
        System.out.println("Temperatura actual: -4-C");
    }

    @Override
    public void sazonar() {
        System.out.println("Aplicando Oregano y Laurel");
    }

    @Override
    public void cocinar() {
        System.out.println("Temperatura actual ");
    }

}
