/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double base;
        double altura;
        double area;

        System.out.println("Ingrese la base del triangulo:");
        base = entrada.nextDouble();

        System.out.println("Ingrese la altura del triangulo:");
        altura = entrada.nextDouble();

        area = (base * altura) / 2;

        System.out.printf("AREA DEL TRIANGULO");
       
    }

}
