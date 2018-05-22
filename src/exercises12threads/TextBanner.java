/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises12threads;

/**
 *
 * @author Philip Evans
 */
public class TextBanner extends Thread {
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
}
