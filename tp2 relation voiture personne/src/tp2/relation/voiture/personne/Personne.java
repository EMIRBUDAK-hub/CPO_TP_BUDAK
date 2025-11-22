/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.relation.voiture.personne;

/**
 *
 * @author emirb
 */
public class Personne {
    // attributs
    private String prenom;
    private String nom;
    public int nbVoitures;
    public Voiture[] liste_voitures;

    // constructeur
    public Personne(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
        this.nbVoitures = 0;
        this.liste_voitures = new Voiture[3]; // capacité 3 comme demandé
    }

    // getters (utilisés dans Voiture.toString)
    public String getPrenom() { return prenom; }
    public String getNom() { return nom; }

    // méthode pour ajouter une voiture à la personne
    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {
        if (voiture_a_ajouter == null) return false;
        // 1) si la voiture a déjà un propriétaire -> échec
        if (voiture_a_ajouter.proprietaire != null) {
            System.out.println("Erreur : la voiture a déjà un propriétaire.");
            return false;
        }
        // 2) si la personne a déjà 3 voitures -> échec
        if (nbVoitures >= liste_voitures.length) {
            System.out.println("Erreur : capacité maximale de voitures atteinte pour " + prenom + " " + nom);
            return false;
        }
        // 3) ajout possible : placer à l'indice nbVoitures
        liste_voitures[nbVoitures] = voiture_a_ajouter;
        nbVoitures++;
        // 4) dire à la voiture que son propriétaire est this
        voiture_a_ajouter.proprietaire = this;
        return true;
    }

    @Override
    public String toString() {
        String s = prenom + " " + nom + " - nbVoitures = " + nbVoitures;
        if (nbVoitures > 0) {
            s += " | véhicules :";
            for (int i = 0; i < nbVoitures; i++) {
                s += "\n  - " + liste_voitures[i];
            }
        }
        return s;
    }
}
