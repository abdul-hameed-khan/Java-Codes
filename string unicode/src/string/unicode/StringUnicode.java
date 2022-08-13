/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.unicode;

/**
 *
 * @author Zulfiqar
 */
import java.util.Scanner;

public class StringUnicode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        String name;
        System.out.println("enter your name\n");
        name=input.nextLine();
        System.out.printf("your name : %s\n",name);
        
        conversion a = new conversion();
       a.Sconversion(name);
        
    }
    
}
