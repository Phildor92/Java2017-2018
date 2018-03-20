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
public class Lezer extends Persoon{
    private int lidnr;
    private int saldo;
    
    public Lezer(String naam, int lidnr){
        super(naam);
        this.lidnr = lidnr;
    }

    public int getLidnr() {
        return lidnr;
    }

    public void setLidnr(int lidnr) {
        this.lidnr = lidnr;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    @Override
    public String toString(){
        return "Naam: " + this.getNaam() + " - lidnr: " + this.getLidnr() + " - saldo: " + this.getSaldo();
    }
}
