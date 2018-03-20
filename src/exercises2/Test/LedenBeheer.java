package schooljaar2018;


public class LedenBeheer {

    
    public static void main(String[] args) {
       Persoon p1 = new Persoon(1, "Sterk", "Jos" );
       Persoon p2 = new Persoon(2, "Slim",  "Mia" );
       Persoon p3 = new Persoon(3, "Turf",  "Bil" );
       
       p1.setGewicht(80); p1.setLengte(180);
       p2.setGewicht(70); p2.setLengte(150);
       p3.setGewicht(77);
       
       Persoon[] leden = { p1, p2, p3 };
       for ( Persoon p : leden )
            System.out.println(p.getVoornaam()+" : "+p.getBMIinfo() );
     
    }
}
