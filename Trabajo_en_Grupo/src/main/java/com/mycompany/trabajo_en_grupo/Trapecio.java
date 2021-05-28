
package com.mycompany.trabajo_en_grupo;


public class Trapecio {
private double altura;
private double baseMayor;
private double baseMenor;
private double lado;

public Trapecio(double a, double bM, double bm, double lad){
    this.altura = a;
    this.baseMayor = bM;
    this.baseMenor = bm;
    this.lado = lad; 
}
    
        public double area(){
    return (this.altura*(this.baseMayor+this.baseMenor))/2;
}
public double perimetro(){
    return this.baseMayor+this.baseMenor+this.lado+this.lado;
}
}  
