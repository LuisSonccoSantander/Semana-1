/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package POO.abstraccion;

/**
 *
 * @author ATKZ
 */
abstract class Animal {
    abstract void hacerSonido();
}

class Perro extends Animal {
    void hacerSonido() {
        System.out.println("guau");
    }
}

class Gato extends Animal {
    void hacerSonido() {
        System.out.println("miau");
    }
}

public class Abstraccion {

    public static void main(String[] args) {
        Animal miAnimal = new Perro();
        miAnimal.hacerSonido();
    }
}
