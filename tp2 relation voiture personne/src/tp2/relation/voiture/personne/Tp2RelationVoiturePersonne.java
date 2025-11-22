/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2.relation.voiture.personne;

/**
 *
 * @author emirb
 */
public class Tp2RelationVoiturePersonne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // création des voitures (lignes fournies dans l'énoncé)
        Voiture uneClio = new Voiture("Clio", "Renault", 5);
        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5);
        Voiture une2008 = new Voiture("2008", "Peugeot", 6);
        Voiture uneMicra = new Voiture("Micra", "Nissan", 4);

        // création des personnes
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");

        // affichage des voitures disponibles
        System.out.println("liste des voitures disponibles :");
        System.out.println(uneClio);
        System.out.println(uneAutreClio);
        System.out.println(une2008);
        System.out.println(uneMicra);
        System.out.println("------------------------------------------------");

        // 8. établir des relations (exemples)
        // Bob possède uneClio et uneAutreClio
        bob.ajouter_voiture(uneClio);
        bob.ajouter_voiture(uneAutreClio);

        // Reno possède une2008 et uneMicra
        reno.ajouter_voiture(une2008);
        reno.ajouter_voiture(uneMicra);

        // affichage des informations
        System.out.println("Etat des personnes après attribution des voitures :");
        System.out.println(bob);
        System.out.println("------------------------------------------------");
        System.out.println(reno);
        System.out.println("------------------------------------------------");

        // test d'intégrité : essayer d'ajouter une voiture déjà possédée
        boolean ok = reno.ajouter_voiture(uneClio); // uneClio appartient déjà à bob -> doit échouer
        System.out.println("Tentative d'ajout d'uneClio à Reno (doit être false) : " + ok);

        // test limite : ajouter une 4ème voiture à Bob (doit échouer si >3)
        Voiture voitureSupplement = new Voiture("308", "Peugeot", 5);
        bob.ajouter_voiture(voitureSupplement); // 3ème voiture -> ok
        Voiture voitureQuatrieme = new Voiture("A1", "Audi", 4);
        boolean ok2 = bob.ajouter_voiture(voitureQuatrieme); // 4ème -> doit échouer
        System.out.println("Ajout de la 4ème voiture à Bob (doit être false) : " + ok2);
    }
    
}
