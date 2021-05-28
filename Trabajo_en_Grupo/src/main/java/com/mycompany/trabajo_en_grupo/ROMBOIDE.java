
package com.mycompany.trabajo_en_grupo;


public class ROMBOIDE{
private double base;
private double altura;

public ROMBOIDE(double b, double h){
    this.base = b;
    this.altura =h;
}
public double area(){
    return this.base*altura;
}
public double perimetro(){
    return this.base+base+altura+altura;
}
}


