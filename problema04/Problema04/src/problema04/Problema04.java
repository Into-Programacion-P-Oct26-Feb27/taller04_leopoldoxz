/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Toshiba
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombreCliente;
        double cpu;
        double teclado;
        double raton;
        double pantalla;
        double costoBase;
        double costosOperacionales;
        double costoFinal;

        System.out.println("Ingrese el nombre del cliente:");
        nombreCliente = entrada.nextLine();

        System.out.println("Ingrese el costo de la CPU:");
        cpu = entrada.nextDouble();

        System.out.println("Ingrese el costo del teclado:");
        teclado = entrada.nextDouble();

        System.out.println("Ingrese el costo del raton:");
        raton = entrada.nextDouble();

        System.out.println("Ingrese el costo de la pantalla:");
        pantalla = entrada.nextDouble();

        costoBase = cpu + teclado + raton + pantalla;

        costosOperacionales = costoBase * 0.15;

        costoFinal = costoBase + costosOperacionales;

        System.out.printf("========================================\n"
                + "REPORTE DE ENSAMBLAJE\n"
                + "========================================\n"
                + "Nombre del cliente: %s\n"
                + "Valores iniciales:\n"
                + "CPU: $%.2f\n"
                + "Teclado: $%.2f\n"
                + "Raton: $%.2f\n"
                + "Pantalla: $%.2f\n"
                + "========================================\n"
                + "Costo base: $%.2f\n"
                + "Costo adicional del 15%%: $%.2f\n"
                + "Costo final: $%.2f\n"
                + "========================================\n",
                nombreCliente,
                cpu,
                teclado,
                raton,
                pantalla,
                costoBase,
                costosOperacionales,
                costoFinal);

    }

}
