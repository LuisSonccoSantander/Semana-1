/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herencia;

/**
 *
 * @author ATKZ
 */

    class Animal {
        void comer() {
            System.out.println("el animal come");
        }
    }
    class Perro extends Animal {
        void ladrar() {
            System.out.println("guau");
        }
    }
    
public class Herencia {
       
    public static void main(String[] args) {
        Perro perro  = new Perro();
        perro.comer();
        perro.ladrar();
        
    }
}
