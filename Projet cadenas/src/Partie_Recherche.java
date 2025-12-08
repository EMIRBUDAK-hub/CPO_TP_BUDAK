
import static java.lang.Math.random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emirb
 */
public class Partie_Recherche extends javax.swing.JFrame {
    
private int nbChiffres ;
private int nbtentatives ;
private int limites;
private boolean gagner ; 
private int[] combi;
int [] combicacher= new int [4];

    public int[] getCombi() {
        return combi;
    }

    public int[] getCombicacher() {
        
        return combicacher;
    }

    public void setCombi(int[] combi) {
        this.combi = combi;
    }

    public void setCombicacher(int[] combicacher) {
        this.combicacher = combicacher;
    }
    



    public Partie_Recherche(int nbChiffres, int limites) {
        this.nbChiffres = nbChiffres;
        this.limites = limites;
        //reset();
        cacher(); 
        
    }

    private void reset( int limites, int combi ){
        
        for (int i=0; i<10;i++ ){
            
        
    }
      
    }

    private void cacher (){
        for (int i=0; i<combicacher.length; i++){
            this. combicacher[i]=(int) (Math.random()*10); 
        }
    }
  
}

