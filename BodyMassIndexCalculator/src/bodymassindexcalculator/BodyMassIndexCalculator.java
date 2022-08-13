/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodymassindexcalculator;

/**
 *
 * @author Zulfiqar
 */
import java.util.Scanner;
public class BodyMassIndexCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int w,h, height,weight;
        System.out.println("enter your weight\n");
        System.out.println("for entering weight in Kg press 1\n");

        System.out.println("for entering weight in pounds press 2\n");
        w= input.nextInt();
        System.out.println("enter your height\n");
        System.out.println("for entering height in meters press 3\n");
        
        System.out.println("for entering height in feet press 4\n");
        
        System.out.println("for entering height in inches press 5\n");
        
        System.out.println("for entering height in cm press 6\n");
        h=input.nextInt();
        
        conversion a= new conversion(w,h);
        a.wconversion();
        a.hconversion();
        a.bmi();
    }
    
}
