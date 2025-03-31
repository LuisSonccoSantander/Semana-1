/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.packages.tareasem01;

/**
 *
 * @author ATKZ
 */
public class Administrador extends Persona {
    private String codigo;
    public Administrador(String nombre, String apellido, String DNI, 
            int edad, String codigo) {
        super(nombre, apellido, DNI, edad);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
    
    @Override
    public void mostrarDatos(){
        System.out.println(super.getNombre() + " | " + super.getApellido() + " | " 
                + super.getDNI() + " | "+ super.getEdad() + " | " + this.getCodigo());
     }
}
