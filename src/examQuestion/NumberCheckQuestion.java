/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examQuestion;

/**
 *
 * @author Philip Evans
 */
public class NumberCheckQuestion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(KontroleCijfers(132,231));
        System.out.println(KontroleCijfers(12,231));
        System.out.println(KontroleCijfers(132,21));
        System.out.println(KontroleCijfers(45235,1423));
    }

    private static boolean KontroleCijfers(int num1, int num2) {
        return DoubleCheck(num1,num2) & DoubleCheck(num2,num1);
    }   
    
    private static boolean DoubleCheck(int num1, int num2){
        char[] num1Chars = (num1 + "").toCharArray();
        String num2Str = num2 + "";
        
        for(char c : num1Chars){
            if(num2Str.indexOf(c) < 0){
                return false;
            }
        }
        return true;
    }
}
