/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_sats_budak;

import java.util.Random;
import java.util.Scanner;

/**
 * TP1 SUR SATS
 * @author emirb
 */
public class TP1_sats_BUDAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] tab = new int[6];
         Scanner sc = new Scanner(System.in);
         System.out.println("Choisit n nombre entiers");
         int m=sc.nextInt();
         
         for (int i=0; i<=m;i++){
          Random generateurAleat = new Random();   
          int n = generateurAleat.nextInt(5);  
          if (n==i){
            tab[i]+=1;  
          }
         }
         for (int a=0; a<=tab.length;a++){
             System.out.println(tab[a]);
         }
    }
    
}
