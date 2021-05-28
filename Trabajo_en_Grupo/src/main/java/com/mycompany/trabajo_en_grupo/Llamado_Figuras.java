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
        int opcion=0;
        
        
        Scanner sc=new Scanner (System.in);
        System.out.println("selecciones la figura");
        opcion=sc.nextInt();
        switch(opcion){
            case 1:
                System.out.println("ingrese el lado ");
                lado=sc.nextDouble();
                Cuadrado c=new Cuadrado(lado);
                break;
            case 2:
                // Rectangulo re=new Rectangulo(b,a);
                break;
            case 3:
                System.out.println("Ingrese la base: ");
                b=sc.nextDouble();
                System.out.println("Ingrese la altura: ");
                altura=sc.nextDouble();
                System.out.println("ingrese el lado ");
                lado=sc.nextDouble();
                triangulo t = new triangulo(b,altura,lado);
                break;
            case 4:
                System.out.println("Ingrese la diagonal mayor: ");
                Diagonalm=sc.nextDouble();
                System.out.println("Ingrese la diagonal menor: ");
                diagonalm=sc.nextDouble();
                System.out.println("ingrese el lado ");
                lado=sc.nextDouble();
                 Rombo r = new Rombo (Diagonalm,diagonalm,lado);
                break;
            case 5:
                 System.out.println("Ingrese la base: ");
                b=sc.nextDouble();
                System.out.println("Ingrese la altura: ");
                altura=sc.nextDouble();
                ROMBOIDE rom=new ROMBOIDE(b,altura);
                break;
            case 6:
                System.out.println("ingrese el lado ");
                lado=sc.nextDouble();
                 System.out.println("Ingrese la base: ");
                b=sc.nextDouble();
                System.out.println("Ingrese la altura: ");
                altura=sc.nextDouble();
                System.out.println("Ingrese la base mayor: ");
                bmayor=sc.nextDouble();
                System.out.println("Ingrese la base menor: ");
                bmenor=sc.nextDouble();
                Trapecio tr = new Trapecio (lado,b,altura,bmayor,bmenor);
                break;
            case 7:
                System.out.println("Ingrese el diametro: ");
                diametro=sc.nextDouble();
                System.out.println("Ingrese el radio: ");
                radio=sc.nextDouble();
                 Circulo cir=new Circulo(diametro,radio,pi);
                break;
            case 8:
                System.out.println("ingrese el lado ");
                lado=sc.nextDouble();
                System.out.println("Ingrese el apotema: ");
                apotema=sc.nextDouble();
                System.out.println("Ingrse el numero de lados: ");
                num=sc.nextDouble();
                  poligono po=new poligono(lado,apotema,num);
                break;
        }
        
       
    }
    
}
