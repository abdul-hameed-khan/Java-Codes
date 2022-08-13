5/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author Zulfiqar
 */
import java.util.Scanner;
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b;
        Scanner input= new Scanner(System.in);
        System.out.println("enter a num");
        a=input.nextInt();
        b=input.nextInt();
        int sum = a+b;
        System.out.printf("the sum is %d\n",sum);
        
       mult mul = new mult();
       mul.pro(a,b);
        
    }
    
}
