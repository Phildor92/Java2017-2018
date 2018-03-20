/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises7opdracht;

/**
 *
 * @author Philip Evans
 */
public class Auteur extends Persoon {
    private int licentie;
    
    public Auteur(String naam, int licentie){
        super(naam);
        this.licentie = licentie;
    }

    public int getLicentie() {
        return licentie;
    }

    public void setLicentie(int licentie) {
        this.licentie = licentie;
    }
}
