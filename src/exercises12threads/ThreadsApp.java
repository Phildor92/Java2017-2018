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
public class ThreadsApp {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        TextBanner tb1 = new TextBanner("Apple");
        TextBanner tb2 = new TextBanner("Banana");
        TextBanner tb3 = new TextBanner("Orange");
        
        new Thread(tb1).start();
        new Thread(tb2).start();
        new Thread(tb3).start();
        
        Thread.sleep(100);
        
        tb1.stopThread();
        tb2.stopThread();
        tb3.stopThread();
    }
    
}
