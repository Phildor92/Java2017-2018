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
public class BankVerrichtingFout extends Exception {
    private Rekening rekening;
    private double bedrag;
    private String melding;
    
    public BankVerrichtingFout(Rekening rekening, double bedrag, String melding){
        this.rekening = rekening;
        this.bedrag = bedrag;
        this.melding = melding;
    }

    public Rekening getRekening() {
        return rekening;
    }

    public void setRekening(Rekening rekening) {
        this.rekening = rekening;
    }

    public double getBedrag() {
        return bedrag;
    }

    public void setBedrag(double bedrag) {
        this.bedrag = bedrag;
    }

    public String getMelding() {
        return melding + " Het te overschrijven bedrag is " + this.getBedrag() + " en de saldo van de rekening (" + this.getRekening().getRekeningnr()+ ") in kwestie: " + this.getRekening().getSaldo()+ ".";
    }

    public void setMelding(String melding) {
        this.melding = melding;
    }
    
    
}
