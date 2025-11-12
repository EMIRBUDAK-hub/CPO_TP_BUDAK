/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.exo1;

/**
 *Armes
 * @author emirb
 */
public abstract class Armes {
    int niveaudattaque;
    String nom;
        
    public Armes (int niveaudattaque, String nom) {
        if(niveaudattaque>100)
            niveaudattaque=100;
            
        this.niveaudattaque = niveaudattaque;
        this.nom = nom;
    System.out.println("Le nom de L'arme est : " + nom);
    System.out.println("La puissance de l'arme est de :" + niveaudattaque);   
        
         
    }


    @Override
    public String toString() {
        return nom +" " + niveaudattaque; 
    }
    
    
}
