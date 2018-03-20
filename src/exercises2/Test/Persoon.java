package schooljaar2018;


public class Persoon {
    
    private int nummer;
    private String naam, voornaam;
    private int lengte, gewicht;
    
 
    public Persoon( int nummer, String naam, String voornaam ) {
        this.nummer   = nummer;
        this.naam     = naam;
        this.voornaam = voornaam;
    }
    
    public int getNummer() {
        return nummer;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public int getLengte() {
        return lengte;
    }

    public void setLengte(int lengte) {
        if ( lengte > 120 & lengte < 250 ) this.lengte = lengte;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        if ( gewicht > 30 & gewicht < 200 ) this.gewicht = gewicht;
    }
    
    public boolean isVolledig() {
        return getGewicht()>0 & getLengte()>0;
    }
    
    public int getBMI() {
        if ( getLengte()==0 ) return 0;
        return  (int) ( getGewicht() / (( getLengte() * getLengte() ) / 10000D) );
    }
    
    public boolean isBMIlager( Persoon other) {
        if ( ! this.isVolledig()  ) return false;
        if ( ! other.isVolledig() ) return false;
        if ( this.getBMI() < other.getBMI() ) return true;
        return false;
    }
    
    public int getIdeaalGewicht() {
        if ( ! this.isVolledig()  ) return 0;
        return (int) ( 25 * ((( getLengte() * getLengte() ) / 10000D)));
    }
   
    public String getBMIinfo() {
        return (this.isVolledig() ? this.getBMI() : "info onvolledig") 
               +(this.isVolledig() ? " -> ideaal gewicht="+this.getIdeaalGewicht()+"kg" : "");
                 
       }
}
