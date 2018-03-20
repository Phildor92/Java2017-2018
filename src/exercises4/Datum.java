/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises4;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/**
 *
 * @author Philip Evans
 */
public class Datum extends GregorianCalendar {
    
    public Datum(){
        super(TimeZone.getDefault());
        //System.out.println("Default TZ is " + TimeZone.getDefault());
    }
    
    public Datum(int dag, int maand, int jaar){
        super(jaar, maand-1, dag);
    }
    
    public int geefDag(){
        return this.get(Calendar.DAY_OF_MONTH);
    }
    
    public int geefMaand(){
        return this.get(Calendar.MONTH);
    }
    
    public int geefJaar(){
        return this.get(Calendar.YEAR);
    }
    
    public TimeZone geefTijdszone(){
        //conver to String/int?
        return super.getTimeZone();
    }
    
    public String geefSeizoen(){
        //improve
        switch(this.get(Calendar.MONTH)){
            case 12:
            case 1:
            case 2: return "Winter";
            case 3: 
            case 4:
            case 5: return "Lente";
            case 6: 
            case 7:
            case 8: return "Zomer";
            case 9: 
            case 10:
            case 11: return "Herfst";
            default: return "Geen seizoen";
        }
    }
    
    public Datum geefVervaldatum(int dagen){
        Datum vervalDatum = (Datum) this.clone();
        vervalDatum.add(Calendar.DAY_OF_MONTH, dagen);
        System.out.println("[INFO] new day of month is " + vervalDatum.geefDag());
        return vervalDatum;
    }
    
    public int geefAantalDagen(Datum datum){
        Datum tempEen;
        Datum tempTwee;

        if(this.after(datum)){
            tempEen = (Datum) this.clone();
            tempTwee = (Datum) datum.clone();
        } else {
            tempEen = (Datum) datum.clone();
            tempTwee = (Datum) this.clone();       
        }
        
        int elapsed = 0;
        while(tempTwee.before(tempEen)){
            tempTwee.add(Calendar.DAY_OF_MONTH, 1);
            elapsed++;
        }
        return elapsed;
    }
    
    public String show(){
        return String.format("%td/%tm/%ty", this.getTime(), this.getTime(), this.getTime());
    }
    
    public String showLong(){       
        return this.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG_FORMAT, Locale.FRENCH) + " " + this.geefDag() + " " + this.getDisplayName(Calendar.MONTH, Calendar.LONG_FORMAT, Locale.FRENCH) + " " + this.geefJaar();
    }
}
