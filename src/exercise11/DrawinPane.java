/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise11;

import java.awt.Canvas;
import java.awt.Graphics;

/**
 *
 * @author Philip Evans
 */
public class DrawinPane extends Canvas {
    boolean red = false;
    boolean black = false;
    boolean yellow = false;
    
    int aantal= 0;
    int grootte= 60;
    int plaats = 100;
    
    int groei = 5;
    boolean groter=true;

    public boolean isRed() {
        return red;
    }

    public void setRed(boolean red) {
        this.red = red;
    }

    public boolean isBlack() {
        return black;
    }

    public void setBlack(boolean black) {
        this.black = black;
    }

    public boolean isYellow() {
        return yellow;
    }

    public void setYellow(boolean yellow) {
        this.yellow = yellow;
    }
    
    
}
