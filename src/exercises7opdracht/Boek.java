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
public class Boek extends Publicatie {
    private int isbn;
    private int[] auteurs;
    
    public Boek(String titel, int nr, int[] auteurs) {
        super(titel);
        this.isbn = nr;
        this.auteurs = auteurs;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int[] getAuteurs() {
        return auteurs;
    }

    public void setAuteurs(int[] auteurs) {
        this.auteurs = auteurs;
    }
    
    @Override
    public String toString(){   
        return this.getTitel() + " - ISBN:" + this.getIsbn();
    }
}
