/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
              
        String nombreProyecto1;
        String nombreProyecto2;
        String nombreProyecto3;
        double gastoMensualProyecto1;
        double gastoMensualProyecto2;
        double gastoMensualProyecto3;
        double gastoMensual;

        System.out.println("Ingrese nombre de Proyecto 1");
        nombreProyecto1 = entrada.nextLine();
        System.out.println("Ingrese nombre de Proyecto 2");
        nombreProyecto2 = entrada.nextLine();
        System.out.println("Ingrese nombre de Proyecto 3");
        nombreProyecto3 = entrada.nextLine();

        System.out.println("Ingrese Gasto Mensual del Proyecto 1");
        gastoMensualProyecto1 = entrada.nextDouble();
        System.out.println("Ingrese Gasto Mensual del Proyecto 2");
        gastoMensualProyecto2 = entrada.nextDouble();
        System.out.println("Ingrese Gasto Mensual del Proyecto 3");
        gastoMensualProyecto3 = entrada.nextDouble();

        gastoMensual = gastoMensualProyecto1 + gastoMensualProyecto2
                + gastoMensualProyecto3;

        System.out.printf("CONTROL DE GASTOS DE PROYECTOS\nProyectos:\n------\n"
                + "1. %s: $%2f\n------\n2.%S: $%2f\n------\n3.%s: $%2f\n------\n"
                + "GASTO MENSUAL TOTAL: $%.2f\n",
                 nombreProyecto1,
                 gastoMensualProyecto1,
                 nombreProyecto2, 
                 gastoMensualProyecto2,
                 nombreProyecto3,
                 gastoMensualProyecto3,
                 gastoMensual);

    }

}
