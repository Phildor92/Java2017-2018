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
public class Ontlening {
    private Publicatie publicatie;
    private Lezer lezer;
    
    public Ontlening(Lezer wie, Publicatie wat){
        this.publicatie = wat;
        this.lezer = wie;
    }

    public Publicatie getPublicatie() {
        return publicatie;
    }

    public void setPublicatie(Publicatie publicatie) {
        this.publicatie = publicatie;
    }

    public Lezer getLezer() {
        return lezer;
    }

    public void setLezer(Lezer lezer) {
        this.lezer = lezer;
    }
    
}
