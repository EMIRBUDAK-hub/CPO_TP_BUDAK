package tp2_convertisseurobjet_budak;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emirb
 */

        public class Convertisseur {

   
    int nbConversions;

    
    public Convertisseur() {
        nbConversions = 0;
    }

   
    public double CelciusVersKelvin(double tCelcius) {
        nbConversions++;
        return tCelcius + 273.15f;
    }

  
    public double KelvinVersCelcius(double tKelvin) {
        nbConversions++;
        return tKelvin - 273.15f;
    }


    public double FarenheitVersCelcius(double tFarenheit) {
        nbConversions++;
        return (tFarenheit - 32) * 5 / 9f;
    }

   
    public double CelciusVersFarenheit(double tCelcius) {
        nbConversions++;
        return (tCelcius * 9 / 5f) + 32;
    }


    public double FarenheitVersKelvin(double tFarenheit) {
        nbConversions++;
        return CelciusVersKelvin(FarenheitVersCelcius(tFarenheit));
    }

    
    public double KelvinVersFarenheit(double tKelvin) {
        nbConversions++;
        return CelciusVersFarenheit(KelvinVersCelcius(tKelvin));
    }

    @Override
    public String toString() {
        return "nb de conversions = " + nbConversions;
    }
}
           

