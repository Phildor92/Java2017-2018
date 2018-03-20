/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise5;

/**
 *
 * @author Philip Evans
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bediende jef = new Bediende(234, "Piet Precies", "Boekhouding");
        jef.setRegime(80);
        jef.setLoon(1500);
        
        Arbeider pol = new Arbeider(875, "Linda Pluis", "Verpakking");
        pol.setWerkuren(40);
        
        Werknemer pol2 = new Arbeider(875, "Linda Pluis", "Verpakking");
        
        System.out.println(jef.getInfo());
        System.out.println(pol.getInfo());
        System.out.println(pol2.getInfo());
        
        
        LoonBonVerwerking verwerk1 = new LoonBonVerwerking(234);
        System.out.println("");
        System.out.println(verwerk1.getLoonbon(jef));
        System.out.println("");
        System.out.println(verwerk1.getLoonbon(pol));
    }
    
}
