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
public class Bediende extends Werknemer {
    private int regime;
    
    public Bediende(int nummer, String naam, String afdeling){
        super(nummer, naam, afdeling);
        //this.setLoon(1500); //should be set manually
    }

    public int getRegime() {
        return regime;
    }

    public void setRegime(int regime) {
        this.regime = regime;
    }
    
    @Override
    public String getInfo(){
        return this.getNummer() + " " + this.getNaam() + " (" + this.getAfdeling() + ") - bediende: " + this.getRegime() + "%";
    }
    
    @Override
    public double berekenLoon() {
        return this.getLoon() * (this.getRegime()/100.0);
    }

    @Override
    public String getVerloner() {
        return this.getNaam();
    }

    @Override
    public String[][] getLoonInfo() {
        String[] categorieen = new String[]{ "kategorie","afdeling","maandloon","regime","te betalen"};
        String[][] loonInfo = new String[2][categorieen.length];
        for(int i = 0; i < loonInfo[0].length; i++){
            loonInfo[0][i] = String.format("%-12s:", categorieen[i]) + ("  ");
        }
        loonInfo[1][0] = String.format("%s","Bediende");
        loonInfo[1][1] = String.format("%s",this.getAfdeling());
        loonInfo[1][2] = String.format("%s",this.getLoon());
        loonInfo[1][3] = String.format("%s",this.getRegime());
        loonInfo[1][4] = String.format("%s",this.berekenLoon());
        
        return loonInfo;
    }
    
}
