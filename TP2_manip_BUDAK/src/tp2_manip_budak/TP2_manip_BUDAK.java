/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_budak;

/**
 *
 * @author emirb
 */
public class TP2_manip_BUDAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Tartiflette assiette1 = new Tartiflette(500) ;
      Tartiflette assiette2 = new Tartiflette(600) ;
      Tartiflette assiette3 = assiette2 ;
      assiette2 = assiette1 ;
      
      System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalorie) ;
      System.out.println("nb de calories de Assiette 3 : " +assiette3.nbCalorie) ;
      
        Moussaka[] tabMoussaka = new Moussaka[10];

        for (int i = 0; i < tabMoussaka.length; i++) {
            tabMoussaka[i] = new Moussaka(500 + i * 50); // exemple : calories différentes
        }

        for (int i = 0; i < tabMoussaka.length; i++) {
            System.out.println("Moussaka " + i + " : " + tabMoussaka[i].nbCalorie + " calories");
        }
    }
    
}
