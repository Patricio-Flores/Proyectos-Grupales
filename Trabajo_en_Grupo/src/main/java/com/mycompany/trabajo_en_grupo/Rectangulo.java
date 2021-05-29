
package com.mycompany.trabajo_en_grupo;

public class Rectangulo {
private double base;
private double altura;

public Rectangulo(double b, double a) {
    this.altura = a;
    this.base = b;   
}


public double perimetro(){
    return this.base+this.base+this.altura+this.altura;
}
}