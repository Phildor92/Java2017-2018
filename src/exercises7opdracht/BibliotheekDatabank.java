/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises7opdracht;

import java.util.*;

/**
 *
 * TODO add
 *
 * @author Philip Evans
 */
public class BibliotheekDatabank {

    private List<Auteur> auteurLijst = new ArrayList<>();
    private List<Publicatie> publicaties = new ArrayList<>();
    private List<Lezer> lezerLijst = new ArrayList<>();
    private List<Ontlening> ontleningsLijst = new ArrayList<>();

    /**
     *
     * @param aut
     */
    public void opslaan(Auteur aut) {
        auteurLijst.add(aut);
    }

    /**
     *
     * @param pub
     */
    public void opslaan(Publicatie pub) {
        publicaties.add(pub);
    }

    /**
     *
     * @param lez
     */
    public void opslaan(Lezer lez) {
        lezerLijst.add(lez);
    }

    /**
     *
     * @param ont
     */
    public void opslaan(Ontlening ont) {
        ontleningsLijst.add(ont);
    }

    /**
     *
     */
    public void debugOutput() {
        System.out.println("Auteurs en licenties:");
        auteurLijst.forEach((a) -> System.out.println(a.getNaam() + " - " + a.getLicentie()));
        System.out.println("");
        System.out.println("Publicaties:");
        publicaties.forEach((p) -> System.out.println(p.toString()));
        System.out.println("");
        System.out.println("Lezers + lidnr + saldo + volgnr:");
        lezerLijst.forEach((l) -> System.out.println(l.getNaam() + " - lidnr: " + l.getLidnr() + " - saldo:" + l.getSaldo() + " - volgnr: " + l.getVolgnr()));
        System.out.println("");
        System.out.println("Ontleners en publicaties:");
        ontleningsLijst.forEach((o) -> System.out.println(o.getLezer().getNaam() + " - titel: " + o.getPublicatie().getTitel()));
    }

    /**
     *
     * @param nr
     * @return Lezer
     */
    public Lezer getLezerByLidNr(int nr) {
        for (Lezer l : lezerLijst) {
            if (l.getLidnr() == nr) {
                return l;
            }
        }
        return null;
    }

    /**
     *
     * @param lidNr
     */
    public void removeLezerByLidNr(int lidNr) {
        Lezer toBeRemoved = null;
        for (Lezer l : lezerLijst) {
            if (l.getLidnr() == lidNr) {
                toBeRemoved = l;
            }
        }
        lezerLijst.remove(toBeRemoved);
    }

    /**
     *
     * @param volgNr
     */
    public void removeLezerByVolgnr(int volgNr) {
        Lezer toBeRemoved = null;
        for (Persoon l : lezerLijst) {
            if (l.getVolgnr() == volgNr) {
                toBeRemoved = (Lezer) l;
            }
        }

        lezerLijst.remove(toBeRemoved);
    }

    /**
     *
     * @param licentie
     * @return Auteur
     */
    public Auteur getAuteurByLicentie(int licentie) {
        for (Auteur a : auteurLijst) {
            if (a.getLicentie() == licentie) {
                return a;
            }
        }
        return null;
    }
    
    public Auteur getAuteurByVolgNr(int volgnr){
        for(Auteur a: auteurLijst){
            if(a.getVolgnr() == volgnr){
                return a;
            }
        }
        return null;
    }

    /**
     *
     * @param licentie
     */
    public void removeAuteurByLicentie(int licentie) {
        Auteur toBeRemoved = null;
        for (Auteur a : auteurLijst) {
            if (a.getLicentie() == licentie) {
                toBeRemoved = a;
            }
        }
        auteurLijst.remove(toBeRemoved);
    }

    /**
     *
     * @param volgnr
     */
    public void removeAuteurByVolgnr(int volgnr) {
        Auteur toBeRemoved = null;
        for (Persoon a : auteurLijst) {
            if (a.getVolgnr() == volgnr) {
                toBeRemoved = (Auteur) a;
            }
        }
        auteurLijst.remove(toBeRemoved);
    }

    /**
     *
     * @param lezer
     * @return Ontlening
     */
    public List<Ontlening> getOntlening(Lezer lezer) {
        List<Ontlening> ontleningenVanLezer = new ArrayList<>();
        for (Ontlening o : ontleningsLijst) {
            if (o.getLezer().equals(lezer)) {
                //is this correct?
                ontleningenVanLezer.add(o);
            }
        }
        if (!ontleningenVanLezer.isEmpty()) {
            return ontleningenVanLezer;
        } else {
            return null;
        }
    }

    /**
     *
     * @param pub
     * @return Ontlening
     */
    public Ontlening getOntlening(Publicatie pub) {
        for (Ontlening o : ontleningsLijst) {
            if (o.getPublicatie().equals(pub)) {
                return o;
            }
        }
        return null;
    }

    /**
     * @deprecated lezers kunnen meerdere publicaties uitlenen
     * @param lezer
     */
    @Deprecated
    public void removeOntlening(Lezer lezer) {

        for (Ontlening o : ontleningsLijst) {
            if (o.getLezer().equals(lezer)) {
                ontleningsLijst.remove(o);
            }
        }
    }

    /**
     * Dit kan alleen als publicaties uniek zijn
     *
     * @param pub
     */
    public void removeOntlening(Publicatie pub) {
        Ontlening toBeRemoved = null;
        for (Ontlening o : ontleningsLijst) {
            if (o.getPublicatie().equals(pub)) {
                toBeRemoved = o;
            }
        }
        ontleningsLijst.remove(toBeRemoved);
    }

    /**
     *
     * @param titel
     * @return Publicatie
     */
    public Publicatie getPublicatieByTitel(String titel) {
        for (Publicatie p : publicaties) {
            if (p.getTitel().equals(titel)) {
                return p;
            }
        }
        return null;
    }

    /**
     *
     * @param pubnr
     * @return Publicatie
     */
    public Publicatie getPublicatieByPubNr(int pubnr) {
        for (Publicatie p : publicaties) {
            if (p.getPubnr() == pubnr) {
                return p;
            }
        }
        return null;
    }

    /**
     *
     * @param isbn
     * @return Boek
     */
    public Publicatie getBoekByIsbn(int isbn) {
        for (Publicatie p : publicaties) {
            Boek b = (Boek) p;
            if (b.getIsbn() == isbn) {
                return b;
            }
        }
        return null;
    }

    /**
     *
     * @param titel
     */
    public void removePublicatieByTitel(String titel) {
        Publicatie toBeRemoved = null;
        for (Publicatie p : publicaties) {
            if (p.getTitel().equals(titel)) {
                toBeRemoved = p;
            }
        }
        publicaties.remove(toBeRemoved);
    }

    /**
     *
     * @param pubnr
     */
    public void removePublicatieByPubnr(int pubnr) {
        Publicatie toBeRemoved = null;
        for (Publicatie p : publicaties) {
            if (p.getPubnr() == pubnr) {
                toBeRemoved = p;
            }
        }
        publicaties.remove(toBeRemoved);
    }

    /**
     *
     * @param isbn
     */
    public void removeBoekByIsbn(int isbn) {
        Publicatie toBeRemoved = null;
        for (Publicatie p : publicaties) {
            Boek b = (Boek) p;
            if (b.getIsbn() == isbn) {
                toBeRemoved = p;
            }
        }
        publicaties.remove(toBeRemoved);
    }

    /**
     *
     * @param lezer
     */
    public void remove(Lezer lezer) {
        lezerLijst.remove(lezer);
    }

    /**
     *
     * @param auteur
     */
    public void remove(Auteur auteur) {
        auteurLijst.remove(auteur);
    }

    /**
     *
     * @param ontlening
     */
    public void remove(Ontlening ontlening) {
        ontleningsLijst.remove(ontlening);
    }

    /**
     *
     * @param publicatie
     */
    public void remove(Publicatie publicatie) {
        publicaties.remove(publicatie);
    }

    /**
     * Methode om publicatie uit te lenen. Als de publicatie al uitgeleend is, of als de saldo van de lezer te hoog is, zal de uitlening niet mogelijk zijn
     * 
     * @param pub
     * @param lezer
     */
    public void pubUitlenen(Publicatie pub, Lezer lezer) {
        try{
            if (this.getOntlening(pub) == null) {
            if (lezer.getSaldo() < 5) {
                ontleningsLijst.add(new Ontlening(lezer, pub));
                System.out.println("Publicatie " + pub.getTitel() + " succesvol uitgeleend door " + lezer.getNaam());
            } else {
                System.out.println("De saldo op deze rekening is te hoog (" + lezer.getSaldo() + "). De saldo moet betaald worden vooraleer deze lezer nog boeken uit kan lenen");
            }
        } else {
            System.out.println("Deze publicatie is al reeds uitgeleend");
        }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        

    }

    /**
     * Methode om publicaties in te leveren. Als de leentermijn verstreken is, komt er daar een melding van. Ook als de publicatie niet uitgeleend is.
     * 
     * @param pub
     */
    public void pubInleveren(Publicatie pub) {
        try{
            if (this.getOntlening(pub) != null) {
            Ontlening o = this.getOntlening(pub);
            if (o.getVervaldatum().compareTo(Calendar.getInstance()) < 0) {
                Lezer lNew = o.getLezer();
                int newSaldo = lNew.getSaldo();
                lNew.setSaldo(newSaldo + 1);
                lezerLijst.set(lezerLijst.indexOf(lNew), lNew);
                System.out.println("Deze publicatie is te laat. Saldo wordt met 1 Euro verhoogd. Vanaf 5 Euro kunt u geen publicaties meer uitlenen. Huidige saldo is: " + lNew.getSaldo());
            }
            System.out.println("Publicatie " + o.getPublicatie().getTitel() + " succesvol ingeleverd door " + o.getLezer().getNaam());
            this.removeOntlening(pub);
        } else {
            System.out.println("Deze publicatie is niet ontleend");
        }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        

    }

    /**
     * Print een overzicht van alle publicaties
     */
    public void overzichtPublicaties() {
        for (Publicatie p : publicaties) {
            System.out.print("Titel: " + p.getTitel() + " - PubNr: " + p.getPubnr());
            if (p.getClass() == (new Boek("", 0, new int[]{})).getClass()) {
                System.out.println(" - ISBN: " + ((Boek) p).getIsbn());
            } else {
                System.out.println(" - Frequentie: " + ((Tijdschrift) p).getFrequentie());
            }
        }
    }

    /**
     * Print een overzicht van alle lezers
     */
    public void overzichtLezers() {
        for (Lezer l : lezerLijst) {
            System.out.println("Naam: " + l.getNaam() + " - VolgNr: " + l.getVolgnr() + " - Saldo: " + l.getSaldo() + " - LidNr: " + l.getLidnr());
        }
    }

    /**
     * Print een overzicht van alle uitgeleende publicaties
     */
    public void overzichtUitgeleendePublicaties() {
        for (Ontlening o : ontleningsLijst) {
            System.out.println("Titel: " + o.getPublicatie().getTitel() + " - Uitlener: " + o.getLezer().getNaam() + " - Uitgeleend tot: " + o.getVervaldatumStr());
        }
    }

    /**
     * Print een overzicht van publicaties waarvan de leentermijn verstreken is
     */
    public void overzichtPublicatiesOverdatum() {
        for (Ontlening o : ontleningsLijst) {
            if (o.getVervaldatum().compareTo(Calendar.getInstance()) < 0) {
                System.out.println("Titel: " + o.getPublicatie().getTitel() + " - Uitlener: " + o.getLezer().getNaam() + " - Uitgeleend tot: " + o.getVervaldatumStr());
            }
        }
    }

    /**
     * Geeft het aantal publicaties waarvan de leentermijn verstreken is als een int terug.
     *
     * @return int
     */
    public int aantalPublicatiesOverdatum() {
        int aantal = 0;
        for (Ontlening o : ontleningsLijst) {
            if (o.getVervaldatum().compareTo(Calendar.getInstance()) < 0) {
                aantal++;
            }
        }
        return aantal;
    }

    /**
     * Print een lijst van namen van lezers die een publicatie uit hebben geleend waarvan de leentermijn verstreken is.
     */
    public void overzichtLezersMetPublicatiesOverdatum() {
        Set<Lezer> lezerSet = new HashSet<Lezer>();
        for (Ontlening o : ontleningsLijst) {
            if (o.getVervaldatum().compareTo(Calendar.getInstance()) < 0) {
                lezerSet.add(o.getLezer());
            }
        }
        for (Lezer l : lezerSet) {
            System.out.println(l.getNaam());
        }
    }

    /**
     * alleen de eerste parameter is verplicht
     *
     * @param pub
     * @param lez
     * @param isVerlenging
     */
    public void ontleningBewerken(Publicatie pub, Lezer lez, boolean isVerlenging) {
        try {
            int positie = ontleningsLijst.indexOf(this.getOntlening(pub));
            Ontlening editOnt = ontleningsLijst.get(positie);
            ontleningsLijst.remove(positie);
            if (lez != null) {
                editOnt.setLezer(lez);
            }
            if (isVerlenging) {
                editOnt.verlengen();
            }

            ontleningsLijst.add(positie, editOnt);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * @param lez
     * @param newLez
     */
    public void lezerBewerken(Lezer lez, Lezer newLez){
        try {
            
            int positie = lezerLijst.indexOf(lez);
            Lezer oldLezer = lezerLijst.get(positie);
            newLez.setVolgnr(oldLezer.getVolgnr());
            lezerLijst.remove(positie);
            lezerLijst.add(positie, newLez);
            List<Ontlening> OntleningenVanLezer = this.getOntlening(lez);
            for(Ontlening o : OntleningenVanLezer){
                o.setLezer(newLez);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * Vind de auteurs van een boek, en geeft een array van Auteur objecten terug
     * @param b
     * @return Auteur[]
     */
    public Auteur[] vindAuteurs(Boek b){
        try{
            int lengte = ((Boek) publicaties.get(this.publicaties.indexOf((Publicatie)b))).getAuteurs().length;
            Auteur[] auteurs = new Auteur[lengte];
            int[] auteursAlsInt = ((Boek) publicaties.get(this.publicaties.indexOf((Publicatie)b))).getAuteurs();
            for(int i = 0; i<lengte;i++){
                auteurs[i] = this.getAuteurByVolgNr(auteursAlsInt[i]);
            }
            return auteurs;
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    /**
     * Print een overzicht van boeken met daarbij vermeld de auteurs
     */
    public void printAuteursPerBoek(){
        try{
            for(Publicatie p : publicaties)
                if(p.getClass().equals(Boek.class)){
                    Boek b = (Boek) p;
                    System.out.print("Titel: "+ b.getTitel() + " - Auteurs: " + this.getAuteurByVolgNr(b.getAuteurs()[0]).getNaam());
                    for(int i = 1; i<b.getAuteurs().length;i++){
                        System.out.print(" - " + this.getAuteurByVolgNr(b.getAuteurs()[i]).getNaam());
                    }
                    System.out.println("");
                }
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
