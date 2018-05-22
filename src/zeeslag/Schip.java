/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeeslag;

import java.util.Random;

/**
 *
 * @author Philip Evans
 */
public class Schip {
    private int lengte, positieX, positieY;
    private String naam;
    private boolean isVerticaal = true;
    private Random r = new Random();
    
    public Schip(int lengte, String naam){
        isVerticaal = r.nextBoolean();
        this.lengte = lengte;
        this.naam = naam;
        if(isVerticaal){
            positieX = r.nextInt(8-lengte);
            positieY = r.nextInt(8);
        } else {
            positieY = r.nextInt(8-lengte);
            positieX = r.nextInt(8);
        }
    }

    public int getLengte() {
        return lengte;
    }

    public void setLengte(int lengte) {
        this.lengte = lengte;
    }

    public int getPositieX() {
        return positieX;
    }

    public void setPositieX(int positieX) {
        this.positieX = positieX;
    }

    public int getPositieY() {
        return positieY;
    }

    public void setPositieY(int positieY) {
        this.positieY = positieY;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public boolean isVerticaal() {
        return isVerticaal;
    }

    public void setIsVerticaal(boolean isVerticaal) {
        this.isVerticaal = isVerticaal;
    }  
    
}
