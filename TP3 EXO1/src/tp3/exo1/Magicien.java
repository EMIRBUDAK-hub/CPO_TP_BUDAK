/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.exo1;

/**
 *
 * @author emirb
 */


public class Magicien extends Personnage {
    private boolean confirme;

    public Magicien(String nom, int vie, boolean confirme) {
        super(nom, vie);
        this.confirme = confirme;
    }

    @Override
    public void attaquer(Personnage p) {
        int degats = arme_en_main.getNiveauAttaque();

        if (arme_en_main instanceof Baton) {
            degats *= ((Baton) arme_en_main).getAge();
        }

        if (confirme) degats /= 2;

        p.estAttaque(degats);
        this.seFatiguer();
    }
}
