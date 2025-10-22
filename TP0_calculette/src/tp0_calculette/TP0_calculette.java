/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_calculette;

import java.util.Scanner;

/**
 * exo 3 tp0 de budak emir
 * @author emirb
 */
public class TP0_calculette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter the operator : \n1)add \n2)substrcat \n3)multiply \n4)divide \n5)modulo");
        
                
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre un nombre:" );
        int operator = sc.nextInt();
        System.out.println("Entre un nombre:" );
        int operande1 = sc.nextInt();
        
        System.out.println("Entre un nombre:" );
        int operande2 = sc.nextInt();
     
             
        if (operator < 1 || operator > 5) {
            System.out.println("Erreur : vous devez entrer un nombre entre 1 et 5.");
        } else { 
            
        
        
                
        if(operator==1){
            int S=operande1+operande2;
            System.out.println("The result is :" +S);
        
        }
        if(operator==2){
            int D=operande1-operande2;
            System.out.println("The result is : " +D);
            
        }
        if(operator==3){
            int M=operande1*operande2;
            System.out.println("The result isd : " +M);
        }
        
        if(operator==4){
            float DIV=operande1/operande2;
            if(operande2==0){
                System.out.println("Change");
               
            }
            System.out.println("The result is : " +DIV);
            
                    
        }
        
        if (operator==5){
            int modu=operande1%operande2;
            if(operande2==0){
                System.out.println("Change");
               
            }
            System.out.println("The result is : " +modu);
                    
        }
    }
    }
    
}
