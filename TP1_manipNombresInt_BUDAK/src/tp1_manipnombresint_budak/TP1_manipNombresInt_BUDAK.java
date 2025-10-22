/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_budak;

import java.util.Scanner;

/**
 *TP1 de BUDAK EMIR
 * @author emirb
 */
public class TP1_manipNombresInt_BUDAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Entre un premier nombre:" );
        int nb1 = sc.nextInt();  
        System.out.println("Entre un deuxieme nombre:" );
        int nb2= sc.nextInt();
        
            
            int S=nb1+nb2;
            System.out.println("LA SOMME EST :" + S);
        
            int D=nb1-nb2;
            System.out.println("LA SOUSTRACTION EST : " + D);
      
            int M=nb1*nb2;
            System.out.println("LE PRODUIT EST : " + M);
            
            int DIV=nb1/nb2;
            System.out.println("LA DIVISION VAUT " + DIV);
            
            int reste=nb1%nb2;
            System.out.println("LE RESTE VAUT " + reste);
            
            
        
    }
    }

    

