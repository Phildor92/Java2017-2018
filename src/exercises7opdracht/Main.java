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
public class Main {
    static BibliotheekDatabank db = new BibliotheekDatabank();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persoon.setStartVolgnr(3000);
        Publicatie.setStartPubNr(400);
        
        Auteur a1 = new Auteur("Martin Book", 21451);
        db.opslaan(a1);
        
        Auteur a2 = new Auteur("Tom Reid", 65874);
        db.opslaan(a2);
        
        Lezer l1 = new Lezer("Richard Pollack", 1245);
        db.opslaan(l1);
        
        Lezer l2 = new Lezer("David Dreyfus", 1356);
        db.opslaan(l2);
        
        Boek b1 = new Boek("Hier en Daar", 97834107);
        db.opslaan(b1);
        
        Boek b2 = new Boek("Tijd", 97831102);
        db.opslaan(b2);
        
        Boek b3 = new Boek("Running", 97831109);
        db.opslaan(b3);
        
        Tijdschrift t1 = new Tijdschrift("Science", 2);
        db.opslaan(t1);
        
        Ontlening o1 = new Ontlening(l1,b1);
        db.opslaan(o1);
        
        Ontlening o2 = new Ontlening(l2,t1);
        db.opslaan(o2);
        
        Ontlening o3 = new Ontlening(l1,b3);
        db.opslaan(o3);
        
        db.debugOutput();
        System.out.println("");
        db.ontleningBewerken(b1, l2, true);
        System.out.println("");
        db.overzichtUitgeleendePublicaties();
    }
}
