/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_fa18_bcs_013;
import java.util.*;
/**
 *
 * @author Shadow
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String x;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Expression to Check Whether it is balanced or not");
        x = input.nextLine();
        
        BalancedParenthensies obj = new BalancedParenthensies();
        System.out.println("Given expression is balanced = " + obj.balancedParenthensies(x));
    }
    
}
