/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.zoologico;

/**
 *
 * @author Lord_Nightmare
 */
public class Animal {
    
    protected int edad;
    protected char sexo;
    protected double peso;
    protected double tamano;
    protected String especie;
    
    public void respirar(){
        System.out.println("Inhalo, Exalo, Inhalo, Exalo");
    }
    
    public void comer(){
        System.out.println("Que buena comida! quiero mas!");
    }
    
    public void dormir(){
        System.out.println("Zzzz... Zzzz...");
    }
}
