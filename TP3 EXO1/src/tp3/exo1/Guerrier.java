/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.exo1;

/**
 *
 * @author emirb
 */


public class Guerrier extends Personnage {
    private boolean cheval;

    public Guerrier(String nom, int vie, boolean cheval) {
        super(nom, vie);
        this.cheval = cheval;
    }

    @Override
    public void attaquer(Personnage p) {
        int degats = arme_en_main.getNiveauAttaque();

        if (arme_en_main instanceof Epee) {
            degats *= ((Epee) arme_en_main).getFinesse();
        }

        if (cheval) degats /= 2;

        p.estAttaque(degats);
        this.seFatiguer();
    }
}
