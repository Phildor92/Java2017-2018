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
public class Persoon {
    private String naam;
    private static int huidigeVolgNr;
    private int volgnr;
    
    public Persoon(String naam){
        this.naam = naam;
        volgnr = huidigeVolgNr;
        huidigeVolgNr++;
    }
    
    public static void setStartVolgnr(int startNr){
        huidigeVolgNr = startNr;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getVolgnr() {
        return volgnr;
    }

    public  void setVolgnr(int volgnr) {
        this.volgnr = volgnr;
        huidigeVolgNr--;
    }
    
    
}
