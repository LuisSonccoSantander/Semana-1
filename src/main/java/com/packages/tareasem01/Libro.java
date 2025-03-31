/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.packages.tareasem01;

/**
 *
 * @author ATKZ
 */
public class Libro {
    private String titulo;
    private String tipo;
    private String autor;
    private String editorial;
    private String ISBN;

    public Libro(String titulo, String tipo, String autor, 
            String editorial, String ISBN) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.autor = autor;
        this.editorial = editorial;
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    
    public void mostrarLibro(){
        System.out.println(this.getISBN()+ " | " + this.getTitulo() 
                + " | " + this.getTipo() + " | " + this.getAutor() 
                + " | " + this.getEditorial());
    }
    
}
