/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_budak;

import java.util.Scanner;

/**
 *TP1 DE L'EXO 2
 * @author emirb
 */
public class TP1_convertisseur_BUDAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bonjour, Saissez une valeur :" );
        double temp = sc.nextDouble();
        System.out.println("Saisissez la conversion que vous souhaiter effectuer : ");
        int nb = sc.nextInt();
        
        if (nb==1);
        double tf= CelsiusVersKelvin(temp);
        System.out.println(temp + " degres Celsius est egale a " + tf + "kelvin");
        
        if (nb==2);
        double tf1= KelvinVersCelsius(temp); 
        System.out.println(temp + "Kelvin est egal a " + tf1 + "degres Celsius");
        
        if (nb==3);
        double tf2=FarenheitVersCelsius(temp);
        System.out.println(temp + "farenheit est egale a " + tf + "degres Celsius");
        
        if (nb==4);
        double tf3=CelsiusVersFarenheit(temp);
        System.out.println(temp + "degres celsius est egale a " + tf3 + "Farenheit");
        
        if (nb==5);
        double tf4=KelvinVersFarenheit(temp);
        System.out.print
                
        
        
        
            
        
        double tempK = CelsiusVersKelvin(temp);  // appel de la fonction
        System.out.println("La temperature en Kelvin vaut : " + tempK);
        
    }
    public static double CelsiusVersKelvin(double tCelsius) {
    double kelvin = tCelsius + 273.00;  
    return kelvin; 
    }
    
    public static double KelvinVersCelsius(double tKelvin){
    double tCelsius = tKelvin -273.00;
    return tCelsius;   
    }
    
    public static double FarenheitVersCelsius(double tFarenheit){
    double tCelsius = (tFarenheit-32.00)*(5/9);
    return tCelsius;
    }
    
    public static double CelsiusVersFarenheit(double tCelsius){
    double tFarenheit = tCelsius*(9/5) + 32.00;
    return tFarenheit;
    }
    
    public static double KelvinVersFarenheit(double tKelvin){
    double tFarenheit = (tKelvin-273.00)*(9/5) + 32.00;
    return tFarenheit;   
    }
    
    public static double FarenheitVersKelvin(double tFarenheit){
    double tKelvin = (tFarenheit-32.00)*(5/9)+273.00;
    return tKelvin; 
    }
}
