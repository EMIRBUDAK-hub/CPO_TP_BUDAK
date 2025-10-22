/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_addition;

import java.util.Scanner;

/**
 * exo 2 de budak emir
 * @author emirb
 */
public class TP0_addition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nb;
        int result;
        int ind;
        result=0;
        ind=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre un nombre:" );
        nb= sc.nextInt();
        while (ind<nb){
            result=result + ind;
            ind++;
            
        }
        System.out.println("La somme des "+nb+" entiers est :" +result);
    }
    
}
