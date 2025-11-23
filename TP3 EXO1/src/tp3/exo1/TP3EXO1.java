/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3.exo1;

/**
 *tp3 ex1
 * @author emirb
 */
public class TP3EXO1 {

    /**
     * @param args the command line arguments
     */
   
      
    public static void main(String[] args) {

        Epee excalibur = new Epee("Excalibur", 7, 5);
        Baton chene = new Baton("Chêne", 4, 5);

        Guerrier conan = new Guerrier("Conan", 80, true);
        Magicien gandalf = new Magicien("Gandalf", 60, false);

        conan.ajouterArme(excalibur);
        conan.equiper("Excalibur");

        gandalf.ajouterArme(chene);
        gandalf.equiper("Chêne");

        conan.attaquer(gandalf);
        gandalf.attaquer(conan);

        System.out.println(conan);
        System.out.println(gandalf);
    }
}

    
    
