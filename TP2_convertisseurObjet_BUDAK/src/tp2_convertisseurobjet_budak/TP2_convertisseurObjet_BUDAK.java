/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_budak;

import java.util.Scanner;

/**
 *TP2 DE BUDAK
 * @author emirb
 */
public class TP2_convertisseurObjet_BUDAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Convertisseur conv = new Convertisseur();
        Convertisseur conv1 = new Convertisseur();

        int nb;
        
        System.out.println("========CHOIX DE CONVERSSIONS========");
        System.out.println("1/ Celsius vers Kelvin");
        System.out.println("2/Kelvin vers Celsius");
        System.out.println("3/Farenheit vers Celsius");
        System.out.println("4/Celsius vers Farenheit");
        System.out.println("5/Farenheit vers Kelvin");
        System.out.println("6/ Kelvin vers Farenheit");
        
        nb=sc.nextInt();
        System.out.println("Quelle temperature?");
        double temperature = sc.nextDouble();
        
        double resultat;
        switch (nb) {
            case 1:
             resultat = conv.CelciusVersKelvin(temperature);
                System.out.println(temperature + " °C = " + resultat + " K");
                break;

            case 2:
             resultat = conv.KelvinVersCelcius(temperature);
                System.out.println(temperature + " K = " + resultat + " °C");
                break;
            case 3:
                resultat = conv.FarenheitVersCelcius(temperature);
                System.out.println(temperature +"F"+resultat+"C");
                break;
            case 4:
                resultat = conv.CelciusVersFarenheit(temperature);
                System.out.println(temperature+"C"+resultat+"F");
                break;
            case 5:
                resultat = conv.KelvinVersFarenheit(temperature);
                System.out.println(temperature+"K"+resultat+"F");
                break;
            case 6:
                resultat = conv.FarenheitVersKelvin(temperature);
                System.out.println(temperature+"F"+resultat+"K");
                break;
            default:
                break;
        }
    }
}
        
       
    
    

