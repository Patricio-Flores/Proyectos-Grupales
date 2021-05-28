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
public class Rombo {
    private double Dim;
    private double diame;
    private double lado;
    
    public Rombo(double D,double d,double l){
       this.diame =d;
        this.Dim =D;
        this.lado=l;
    }
   public double area(){
       return this.Dim * this.diame;
   }
   
   public double perimetro(){
       return this.lado+this.lado+this.lado+this.lado;
   }
   
}
