/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises3;

/**
 *
 * @author Philip Evans
 */
public class Calculate {
    
    public static double calc(char operator, double a, double b){
        switch(operator){
            case '/':
                return divide(a,b);
            case '*':
                return multiply(a,b);
            case '-':
                return substract(a,b);
            case '+':
                return add(a,b);
            default:
                return 0.0;
        }
    }
    
    private static double divide(double a, double b){
        return a/b;
    }
    
    private static double multiply(double a, double b){
        return a*b;
    }
    
    private static double substract(double a, double b){
        return a-b;
    }
    
    private static double add(double a, double b){
        return a+b;
    }
}
