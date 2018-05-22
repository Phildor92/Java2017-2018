/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises12threads;

import javax.swing.JButton;

/**
 *
 * @author Philip Evans
 */
public class TextBanner extends JButton implements Runnable {
    private String text;
    private boolean blnContinue = true;
    private int count = 0;
    
    /**
     *
     * @param text
     */
    public TextBanner(String text){
        this.text = text;
    }

    @Override
    public void run() {
        while(blnContinue){
            System.out.println(text);
            count++;
        }
        System.out.println(text + " - count: " + count);
    }
    
    public void stopThread(){
        blnContinue = false;
    }
    
    Thread t = new Thread();
}
