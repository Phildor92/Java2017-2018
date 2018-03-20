/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises1;

/**
 *
 * @author Philip Evans
 */
public class Exercises2 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int x=5, y=3, z=1;
        z += ++x * y++;
        System.out.println("z: " + z + " x: " + x + " y: " + y);
        z %= --y;
        System.out.println("z: " + z + " x: " + x + " y: " + y);
        x *= y + (7/2);
        System.out.println("z: " + z + " x: " + x + " y: " + y);
    }
    
    
}
