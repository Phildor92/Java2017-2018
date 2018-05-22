
package rekenen;

import java.awt.Color;
import javax.swing.JFrame;


public class RekenApp {

 
    public static void main(String[] args) {
        RekenVenster venster = new RekenVenster();
        venster.setTitle("RekenApp");
        venster.setLocation(200,300);
        venster.pack();
        venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        venster.setBackground(Color.yellow);
        venster.setVisible(true);
    }
    
}
