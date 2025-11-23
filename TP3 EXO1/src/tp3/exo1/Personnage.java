/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.exo1;

import java.util.ArrayList;

/**
 *
 * @author emirb
 */

public abstract class Personnage implements EtreVivant {
    protected String nom;
    protected int vie;

    protected ArrayList<Arme> inventaire = new ArrayList<>();
    protected Arme arme_en_main = null;

    public Personnage(String nom, int vie) {
        this.nom = nom;
        this.vie = vie;
    }

    public void ajouterArme(Arme a) {
        if (inventaire.size() < 5) inventaire.add(a);
    }

    public void equiper(String nomArme) {
        for (Arme a : inventaire) {
            if (a.getNom().equalsIgnoreCase(nomArme)) {
                arme_en_main = a;
                System.out.println(nom + " s’équipe de " + nomArme);
                return;
            }
        }
        System.out.println("Arme introuvable !");
    }

    @Override
    public String toString() {
        return nom + " (" + vie + " PV) — Arme en main : " +
                (arme_en_main == null ? "aucune" : arme_en_main.toString());
    }

    // Interface
    public void seFatiguer() {
        vie -= 10;
    }

    public boolean estVivant() {
        return vie > 0;
    }

    public void estAttaque(int points) {
        vie -= points;
    }

    public abstract void attaquer(Personnage p);
}
