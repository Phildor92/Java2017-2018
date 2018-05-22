/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises12threads;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author Philip Evans
 */
public class TimerKnop extends JButton implements ActionListener, Runnable {
    private int timeLeft;
    private boolean clicked = false;
    
    public TimerKnop(int time){
        super(String.valueOf(time));//cannot use toString(), since primitive types do not have methods... Use Integer otherwise
        this.timeLeft = time+1;
        this.addActionListener(this);
    }
    
    public void startTimer(){
        new Thread(this).start();
    }
    
    @Override
    public void run(){
        while((timeLeft > 0) && (!clicked)){
            try {
                this.timeLeft--;
                this.setText(timeLeft+"");//other alternative for toString()     
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(TimerKnop.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        clicked = true;
    }
}
