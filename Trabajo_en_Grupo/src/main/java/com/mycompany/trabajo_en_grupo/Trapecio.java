
package com.mycompany.trabajo_en_grupo;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Trapecio {
    public static double lado, base, altura, bmayor, bmenor;
    public static void datosTrapecio() {

        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura de trapecio  "));
        bmayor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base mayor de trapecio "));
        bmenor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base menor de trapecio  "));
        lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado de trapecio  "));
    }

    public static void areatrapecio() {
        JOptionPane.showMessageDialog(null, "El área de trapecio es :" + ((altura * (bmayor * bmenor)) / 2));
    }

    public static void perimetrotrapecio() {
        JOptionPane.showMessageDialog(null, "el perímetro del trapecio es :" + (bmayor + bmenor + lado + lado));
    }
}
