/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programas_informes;

import javax.swing.JOptionPane;

/**
 *
 * @author leski
 */
public class Figuras {

    //variables globales
    public static double lado, base, altura, dm, dmenor, bmenor, bmayor, radio, apotema, perimetro, nlados, diametro;

    public static void main(String[] args) {
        String opcion;
        //Figuras Geometricas
        opcion = JOptionPane.showInputDialog(null, "Hola seleccione la operacion"
                + "\n 1. Àrea y Perìmetro Cuadrado"
                + "\n 2. Àrea y Perìmetro Rectangulo"
                + "\n 3. Àrea y Perìmetro Trinagulo"
                + "\n 4. Àrea y Perìmetro Rombo"
                + "\n 5. Àrea y Perìmetro Romboide"
                + "\n 6. Àrea y Perìmetro Trapecio"
                + "\n 7. Àrea y Perìmetro Circulo"
                + "\n 8. Àrea y Perìmetro Poligono"
                + "\n 9. Salir");
        switch (opcion) {
            case "1":
                datoscuadrado();
                areacuadrado();
                perimetrocuadrado();
                break;
            case "2":
                datosrectangulo();
                arearectangulo();
                perimetrorectangulo();

                break;
            case "3":
                datostriangulo();
                areatriangulo();
                perimetrotringulo();

                break;
            case "4":
                datosrombo();
                arearombo();
                perimetrorombo();

                break;
            case "5":
                datosromboide();
                arearomboide();
                perimetroromboide();
                break;
            case "6":
                datosTrapecio();
                areatrapecio();
                perimetrotrapecio();
                break;
            case "7":
                datosCirculo();
                areaCirculo();
                perimetroCirculo();
                break;
            case "8":
                datospoligono();
                areapoligono();
                perimetropoligono();
                break;
            case "9":
                JOptionPane.showMessageDialog(null, "Arrivederci (Hasta luego :))");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Arrivederci");
                break;
        }

    }

    public static void datoscuadrado() {

        lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado del cuadrado"));
    }

    public static void areacuadrado() {
        JOptionPane.showMessageDialog(null, "El area del cuadrado es: " + (lado * lado));
    }

    public static void perimetrocuadrado() {
        JOptionPane.showMessageDialog(null, "El àrea del cuadrado es: " + (lado + lado + lado + lado));
    }

    public static void datosrectangulo() {

        base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del rectangulo"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la haltura del rectangulo"));
    }

    public static void arearectangulo() {
        JOptionPane.showMessageDialog(null, "El àrea del rectangulo es: " + (base * altura));
    }

    public static void perimetrorectangulo() {
        JOptionPane.showMessageDialog(null, "El àrea del rectangulo es: " + (base + altura + base + altura));
    }

    public static void datostriangulo() {

        lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del lado del tringulo"));
        base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del Trinagulo"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del triangulo"));
    }

    public static void areatriangulo() {
        JOptionPane.showMessageDialog(null, "El àrea del triangulo es: " + (base * altura) / 2);
    }

    public static void perimetrotringulo() {
        JOptionPane.showMessageDialog(null, "El Perìmetro del Triangulo es: " + (lado + lado + lado));
    }
//ROMBO

    public static void datosrombo() {

        dm = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la diagonal MAYOR  "));
        dmenor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la diagonal MENOR "));
        lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado Rombo  "));
    }

    public static void arearombo() {
        JOptionPane.showMessageDialog(null, "El àrea del Rombo :" + (dm * dmenor));
    }

    public static void perimetrorombo() {
        JOptionPane.showMessageDialog(null, "El perìmetro del Rombo es :" + (lado * 4));
    }

    //ROMBOIDE
    public static void datosromboide() {
        base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del romboide: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del romboide: "));
    }

    public static void arearomboide() {
        JOptionPane.showInternalMessageDialog(null, "El área del romboide es: " + (base * altura));

    }

    public static void perimetroromboide() {
        JOptionPane.showInternalMessageDialog(null, "El perímetro del romboide es: " + (base + base + altura + altura));

    }

    public static void datosTrapecio() {

        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura trapecio  "));
        bmayor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base mayor :trapecio "));
        bmenor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el base menor : trapecio  "));
        lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el LADO de trapecio  "));
    }

    public static void areatrapecio() {
        JOptionPane.showMessageDialog(null, "EL ÀREA DEL TRAPECIO ES :" + ((altura * (bmayor * bmenor)) / 2));
    }

    public static void perimetrotrapecio() {
        JOptionPane.showMessageDialog(null, "EL PERÌMETRO DEL TRAPECIO  ES :" + (bmayor + bmenor + lado + lado));
    }

    public static void datosCirculo() {
        radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo "));
        diametro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el diametro"));
    }

    public static void areaCirculo() {
        JOptionPane.showMessageDialog(null, "El àrea del Circulo es: " + (Math.PI * Math.pow(radio, 2)));
    }

    public static void perimetroCirculo() {
        JOptionPane.showMessageDialog(null, "La circunferencia es: " + (Math.PI * diametro));
    }

    public static void datospoligono() {
        nlados = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero de lados  "));
        lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el la del poligono  "));
        apotema = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el apotema  "));

    }

    public static void perimetropoligono() {
        perimetro = lado * nlados;
        JOptionPane.showMessageDialog(null, "EL PERÌMETRO DEL POLIGONO ES :" + perimetro);
    }

    public static void areapoligono() {
        perimetro = lado * nlados;
        JOptionPane.showMessageDialog(null, "EL ÀREA DEL POLIGONO ES  :" + (perimetro * apotema) / 2);
    }

}
