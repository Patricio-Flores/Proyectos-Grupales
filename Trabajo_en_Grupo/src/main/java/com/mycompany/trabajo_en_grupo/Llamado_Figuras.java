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
        double D=0,d=0,l=0,b=0,a=0, bmayor=0, bmenor=0,apotema=0,num=0,altura=0;
        Scanner sc=new Scanner (System.in);
        System.out.println("ingrese lado");
        l=sc.nextDouble();
        System.out.println("ingrese diagonal Mayor");
        D=sc.nextDouble();
        System.out.println("ingrese Diagonal Menor");
        d=sc.nextDouble();
        
        Rectangulo re=new Rectangulo(b,altura);
        triangulo t = new triangulo(b,a,l);
        Rombo r = new Rombo (D,d,l);
       // Trapecio tr = new Trapecio (altura,bmayor,bmenor,l);
        poligono po=new poligono(l,apotema,num)
                ;
        System.out.println("EL AREA ES "+r.area());
        System.out.println("EL PERIMETRO ES "+r.perimetro());
    }
    
}
