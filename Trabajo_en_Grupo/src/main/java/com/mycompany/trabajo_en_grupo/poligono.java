
package com.mycompany.trabajo_en_grupo;


public class poligono {
        private double apotema;
    private double numerol;
    private double lado ; 
    
    public poligono(double ap, double num, double l){
        this.apotema = ap;
        this.numerol =num;
        this.lado = l;
        
    }
    public double perimetro(){
        return this.lado *this.numerol;
    }
    public double area(){
        return ((this.lado*this.numerol)*this.apotema)/2;
    }
    
}

