
package com.mycompany.trabajo_en_grupo;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Rectangulo {
  public static double  base, altura;
    public static void datosrectangulo() {

        base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del rectangulo"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la haltura del rectangulo"));
    }

    public static void arearectangulo() {
        JOptionPane.showMessageDialog(null, "El area del rectangulo es: " + (base * altura));
    }

    public static void perimetrorectangulo() {
        JOptionPane.showMessageDialog(null, "El area del rectangulo es: " + (base + altura + base + altura));
    }
}
