/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises6;

import java.util.*;

/**
 *
 * @author Philip Evans
 */
public class exer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        
        Voertuig v1 = new Voertuig("1-DKB-451", "Citroen");
        Voertuig v2 = new Voertuig("1-BEF-298", "Renault");
        Voertuig v3 = new Voertuig("1-ARE-027", "Opel");
        
        Voertuig[] voertuigArray = new Voertuig[]{v1,v2,v3};
        
        for (Voertuig v : voertuigArray){
            System.out.println(v.toString());
    }
        System.out.println("");
        List<Voertuig> voertuigLijst = new ArrayList<>();
        voertuigLijst.addAll(Arrays.asList(voertuigArray));
        
        //This for each...
        voertuigLijst.forEach((v) -> System.out.println(v.toString()));
        
        System.out.println("");
        
        //...is the same as this one:
        for(Voertuig v : voertuigLijst){
            System.out.println(v.toString());
        }
        
        System.out.println("");
        
        Collections.sort(voertuigLijst);
        
        voertuigLijst.forEach((v) -> System.out.println(v.toString()));
        
        Collections.sort(voertuigLijst, new SorteerderOpMerk());
    }
    
}
