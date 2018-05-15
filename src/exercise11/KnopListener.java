/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Philip Evans
 */
public class KnopListener implements ActionListener {
    Parameters temp;

    public KnopListener(Parameters pm){
        temp = pm;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if("OK".equals(e.getActionCommand())){
            
        } else if ("Cancel".equals(e.getActionCommand())){
            
        }
    }
    
}
