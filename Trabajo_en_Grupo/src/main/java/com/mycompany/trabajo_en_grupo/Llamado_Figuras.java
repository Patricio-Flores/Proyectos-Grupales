/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabajo_en_grupo;

import java.util.Scanner;
import com.mycompany.trabajo_en_grupo.Rombo;
import com.mycompany.trabajo_en_grupo.triangulo;
import com.mycompany.trabajo_en_grupo.Trapecio;
import com.mycompany.trabajo_en_grupo.poligono;
import com.mycompany.trabajo_en_grupo.Rectangulo;

/**
 *
 * @author leski
 */
public class Llamado_Figuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Figuras
        double Diagonalm=0,diagonalm=0,lado=0,b=0,bmayor=0, bmenor=0,apotema=0,num=0,altura=0,radio=0,pi=0,diametro=0;
        Scanner sc=new Scanner (System.in);
        System.out.println("ingrese lado");
        lado=sc.nextDouble();
        System.out.println("ingrese diagonal Mayor");
        Diagonalm=sc.nextDouble();
        System.out.println("ingrese Diagonal Menor");
        diagonalm=sc.nextDouble();
        
        Cuadrado c=new Cuadrado(lado);
       // Rectangulo re=new Rectangulo(b,a);
        triangulo t = new triangulo(b,altura,lado);
        Rombo r = new Rombo (Diagonalm,diagonalm,lado);
        ROMBOIDE rom=new ROMBOIDE(b,altura);
        Trapecio tr = new Trapecio (lado,b,altura,bmayor,bmenor);
        Circulo cir=new Circulo(diametro,radio,pi);
        poligono po=new poligono(lado,apotema,num);
        
        System.out.println("EL AREA ES "+r.area());
        System.out.println("EL PERIMETRO ES "+r.perimetro());
    }
    
}
