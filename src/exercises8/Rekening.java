/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises8;

/**
 *
 * @author Philip Evans
 */
public class Rekening  {
    private double saldo;
    private String naam;
    private String rekeningnr;

    public Rekening(double bedrag, String naam, String rekeningnr) {
        this.saldo = bedrag;
        this.naam = naam;
        this.rekeningnr = rekeningnr;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double bedrag) {
        this.saldo = bedrag;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getRekeningnr() {
        return rekeningnr;
    }

    public void setRekeningnr(String rekeningnr) {
        this.rekeningnr = rekeningnr;
    }
    
    public void storten(double bedrag) throws BankVerrichtingFout{
        if(bedrag > 10 && bedrag < 1501){
            this.saldo += bedrag;
        }
        else {
            throw new BankVerrichtingFout(this, bedrag, "Het te storten bedrag moet tussen 10 en 1500 liggen.");
        }
    }
    
    public void afhalen(double bedrag) throws BankVerrichtingFout {
        if(bedrag <= this.getSaldo() && bedrag < 1501){
           this.saldo -= bedrag; 
        }
        else {
            throw new BankVerrichtingFout(this, bedrag, "Het af te halen bedrag moet minder zijn dan 1500 én van de saldo van de rekening.");
        }
    } 
    
    @Override
    public String toString(){
        return "Naam: " + this.getNaam() + " - rekeningnr: " + this.getRekeningnr() + " - saldo: " + this.getSaldo();
    }
}
