/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Toshiba
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombreCliente;
        double netflix;
        double youtube;
        double dropbox;
        double spotify;
        double descuentoNetflix;
        double descuentoYoutube;
        double descuentoDropbox;
        double descuentoSpotify;
        double precioNetflix;
        double precioYoutube;
        double precioDropbox;
        double precioSpotify;
        double totalSinDescuento;
        double ahorroTotal;
        double totalPagar;

        System.out.println("Ingrese el nombre del cliente:");
        nombreCliente = entrada.nextLine();

        System.out.println("Ingrese el precio mensual de Netflix:");
        netflix = entrada.nextDouble();

        System.out.println("Ingrese el precio mensual de YouTube Premium:");
        youtube = entrada.nextDouble();

        System.out.println("Ingrese el precio mensual de Dropbox:");
        dropbox = entrada.nextDouble();

        System.out.println("Ingrese el precio mensual de Spotify:");
        spotify = entrada.nextDouble();

        descuentoNetflix = netflix * 0.23;
        descuentoYoutube = youtube * 0.23;
        descuentoDropbox = dropbox * 0.45;
        descuentoSpotify = spotify * 0;

        precioNetflix = netflix - descuentoNetflix;
        precioYoutube = youtube - descuentoYoutube;
        precioDropbox = dropbox - descuentoDropbox;
        precioSpotify = spotify - descuentoSpotify;

        totalSinDescuento = netflix + youtube + dropbox + spotify;

        ahorroTotal = descuentoNetflix + descuentoYoutube
                + descuentoDropbox + descuentoSpotify;

        totalPagar = precioNetflix + precioYoutube
                + precioDropbox + precioSpotify;

        System.out.printf("--------------------------------\n"
                + "REPORTE DE SERVICIOS DIGITALES\n"
                + "----------------------------------------\n"
                + "Nombre del cliente: %s\n"
                + "Netflix: $%.2f\n"
                + "Descuento (23%%): $%.2f\n"
                + "Precio final: $%.2f\n"
                + "----------------------------------------\n"
                + "YouTube Premium: $%.2f\n"
                + "Descuento (23%%): $%.2f\n"
                + "Precio final: $%.2f\n"
                + "----------------------------------------\n"
                + "Dropbox: $%.2f\n"
                + "Descuento (45%%): $%.2f\n"
                + "Precio final: $%.2f\n"
                + "----------------------------------------\n"
                + "Spotify: $%.2f\n"
                + "Descuento (0%%): $%.2f\n"
                + "Precio final: $%.2f\n"
                + "========================================\n"
                + "Total sin descuentos: $%.2f\n"
                + "Ahorro mensual total: $%.2f\n"
                + "TOTAL A PAGAR: $%.2f\n"
                + "========================================\n",
                nombreCliente,
                netflix, descuentoNetflix, precioNetflix,
                youtube, descuentoYoutube, precioYoutube,
                dropbox, descuentoDropbox, precioDropbox,
                spotify, descuentoSpotify, precioSpotify,
                totalSinDescuento,
                ahorroTotal,
                totalPagar);

    }

}
