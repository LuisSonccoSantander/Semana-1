/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.packages.tareasem01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author ATKZ
 */
public class Prestamo {
    private String fecPrest;
    private String fecDevo;
    
    public Prestamo(String fecPrest) {
        this.fecPrest = fecPrest;     
    }

    public String getFecPrest() {
        return fecPrest;
    }

    public void setFecPrest(String fecPrest) {
        this.fecPrest = fecPrest;
    }

    public String getFecDevo() {
        return fecDevo;
    }   
    
    // calcular fecha de devolucion
    public static String calFecDevo(String fecPrest){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate forFec = LocalDate.parse(fecPrest,formato);
        LocalDate fecDevo = forFec.plusDays(7);
        return fecDevo.format(formato); 
    }
    public void mostrarPrestamo() {
        
        System.out.println("fecha de prestamo: " + this.getFecPrest());
        System.out.println("fecha de devolucion: " + calFecDevo(fecPrest));   
    }
}
