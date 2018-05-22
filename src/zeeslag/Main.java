/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeeslag;

/**
 *
 * @author Philip Evans
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] vakken = new String[8][8];
        boolean isHorizontaal = false;
        int schipLengte = 3;
        int startpositieX = 5;
        int startpositieY = 3;
        
        for (String[] vakken1 : vakken) {
            for (int j = 0; j < vakken1.length; j++) {
                vakken1[j] = " - ";
            }
        }
        
        for (String[] varray : vakken) {
            for (String v : varray) {
                System.out.print(v);
            }
            System.out.println("");
        }
        System.out.println("");
        Schip s = new Schip(3, "Duikboot");
        //add a ship
        if(isHorizontaal){
            for(int i = 0; i<schipLengte; i++){
                vakken[s.getPositieX()][s.getPositieY()+i] = " + ";
            }
        } else {
            for(int i = 0; i<schipLengte; i++){
                vakken[s.getPositieX()+i][s.getPositieY()] = " + ";
            }
        }
        
        for (String[] varray : vakken) {
            for (String v : varray) {
                System.out.print(v);
            }
            System.out.println("");
        }
    }
    
}
