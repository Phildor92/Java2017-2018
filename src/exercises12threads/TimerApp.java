/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises12threads;

import javax.swing.JFrame;

/**
 *
 * @author Philip Evans
 */
public class TimerApp extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TimerApp timer = new TimerApp();
        timer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        timer.setSize(100,100);
        TimerKnop tk = new TimerKnop(30);
        timer.add(tk);
        timer.setVisible(true);
        tk.startTimer();
    }
    
}
