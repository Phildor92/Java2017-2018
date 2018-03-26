/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises7opdracht;

import java.util.Calendar;

/**
 *
 * @author Philip Evans
 */
public class Ontlening {
    private Publicatie publicatie;
    private Lezer lezer;
    private Calendar vervaldatum;
    
    public Ontlening(Lezer wie, Publicatie wat){
        this.publicatie = wat;
        this.lezer = wie;
        this.vervaldatum = Calendar.getInstance();
        this.vervaldatum.add(Calendar.MONTH, 1);
        //test output
        //System.out.println("DEBUG: " + vervaldatum.get(Calendar.DAY_OF_MONTH) + " " + (vervaldatum.get(Calendar.MONTH)+1) + " " + vervaldatum.get(Calendar.YEAR));
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

    public Calendar getVervaldatum() {
        return vervaldatum;
    }
    
    public String getVervaldatumStr(){
        return vervaldatum.get(Calendar.DAY_OF_MONTH) + "/" + (vervaldatum.get(Calendar.MONTH)+1) + "/" + vervaldatum.get(Calendar.YEAR);
    }

    public void setVervaldatum(Calendar vervaldatum) {
        this.vervaldatum = vervaldatum;
    }    
    
    public void verlengen(){
        this.vervaldatum.add(Calendar.DAY_OF_MONTH, 21);
    }
}
