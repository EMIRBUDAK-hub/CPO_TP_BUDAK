/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_budak;

/**
 *TP2 BIERS DE BUDAK EMIR
 * @author emirb
 */
public class TP2_Bieres_BUDAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des trolls",7.0,"Dubuisson") ;
    
            uneBiere.lireEtiquette();
    BouteilleBiere deuxBiere=new BouteilleBiere("Leffe",6.6,"Abbaye de Leffe");
    System.out.println(uneBiere) ;

            deuxBiere.lireEtiquette();
            
    boolean retour =uneBiere.Decapsuler();
    if(retour==false){
        System.out.println("Il y a un PB");
        
    }else{
        System.out.println(uneBiere);
    }
    
    
    
    }
    
}
