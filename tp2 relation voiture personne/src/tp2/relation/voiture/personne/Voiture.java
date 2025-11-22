/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.relation.voiture.personne;

/**
 *
 * @author emirb
 */
public class Voiture {
    // attributs
    private String modele;
    private String marque;
    private int nbPlaces;
    public Personne proprietaire; // public pour simplifier l'exercice (comme dans l'énoncé)

    // constructeur
    public Voiture(String modele, String marque, int nbPlaces) {
        this.modele = modele;
        this.marque = marque;
        this.nbPlaces = nbPlaces;
        this.proprietaire = null; // initialisé à null
    }

    // getters (optionnels)
    public String getModele() { return modele; }
    public String getMarque() { return marque; }
    public int getNbPlaces() { return nbPlaces; }

    // toString
    @Override
    public String toString() {
        String res = modele + " (" + marque + ", " + nbPlaces + " places)";
        if (proprietaire != null) {
            res += " - Propriétaire : " + proprietaire.getPrenom() + " " + proprietaire.getNom();
        } else {
            res += " - Propriétaire : (aucun)";
        }
        return res;
    }
}
