/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heartratemonitor;
import java.util.Scanner;
public class HeartRateMonitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        System.out.println("plz enter your first name\n");
        String s = input.nextLine();
        System.out.println("plz enter your last name\n");
        String s2= input.nextLine();
        System.out.println("plz enter your birth year\n");
        int by=input.nextInt();
        heart_rate a =new heart_rate(s,s2,by);
        a.calculate_age();
        a.showingname();
        a.maxheartrate();
        a.targetheartrate();
        
    }
    
}
