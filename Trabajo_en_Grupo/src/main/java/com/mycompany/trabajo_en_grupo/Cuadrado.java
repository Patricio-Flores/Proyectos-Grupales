/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabajo_en_grupo;

/**
 *
 * @author leski
 */
public class Cuadrado {
    
     private double lado;
   
    public Cuadrado(double l){
       this.lado =l;
    }
   public double area(){
       return this.lado * this.lado;
   }
   
   public double perimetro(){
       return this.lado+this.lado+this.lado+this.lado;
   }
}
