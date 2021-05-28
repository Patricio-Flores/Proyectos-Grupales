
package com.mycompany.trabajo_en_grupo;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Trapecio {
    public static double lado, base, altura, bmayor, bmenor;
    public static void datosTrapecio() {

        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la hasltura : trapecio  "));
        bmayor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base mayor :trapecio "));
        bmenor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el base menor : trapecio  "));
        lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el LADO de trapecio  "));
    }

    public static void areatrapecio() {
        JOptionPane.showMessageDialog(null, "EL AREA DEL TRAPECIO ES :" + ((altura * (bmayor * bmenor)) / 2));
    }

    public static void perimetrotrapecio() {
        JOptionPane.showMessageDialog(null, "EL PERIMETRO DEL TRAPECIO  ES :" + (bmayor + bmenor + lado + lado));
    }
}
