
package com.mycompany.trabajo_en_grupo;


public class Circulo {
private double diametro;
private double radio;
private double pi;

public Circulo(double d, double r, double pi){
    this.diametro = d;
    this.radio =r;
    this.pi=3.1416;
}
public double area(){
    return this.pi*(radio*radio);
}
public double perimetro(){
    return this.pi*diametro;
}
}

