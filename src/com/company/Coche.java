package com.company;

public class Coche {

    // 1. Atributos

    String color;
    String modelo;

    public Coche(){

    }

    public Coche(String color, String modelo) {
        this.color = color;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
