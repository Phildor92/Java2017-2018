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
public class Arbeider extends Werknemer {
    private int werkuren, bonus;
    
    public Arbeider(int nummer, String naam, String afdeling){
        super(nummer, naam, afdeling);
        this.setLoon(22.50);
    }

    public int getWerkuren() {
        return werkuren;
    }

    public void setWerkuren(int werkuren) {
        this.werkuren = werkuren;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    
    @Override
    public String getInfo(){
        return this.getNummer() + " " + this.getNaam() + " (" + this.getAfdeling() + ") - arbeider: " + this.getWerkuren()+ " uren/maand";
    }
    
    @Override
    public double berekenLoon() {
        return this.getLoon() * this.getWerkuren() + this.getBonus();
    }

    @Override
    public String getVerloner() {
        return this.getNaam();
    }

    @Override
    public String[][] getLoonInfo() {
        String[] categorieen = new String[]{ "kategorie","afdeling","uurloon","werkuren","bonus","te betalen"};
        String[][] loonInfo = new String[2][categorieen.length];
        for(int i = 0; i < loonInfo[0].length; i++){
            loonInfo[0][i] = String.format("%-12s:", categorieen[i]) + ("  ");
        }
        loonInfo[1][0] = "Arbeider";
        loonInfo[1][1] = this.getAfdeling();
        loonInfo[1][2] = this.getLoon() + "";
        loonInfo[1][3] = this.getWerkuren() + "";
        loonInfo[1][4] = this.getBonus() + "";
        loonInfo[1][5] = this.berekenLoon() + "";
        
        return loonInfo;
    }
    
}
