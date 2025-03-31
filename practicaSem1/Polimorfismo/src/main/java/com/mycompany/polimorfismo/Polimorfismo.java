/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polimorfismo;

/**
 *
 * @author ATKZ
 */

class Animal {
    void hacerSonido(){
        System.out.println("sonido de animal");
    }
}

class Perro extends Animal {
    void hacerSonido() {
        System.out.println("Guau");
    }
}

class Gato extends Animal{
    void hacerSonido() {
        System.out.println("Miau");
    }
}

public class Polimorfismo {

    public static void main(String[] args) {
        Animal miAnimal = new Perro();
        miAnimal.hacerSonido();
        
        miAnimal = new Gato();
        miAnimal.hacerSonido();        
    }
}
