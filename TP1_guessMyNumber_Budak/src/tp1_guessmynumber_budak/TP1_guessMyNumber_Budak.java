/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_budak;

import java.util.Random;
import java.util.Scanner;

/**
 * TP1 guess my number de Budak
 * @author emirb
 */
public class TP1_guessMyNumber_Budak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random();
        Scanner sc = new Scanner(System.in);
        int n = generateurAleat.nextInt(100);
        System.out.println("Bonjour, Saissez une valeur entre 0 et 100 :" );
        int nb = sc.nextInt();
        
            while(nb != n){
                if (nb<n){
                    System.out.println ( "Il est trop petit" );
                } else {
                    System.out.println("Il est trop grand");
                }
                System.out.println("Essayez encore :");
            nb = sc.nextInt();
            
            }
            System.out.println ("Jackpot le numero mystere etait " + n );
    
}
    }


