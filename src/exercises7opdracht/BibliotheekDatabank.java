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
    private List<Publicatie> publicatieLijst = new ArrayList<>();
    private List<Lezer> lezerLijst = new ArrayList<>();
    private List<Ontlening> ontleningLijst = new ArrayList<>();

    /**
     *
     * @param aut
     */
    public void opslaan(Auteur aut) {
        try {
            Auteur tempAut = this.getAuteurByVolgNr(aut.getVolgnr());
            if (tempAut != null) {
                if (aut.getVolgnr() != tempAut.getVolgnr()) {
                    auteurLijst.add(aut);
                }
            } else {
                auteurLijst.add(aut);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage() + "something went wrong");
        }

    }

    /**
     *
     * @param pub
     */
    public void opslaan(Publicatie pub) {
        try {
            if (pub.getClass().equals(Boek.class)) {
                Boek newBoek = (Boek) pub;
                Boek tempBoek = this.getBoek(newBoek.getIsbn());
                if (tempBoek != null) {
                    if (newBoek.getIsbn() != tempBoek.getIsbn()) {
                        publicatieLijst.add(pub);
                    }
                } else {
                    publicatieLijst.add(pub);
                }
            } else {
                publicatieLijst.add(pub);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage() + "something went wrong");
        }
    }

    /**
     *
     * @param lez
     */
    public void opslaan(Lezer lez) {
        try {
            Lezer tempLez = this.getLezerByVolgNr(lez.getVolgnr());
            if (tempLez != null) {
                if (lez.getVolgnr() != tempLez.getVolgnr()) {
                    lezerLijst.add(lez);
                }
            } else {
                lezerLijst.add(lez);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage() + "something went wrong");
        }
    }

    /**
     *
     * @param ont
     */
    public void opslaan(Ontlening ont) {
        ontleningLijst.add(ont);
    }

    /**
     *
     */
    public void debugOutput() {
        System.out.println("Auteurs en licenties:");
        auteurLijst.forEach((a) -> System.out.println(a.getNaam() + " - " + a.getLicentie()));
        System.out.println("");
        System.out.println("Publicaties:");
        publicatieLijst.forEach((p) -> System.out.println(p.toString()));
        System.out.println("");
        System.out.println("Lezers + lidnr + saldo + volgnr:");
        lezerLijst.forEach((l) -> System.out.println(l.getNaam() + " - lidnr: " + l.getLidnr() + " - saldo:" + l.getSaldo() + " - volgnr: " + l.getVolgnr()));
        System.out.println("");
        System.out.println("Ontleners en publicaties:");
        ontleningLijst.forEach((o) -> System.out.println(o.getLezer().getNaam() + " - titel: " + o.getPublicatie().getTitel()));
    }

    /**
     *
     * @param lidNr
     * @return Lezer
     */
    public Lezer getLezerByLidNr(int lidNr) {
        for (Lezer l : lezerLijst) {
            if (l.getLidnr() == lidNr) {
                return l;
            }
        }
        return null;
    }

    /**
     *
     * @param volgNr
     * @return Lezer
     */
    public Lezer getLezerByVolgNr(int volgNr) {
        for (Lezer l : lezerLijst) {
            if (l.getVolgnr() == volgNr) {
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

    public Auteur getAuteurByVolgNr(int volgnr) {
        for (Auteur a : auteurLijst) {
            if (a.getVolgnr() == volgnr) {
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
        for (Ontlening o : ontleningLijst) {
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
        for (Ontlening o : ontleningLijst) {
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

        for (Ontlening o : ontleningLijst) {
            if (o.getLezer().equals(lezer)) {
                ontleningLijst.remove(o);
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
        for (Ontlening o : ontleningLijst) {
            if (o.getPublicatie().equals(pub)) {
                toBeRemoved = o;
            }
        }
        ontleningLijst.remove(toBeRemoved);
    }

    /**
     *
     * @param titel
     * @return Publicatie
     */
    public Publicatie getPublicatie(String titel) {
        for (Publicatie p : publicatieLijst) {
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
    public Publicatie getPublicatie(int pubnr) {
        for (Publicatie p : publicatieLijst) {
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
    public Boek getBoek(int isbn) {
        for (Publicatie p : publicatieLijst) {
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
    public void removePublicatie(String titel) {
        Publicatie toBeRemoved = null;
        for (Publicatie p : publicatieLijst) {
            if (p.getTitel().equals(titel)) {
                toBeRemoved = p;
            }
        }
        publicatieLijst.remove(toBeRemoved);
    }

    /**
     *
     * @param pubnr
     */
    public void removePublicatie(int pubnr) {
        Publicatie toBeRemoved = null;
        for (Publicatie p : publicatieLijst) {
            if (p.getPubnr() == pubnr) {
                toBeRemoved = p;
            }
        }
        publicatieLijst.remove(toBeRemoved);
    }

    /**
     *
     * @param isbn
     */
    public void removeBoek(int isbn) {
        Publicatie toBeRemoved = null;
        for (Publicatie p : publicatieLijst) {
            Boek b = (Boek) p;
            if (b.getIsbn() == isbn) {
                toBeRemoved = p;
            }
        }
        publicatieLijst.remove(toBeRemoved);
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
        ontleningLijst.remove(ontlening);
    }

    /**
     *
     * @param publicatie
     */
    public void remove(Publicatie publicatie) {
        publicatieLijst.remove(publicatie);
    }

    /**
     * Methode om publicatie uit te lenen. Als de publicatie al uitgeleend is,
     * of als de saldo van de lezer te hoog is, zal de uitlening niet mogelijk
     * zijn
     *
     * @param pub
     * @param lezer
     */
    public void pubUitlenen(Publicatie pub, Lezer lezer) {
        try {
            if (this.getOntlening(pub) == null) {
                if (lezer.getSaldo() < 5) {
                    ontleningLijst.add(new Ontlening(lezer, pub));
                    System.out.println("Publicatie " + pub.getTitel() + " succesvol uitgeleend door " + lezer.getNaam());
                } else {
                    System.out.println("De saldo op deze rekening is te hoog (" + lezer.getSaldo() + "). De saldo moet betaald worden vooraleer deze lezer nog boeken uit kan lenen");
                }
            } else {
                System.out.println("Deze publicatie is al reeds uitgeleend");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    /**
     * Methode om publicaties in te leveren. Als de leentermijn verstreken is,
     * komt er daar een melding van. Ook als de publicatie niet uitgeleend is.
     *
     * @param pub
     */
    public void pubInleveren(Publicatie pub) {
        try {
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
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Print een overzicht van alle publicaties
     */
    public void overzichtPublicaties() {
        for (Publicatie p : publicatieLijst) {
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
        for (Ontlening o : ontleningLijst) {
            System.out.println("Titel: " + o.getPublicatie().getTitel() + " - Uitlener: " + o.getLezer().getNaam() + " - Uitgeleend tot: " + o.getVervaldatumStr());
        }
    }

    /**
     * Print een overzicht van publicaties waarvan de leentermijn verstreken is
     */
    public void overzichtPublicatiesOverdatum() {
        for (Ontlening o : ontleningLijst) {
            if (o.getVervaldatum().compareTo(Calendar.getInstance()) < 0) {
                System.out.println("Titel: " + o.getPublicatie().getTitel() + " - Uitlener: " + o.getLezer().getNaam() + " - Uitgeleend tot: " + o.getVervaldatumStr());
            }
        }
    }

    /**
     * Geeft het aantal publicaties waarvan de leentermijn verstreken is als een
     * int terug.
     *
     * @return int
     */
    public int aantalPublicatiesOverdatum() {
        int aantal = 0;
        for (Ontlening o : ontleningLijst) {
            if (o.getVervaldatum().compareTo(Calendar.getInstance()) < 0) {
                aantal++;
            }
        }
        return aantal;
    }

    /**
     * Print een lijst van namen van lezers die een publicatie uit hebben
     * geleend waarvan de leentermijn verstreken is.
     */
    public void overzichtLezersMetPublicatiesOverdatum() {
        Set<Lezer> lezerSet = new HashSet<>();
        for (Ontlening o : ontleningLijst) {
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
            int positie = ontleningLijst.indexOf(this.getOntlening(pub));
            Ontlening editOnt = ontleningLijst.get(positie);
            ontleningLijst.remove(positie);
            if (lez != null) {
                editOnt.setLezer(lez);
            }
            if (isVerlenging) {
                editOnt.verlengen();
            }

            ontleningLijst.add(positie, editOnt);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * @param lez
     * @param newLez
     */
    public void lezerBewerken(Lezer lez, Lezer newLez) {
        try {
            //achterhalen van de positie van de oude lezer en setten van de juiste volgnr. Daarna wordt de oude lezer vervangen in de lijst
            int positie = lezerLijst.indexOf(lez);
            Lezer oldLezer = lezerLijst.get(positie);
            newLez.setVolgnr(oldLezer.getVolgnr());
            lezerLijst.set(positie, newLez);

            //vervangen van oude lezer in de ontleningslijst
            List<Ontlening> OntleningenVanLezer = this.getOntlening(lez);
            for (Ontlening o : OntleningenVanLezer) {
                o.setLezer(newLez);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Vind de auteurs van een boek, en geeft een array van Auteur objecten
     * terug
     *
     * @param b
     * @return Auteur[]
     */
    public Auteur[] vindAuteurs(Boek b) {
        try {
            int lengte = ((Boek) publicatieLijst.get(this.publicatieLijst.indexOf((Publicatie) b))).getAuteurs().length;
            Auteur[] auteurs = new Auteur[lengte];
            int[] auteursAlsInt = ((Boek) publicatieLijst.get(this.publicatieLijst.indexOf((Publicatie) b))).getAuteurs();
            for (int i = 0; i < lengte; i++) {
                auteurs[i] = this.getAuteurByVolgNr(auteursAlsInt[i]);
            }
            return auteurs;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    /**
     * Print een overzicht van boeken met daarbij vermeld de auteurs
     */
    public void printAuteursPerBoek() {
        try {
            for (Publicatie p : publicatieLijst) {
                if (p.getClass().equals(Boek.class)) {
                    Boek b = (Boek) p;
                    System.out.print("Titel: " + b.getTitel() + " - Auteurs: " + this.getAuteurByVolgNr(b.getAuteurs()[0]).getNaam());
                    for (int i = 1; i < b.getAuteurs().length; i++) {
                        System.out.print(" - " + this.getAuteurByVolgNr(b.getAuteurs()[i]).getNaam());
                    }
                    System.out.println("");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Vervangt een Auteur object met een nieuwe object, met dezelfde volgnr
     *
     * @param aut
     * @param newAut
     */
    public void auteurBewerken(Auteur aut, Auteur newAut) {
        try {
            //achterhalen van de positie van de oude auteur en setten van de juiste volgnr. Daarna wordt de oude auteur vervangen in de lijst
            int positie = auteurLijst.indexOf(aut);
            Auteur oldAuteur = auteurLijst.get(positie);
            newAut.setVolgnr(oldAuteur.getVolgnr());
            auteurLijst.set(positie, newAut);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * methode om alle lijsten leeg te maken
     */
    public void clearDB() {
        auteurLijst.clear();
        ontleningLijst.clear();
        publicatieLijst.clear();
        lezerLijst.clear();
        System.out.println("Database is nu leeg");
    }
}
