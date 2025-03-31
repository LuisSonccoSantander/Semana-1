
package com.packages.tareasem01;

/**
*Replicar los ejemplos mostrados en la presentación sobre Herencia, 
* Abstracción, Encapsulamiento y Polimorfismo en JAVA, cada uno en un 
* archivo .java.(Hacer capturas de código y la salida de cada uno)
*Aplicar los pilares de la POO(Herencia, Abstracción, Encapsulamiento 
* y Polimorfismo) con el Sistema de Gestión de Biblioteca Universitaria
* (3 - 4 clases mínimas):
*Por ejemplo: Clase Libros, Clase Usuario, Clase Docente,
* Clase Alumno, Clase Administrativo, Clase Administrador,
* ClaseMultimedia, Clase Préstamo, etc.
En este punto es importante explicar cómo aplicarían 
* los  pilares de POO en las clases que usted propone. 
* Además debe implementar en Java esa propuesta. 
* (Hacer capturas de código y la salida de cada uno)
*/

public class TareaSem01 {

    public static void main(String[] args) {
        
        Prestamo prest1 = new Prestamo("29/03/2025");
        prest1.mostrarPrestamo();
        Alumno Alum1 = new Alumno("luis", "Soncco", "1234567", 19, "ingenieria");
        Alum1.mostrarDatos();
        
        Administrador admin1 = new Administrador("marcos", "leiva", "2323332",
                20, "1234");
        admin1.mostrarDatos();
        
        Libro lib1 = new Libro("Divina Comedia", "Literario", "Dante Alligueri",
        "Editorial Edaf, S.L.", "id1002");
        lib1.mostrarLibro();
        
    }   
}
