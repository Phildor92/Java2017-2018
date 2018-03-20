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
public class LoonBonVerwerking {
    private int volgnr;
    
    public LoonBonVerwerking(int volgnr){
        this.volgnr = volgnr;
    }
    
    public String getLoonbon(Verloning v){
        String result = "";
        String[][] loonInfo = v.getLoonInfo();
        result = "LOONBON " + this.volgnr + " " + v.getVerloner();
        result += "\n\r\n\r";
        for(int i = 0; i < loonInfo[0].length;i++){
            result += "- ";
            result += loonInfo[0][i] + loonInfo[1][i];
            result += "\n\r";
        }
        volgnr++;
        return result;
    }
}
