package com.mycompany.trabajo_en_grupo;

public class Trapecio {

    private double lado;
    private double base;
    private double altura;
    private double bmayor;
    private double bmenor;

    public Trapecio(double l, double b, double h, double bma, double bme) {
        this.lado = l;
        this.base = b;
        this.altura = h;
        this.bmayor = bma;
        this.bmenor = bme;

    }

    public double perimetro() {
        return this.bmayor + this.bmenor + this.lado + this.lado;
    }

    public double area() {
        return (this.altura * (this.bmayor * this.bmenor)) / 2;
    }

}
