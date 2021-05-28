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
        double D=0,d=0,l=0,b=0,a=0, bmayor=0, bmenor=0;
        Scanner sc=new Scanner (System.in);
        System.out.println("ingrese lado");
        l=sc.nextDouble();
        System.out.println("ingrese diagonal Mayor");
        D=sc.nextDouble();
        System.out.println("ingrese Diagonal Menor");
        d=sc.nextDouble();
        
        triangulo t = new triangulo(b,a,l);
        Rombo r = new Rombo (D,d,l);
       // Trapecio tra =new Trapecio (l,b,a,bmayor,bmenor);
        
        System.out.println("EL AREA ES "+r.area());
        System.out.println("EL PERIMETRO ES "+r.perimetro());
    }
    
}
