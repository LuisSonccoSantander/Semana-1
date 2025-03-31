
package com.packages.practicaproducto;


/**
 *
 * @author L.A.S.S.
 */

class Producto {
    private String nombre;
    private String serial;
    private String contenido;
    private String tipo;
    private double peso;
    private double tamaño;
    private String lote;

    public Producto(String nombre, String serial, String contenido,
            String tipo, double peso, double tamaño, String lote) {
        this.nombre = nombre;
        this.serial = serial;
        this.contenido = contenido;
        this.tipo = tipo;
        this.peso = peso;
        this.tamaño = tamaño;
        this.lote = lote;
    }


    public void mostrarInfo(){
        System.out.println("Nombre: " +this.nombre);
        System.out.println("Serial: " + this.serial);
        System.out.println("Contenido: " + this.contenido);
        System.out.println("Tipo producto: " + this.tipo);
        System.out.println("Peso: " + this.peso + " Kg");
        System.out.println("Tamaño: " + this.tamaño);
        System.out.println("Lote producto: " + this.lote);
        System.out.println("---------------------------------------------");
    }
    public void verUbicacion() {
        if (!"D002".equals(this.serial)) {
            System.out.println("En Tienda...");
        }   else{
            System.out.println("En Almacen...");
            }
    }
    public void verEstado(){
        System.out.println("listo para transportar...");
    }
}

public class PracticaProducto {

    public static void main(String[] args) {
        
        Producto producto1 = new Producto("OPAL", "D001",
                "Detergente en polvo", "Limpieza", 4.5, 0.4, "20250300010");
        
        producto1.verUbicacion();
        producto1.verEstado();
        producto1.mostrarInfo();
        
        Producto producto2 = new Producto("Marsella", "D002", 
                "Detergente en polvo", "Limpieza", 10.0, 0.60, "20250300020");
        
        producto2.verUbicacion();
        producto2.verEstado();
        producto2.mostrarInfo();
    
    }
}
