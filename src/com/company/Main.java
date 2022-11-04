package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        CocheCRUD cocheCrud = new CocheCRUDImpl();

        // Instancio 3 carros diferentes
        Coche cocheBMW = new Coche("Azul", "BMW");
        Coche cocheMazda = new Coche("Rojo", "Mazda");
        Coche cocheTesla = new Coche("Negro", "Tesla");

        // Guardo todos los carros
        cocheCrud.save(cocheBMW);
        cocheCrud.save(cocheMazda);
        cocheCrud.save(cocheTesla);

        // Muestro la lista con todos los carros
        List<Coche> resultado = cocheCrud.find();
        System.out.println(resultado);

        // Elimino un carro y visualizo la lista
        cocheCrud.delete(cocheMazda);
        System.out.println(cocheCrud.find());

    }
}
