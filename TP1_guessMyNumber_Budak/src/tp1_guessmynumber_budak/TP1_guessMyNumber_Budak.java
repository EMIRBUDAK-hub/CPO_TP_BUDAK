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
        int n = generateurAleat.nextInt(100); // nombre mystère
        int cptr = 0; // compteur de tentatives

        System.out.println("Choisissez un mode de difficulte :\n 1. Facile \n 2. Normal \n 3. Difficile \n 4. Cauchemar");
        int dif = sc.nextInt();

        

        if(dif==1){
            System.out.println("Bonjour, saisissez une valeur entre 0 et 100 :");
        int nb = sc.nextInt();
        cptr++; 
            while (nb != n) {
                if (Math.abs(nb - n) <= 10) {
                    System.out.println("Vous etes proche !");
                } else if (nb < n) {
                    System.out.println("Il est petit");
                } else {
                    System.out.println("Il est grand");
                }
                System.out.println("Essayez encore :");
                nb = sc.nextInt();
                cptr++;
            }
            System.out.println("Jackpot ! Le numero mystere etait " + n);
            System.out.println("Nombre de tentatives : " + cptr);

        } else if (dif == 2) {
            System.out.println("Bonjour, saisissez une valeur entre 0 et 100 :");
        int nb = sc.nextInt();
        cptr++; 
            while (nb != n) {
                if (nb < n) {
                    System.out.println("Il est petit");
                } else {
                    System.out.println("Il est grand");
                }
                System.out.println("Essayez encore :");
                nb = sc.nextInt();
                cptr++;
            }
            System.out.println("Jackpot ! Le numero mystere etait " + n);
            System.out.println("Nombre de tentatives : " + cptr);

        } else if (dif == 3) {
            System.out.println("Le nombre de tentatives a battre :");
            int ba = sc.nextInt();
            System.out.println("Bonjour, saisissez une valeur entre 0 et 100 :");
        int nb = sc.nextInt();
        cptr++; 
            while (nb != n) {
                if (nb < n) {
                    System.out.println("Il est petit");
                } else {
                    System.out.println("Il est grand");
                }
                System.out.println("Essayez encore :");
                nb = sc.nextInt();
                cptr++;
            }
            System.out.println("Jackpot ! Le numero mystere etait " + n);
            if (cptr > ba) {
                System.out.println("Vous n'avez pas reussi votre defi");
            } else {
                System.out.println("Vous avez reussi !");
            }

        } else if (dif == 4) { 
            System.out.println("Bonjour, saisissez une valeur entre 0 et 100 :");
        int nb = sc.nextInt();
        cptr++; 
         
            while (nb != n) {
                int chance = generateurAleat.nextInt(100);
                if (chance < 30) { 
                    if (nb < n) {
                        System.out.println("Il est grand"); 
                    } else {
                        System.out.println("Il est petit"); 
                    }
                } else { 
                    if (nb < n) {
                        System.out.println("Il est petit");
                    } else {
                        System.out.println("Il est grand");
                    }
                }
                System.out.println("Essayez encore :");
                nb = sc.nextInt();
                cptr++;
            }
            System.out.println("Jackpot ! Le numero mystere etait " + n);
            System.out.println("Nombre de tentatives : " + cptr);
        }
    }
}

