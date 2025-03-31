/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.packages.tareasem01;

/**
 *
 * @author ATKZ
 */
public class Alumno extends Persona {
    
    private String carrera;
    
    public Alumno(String nombre, String apellido, String DNI, int edad,
            String carrera) {
        super(nombre, apellido, DNI, edad);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    @Override
    public void mostrarDatos(){
        System.out.println(super.getNombre()+ " | " 
                + super.getApellido() + " | " + super.getDNI() + " | " 
                + super.getEdad() + " | " + this.getCarrera());
    }
    
}
