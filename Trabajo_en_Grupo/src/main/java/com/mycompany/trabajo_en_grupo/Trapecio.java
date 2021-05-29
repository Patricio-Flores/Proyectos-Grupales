package com.mycompany.trabajo_en_grupo;


public class Trapecio {
private double altura;
private double baseMayor;
private double baseMenor;
private double lado;


public Trapecio(double a, double bM, double bm, double lado){
    this.altura = a;
    this.baseMayor = bM;
    this.baseMenor = bm;
    this.lado = lado; 
   

    }

    public double perimetro() {
        return this.baseMayor + this.baseMayor + this.lado + this.lado;
    }

    public double area() {
        return (this.altura * (this.baseMenor * this.baseMenor)) / 2;
    }
}
