/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.encapsulamiento;


/**
 *
 * @author ATKZ
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona miPersona = new Persona("Luis", 19);
        
        System.out.println(miPersona.getNombre());
        System.out.println(miPersona.getEdad());
    }
    
}
