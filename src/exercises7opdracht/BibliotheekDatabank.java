/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises7opdracht;

import java.util.*;

/**
 * TODO add ontlening with due date (and automatic saldo calculation) or add manual saldo increment
 * TODO add 
 * @author Philip Evans
 */
public class BibliotheekDatabank {
    List<Auteur> auteurLijst = new ArrayList<>();
    List<Publicatie> publicaties = new ArrayList<>();
    List<Lezer> lezerLijst = new ArrayList<>();
    List<Ontlening> ontleningsLijst = new ArrayList<>();
    
    /**
     * method to fill Auteur table
     * @param aut 
     */
    public void opslaan(Auteur aut){
        auteurLijst.add(aut);
    }
    
    /**
     * method to fill Publicatie table (with Boek or Tijdschrift objects)
     * @param pub
     */
    public void opslaan(Publicatie pub){
        publicaties.add(pub);
    }
    
    /**
     * method to fill Lezer table
     * @param lez 
     */
    public void opslaan(Lezer lez){
        lezerLijst.add(lez);
    }
    
    /**
     * method to fill Ontlening table
     * @param ont 
     */
    public void opslaan(Ontlening ont){
        ontleningsLijst.add(ont);
    }
    
    /**
     * temporary debug method to show contents of all tables
     */
    public void debugOutput(){
        System.out.println("Auteurs en licenties:");
        auteurLijst.forEach((a) -> System.out.println(a.getNaam() + " - " + a.getLicentie()));
        System.out.println("");
        System.out.println("Publicaties:");
        publicaties.forEach((p) -> System.out.println(p.toString()));
        System.out.println("");
        System.out.println("Lezers + lidnr + saldo:");
        lezerLijst.forEach((l) -> System.out.println(l.getNaam() + " - lidnr: " + l.getLidnr() + " - saldo:" + l.getSaldo()));
        System.out.println("");
        System.out.println("Ontleners en publicaties:");
        ontleningsLijst.forEach((o) -> System.out.println(o.getLezer().getNaam() + " - titel: " + o.getPublicatie().getTitel()));
    }
    
    /**
     * 
     * @param nr
     * @return Lezer
     */
    public Lezer getLezerByLidNr(int nr){
        for(Lezer l : lezerLijst){
            if(l.getLidnr() == nr){
                return l;
            }
        }
        return null;
    }
    
    /**
     * 
     * @param lidNr 
     */
    public void removeLezerByLidNr(int lidNr){
        for(Lezer l : lezerLijst){
            if(l.getLidnr() == lidNr){
                lezerLijst.remove(l);
            }
        }
    }
    
    /**
     * 
     * @param volgNr 
     */
    public void removeLezerByVolgnr(int volgNr){
        for(Persoon l : lezerLijst){
            if(l.getVolgnr() == volgNr){
                lezerLijst.remove((Lezer)l);
            }
        }
    }
    
    /**
     * 
     * @param licentie
     * @return Auteur
     */
    public Auteur getAuteurByLicentie(int licentie){
        for(Auteur a : auteurLijst){
            if(a.getLicentie() == licentie){
                return a;
            }
        }
        return null;
    }
    
    /**
     * 
     * @param licentie 
     */
    public void removeAuteurByLicentie(int licentie){
        for(Auteur a : auteurLijst){
            if(a.getLicentie() == licentie){
                auteurLijst.remove(a);
            }
        }
    }
    
    /**
     * 
     * @param volgnr 
     */
    public void removeAuteurByVolgnr(int volgnr){
        for(Persoon a : auteurLijst){
            if(a.getVolgnr() == volgnr){
                auteurLijst.remove((Auteur)a);
            }
        }
    }
    
    /**
     * TODO Should be modified to return a List<Ontlening> instead of a single Ontlening, as lezers may have multiple ontleningen
     * @param lezer
     * @return Ontlening
     */
    public Ontlening getOntlening(Lezer lezer){
        for(Ontlening o : ontleningsLijst){
            if(o.getLezer().equals(lezer)){
                //is this correct?
                return o;
            }
        }
        return null;
    }
    
    /**
     * 
     * @param pub
     * @return Ontlening
     */
    public Ontlening getOntlening(Publicatie pub){
        for(Ontlening o : ontleningsLijst){
            if(o.getPublicatie().equals(pub)){
                return o;
            }
        }
        return null;
    }
    
    /**
     * @deprecated 
     * lezers may have multiple ontleningen
     * @param lezer
    */
    @Deprecated
    public void removeOntlening(Lezer lezer){
        for(Ontlening o : ontleningsLijst){
            if(o.getLezer().equals(lezer)){
                ontleningsLijst.remove(o);
            }
        }
    }
    
    /**
     * Should still be valid, as long as the boek and tijdschrift lists do not contain duplicates
     * @param pub 
     */
    public void removeOntlening(Publicatie pub){
        for(Ontlening o : ontleningsLijst){
            if(o.getPublicatie().equals(pub)){
                ontleningsLijst.remove(o);
            }
        }
    }
    
    /**
     * Should be fine as long as no two Publicaties have the same title. Could be replaced by list?
     * TODO replace
     * @param titel
     * @return Publicatie
     */
    public Publicatie getPublicatieByTitel(String titel){
        for(Publicatie p : publicaties){
            if(p.getTitel().equals(titel)){
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
    public Publicatie getPublicatieByPubNr(int pubnr){
        for(Publicatie p : publicaties){
            if(p.getPubnr() == pubnr){
                return p;
            }
        }
        return null;
    }
    
    /**
     * Returns book based on isbn from Publicatie list
     * @param isbn
     * @return Boek
     */
    public Publicatie getBoekByIsbn(int isbn){
        for(Publicatie p : publicaties){
            Boek b = (Boek) p;
            if(b.getIsbn() == isbn){
                return b;
            }
        }
        return null;
    }
    
    /**
     * 
     * @param titel 
     */
    public void removePublicatieByTitel(String titel){
        for(Publicatie p : publicaties){
            if(p.getTitel().equals(titel)){
                publicaties.remove(p);
            }
        }
    }
    
    /**
     * 
     * @param pubnr 
     */
    public void removePublicatieByPubnr(int pubnr){
        for(Publicatie p : publicaties){
            if(p.getPubnr() == pubnr){
                publicaties.remove(p);
            }
        }
    }
    
    /**
     * 
     * @param isbn 
     */
    public void removeBoekByIsbn(int isbn){
        for(Publicatie p : publicaties){
            Boek b = (Boek) p;
            if(b.getIsbn() == isbn){
                publicaties.remove(b);
            }
        }
    }
    
    /**
     * 
     * @param lezer 
     */
    public void remove(Lezer lezer){
        lezerLijst.remove(lezer);
    }
    
    /**
     * 
     * @param auteur 
     */
    public void remove(Auteur auteur){
        auteurLijst.remove(auteur);
    }
    
    /**
     * 
     * @param ontlening 
     */
    public void remove(Ontlening ontlening){
        ontleningsLijst.remove(ontlening);
    }
    
    /**
     * 
     * @param publicatie 
     */
    public void remove(Publicatie publicatie){
        publicaties.remove(publicatie);
    } 
}
