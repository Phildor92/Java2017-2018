/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise11;

import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Philip Evans
 */
public class WindowApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Parameters pm = new Parameters();
        pm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel pn1 = new JPanel();
        pn1.setLayout(new BoxLayout(pn1, BoxLayout.X_AXIS));
        
        KnopListener kl = new KnopListener(pm);
        
        JButton b1 = new JButton("OKAY");
        b1.setActionCommand("OK");
        b1.setPreferredSize(new Dimension(30,10));
        b1.addActionListener(kl);
        
        JButton b2 = new JButton("Cancel!");
        b2.setActionCommand("Cancel");
        b2.setPreferredSize(new Dimension(30,10));
        b2.addActionListener(kl);
        
        JPanel pn2 = new JPanel();
        pn2.setLayout(new BoxLayout(pn2, BoxLayout.Y_AXIS));
        
        
        
        pn1.add(b1);
        pn1.add(b2);
        pm.add(pn1);
        pm.add(pn2);
                
        
        
        pm.setSize(300,200);
        pm.setLocation(300,300);
        pm.setTitle("Hello");
        pm.setVisible(true);
        
        
        
        
    }
    
}
