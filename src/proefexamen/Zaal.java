/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proefexamen;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Philip Evans
 */
public class Zaal {
    private int zaalnr, capaciteit;
    private int bezet = 0;
    private String film;
    
    public Zaal(int zaalnr, int capaciteit, String film){
        this.zaalnr = zaalnr;
        this.capaciteit = capaciteit;
        this.film = film;
    }
    
    public double getBezetting(){
        return bezet / (double)capaciteit;
    }
    
    public int getVrij(){
        return capaciteit - bezet;
    }
    
    public void reserveer(int aantal){
        bezet+=aantal;
    }
    
    public int getZaalnr(){
        return zaalnr;
    }

    public int getCapaciteit() {
        return capaciteit;
    }

    public void setCapaciteit(int capaciteit) {
        this.capaciteit = capaciteit;
    }

    public int getBezet() {
        return bezet;
    }

    public void setBezet(int bezet) {
        this.bezet = bezet;
    }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }
    
    
    
    public int grafiek(Graphics g, int x, int y, int h, int w, int base){
        g.setColor(Color.GREEN);
        g.fillRect(x, y, w, h);
        
        g.setColor(Color.ORANGE);
        g.fillRect(x, y, (int)(w * this.getBezetting()), h);
        
        g.setColor(Color.BLACK);
        g.drawString(zaalnr + ": " + film, x, base);
        
        g.drawString("vrij: " + this.getVrij(), w+x, base);
        
        return 0;
    }
}
