import java.util.ArrayList;
import java.util.List;
import static java.lang.Math.random;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emirb
 */
public class Partie_Recherche extends javax.swing.JFrame {
 
    private int[] combinaison;              // Combinaison secrète de 4 chiffres
    private List<int[]> historiqueEssais;   // Liste des tentatives effectuées
    private List<ResultatEssai> historiqueResultats; // Résultats associés

    public static final int TAILLE = 4;

    public Partie_Recherche () {
        historiqueEssais = new ArrayList<>();
        historiqueResultats = new ArrayList<>();
        nouvellePartie();
    }

    /**
     * Génère une nouvelle combinaison secrète et efface l'historique.
     */
    public void nouvellePartie() {
        combinaison = new int[TAILLE];
        Random r = new Random();

        for (int i = 0; i < TAILLE; i++) {
            combinaison[i] = r.nextInt(10); // chiffre entre 0 et 9
        }

        historiqueEssais.clear();
        historiqueResultats.clear();
    }

    /**
     * Vérifie une tentative passée par l'interface et renvoie un objet résultat.
     */
    public ResultatEssai verifierTentative(int[] tentative) {
        if (tentative.length != TAILLE)
            throw new IllegalArgumentException("La combinaison doit faire 4 chiffres.");

        int nbExact = 0;
        int nbTropHaut = 0;
        int nbTropBas = 0;

        for (int i = 0; i < TAILLE; i++) {
            if (tentative[i] == combinaison[i]) {
                nbExact++;
            } else if (tentative[i] > combinaison[i]) {
                nbTropHaut++;
            } else {
                nbTropBas++;
            }
        }

        ResultatEssai res = new ResultatEssai(nbExact, nbTropHaut, nbTropBas);

        // on mémorise l'essai
        historiqueEssais.add(tentative.clone());
        historiqueResultats.add(res);

        return res;
    }

    /**
     * Permet à la GUI d'afficher la combinaison (ex : pour écran de fin).
     */
    public int[] getCombinaison() {
        return combinaison.clone();
    }

    public List<int[]> getHistoriqueEssais() {
        return historiqueEssais;
    }

    public List<ResultatEssai> getHistoriqueResultats() {
        return historiqueResultats;
    }

    /**
     * Classe interne servant à stocker un résultat d'essai.
     */
    public static class ResultatEssai {
        public int nbExact;
        public int nbTropHaut;
        public int nbTropBas;

        public ResultatEssai(int exact, int haut, int bas) {
            this.nbExact = exact;
            this.nbTropHaut = haut;
            this.nbTropBas = bas;
        }
    }  
}

