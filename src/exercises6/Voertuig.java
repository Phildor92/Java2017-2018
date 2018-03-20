/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises6;

/**
 *
 * @author Philip Evans
 */
public class Voertuig implements Comparable {
    String nrplaat, merk, type, motor;
    
    public Voertuig(String nrplaat, String merk){
        this.nrplaat = nrplaat;
        this.merk = merk;
        this.type = "?";
        this.motor = "?";
    }
    
    @Override
    public String toString(){
        return nrplaat + "(" + merk + ")";
    }

    @Override
    public int compareTo(Object o) {
         if(o instanceof Voertuig)
    {
        Voertuig v = (Voertuig)o;
        return (this.nrplaat.compareToIgnoreCase(v.nrplaat));
    }
    else
        return -1;
    }
}
