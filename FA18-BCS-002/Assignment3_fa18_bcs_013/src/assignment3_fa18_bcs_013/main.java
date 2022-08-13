/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3_fa18_bcs_013;
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
        Scanner input = new Scanner(System.in);
        int x;
        System.out.println("Enter the term :");
        x = input.nextInt();
        int answer = 0;
        for (int i = x; i > 0; i--)
        {
            answer = answer + i;
        }
        System.out.println(answer + " is the number at term " + x);
    }
    
}
