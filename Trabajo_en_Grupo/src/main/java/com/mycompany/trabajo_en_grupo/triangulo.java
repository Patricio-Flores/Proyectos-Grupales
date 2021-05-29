
package com.mycompany.trabajo_en_grupo;


public class triangulo {
    private double base;
    private double altura;
    private double lado;
    
    public triangulo(double b,double a, double l){
        this.base = b;
        this.altura = a;
        this.lado = l;
        
    }
    public double area(){
        return (this.base *this.altura)/2;
    }
    public double perimetro(){
        return this.lado * 3 ;
    }
}
