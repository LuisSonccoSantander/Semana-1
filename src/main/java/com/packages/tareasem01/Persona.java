/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.packages.tareasem01;

/**
 *
 * @author ATKZ
 */
public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected String DNI;
    protected int edad;
    
    protected Persona(String nombre, String apellido, String DNI, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.edad = edad;
        
    }

    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected String getApellido() {
        return apellido;
    }

    protected void setApellido(String apellido) {
        this.apellido = apellido;
    }

    protected String getDNI() {
        return DNI;
    }

    protected void setDNI(String DNI) {
        this.DNI = DNI;
    }

    protected int getEdad() {
        return edad;
    }

    protected void setEdad(int edad) {
        this.edad = edad;
    }

    public abstract void mostrarDatos();
}
