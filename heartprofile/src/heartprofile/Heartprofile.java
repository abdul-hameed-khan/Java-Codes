/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package heartprofile;
import java.util.Scanner;
import bodymassindexcalculator.*;
import heartratemonitor.*;

public class Heartprofile {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String n1,n2,adrs;
        int by=0,gender = 0,count=0,count2=0;
        double wt,ht;
        System.out.println("WELCOME TO HEALTH RECORD\n");
        System.out.println("enter your first name\n");
        n1 = input.nextLine();
        System.out.println("enter your last name\n");
        n2 = input.nextLine();
        while(count != 1)
        {
            System.out.println("enter your birth year\n");
            by = input.nextInt();
            if(by > 2019)
            {
                System.out.println("you entered wrong year\n");
                
            }
            else
            {
                count = 1;
            }
        }
        
        System.out.println("enter your address\n");
        adrs = input.next();
        while (count2 !=1)
        {
            System.out.println("enter your gender \n 1 for male \n 2 for female\n");
            gender=input.nextInt();
            if((gender == 1)||(gender == 2))
            {
                count2=1;
            }
            else
            {
                System.out.println("you entered wrong value\n plz enter correct gender value\n");
            }
        }
        System.out.println("enter your weight in kg\n");
        wt= input.nextDouble();
        System.out.println("enter your height\n");
        ht= input.nextDouble();
        heart_rate obj = new heart_rate(n1,n2,by);
        obj.showingname();
        obj.calculate_age();
        obj.maxheartrate();
        obj.targetheartrate();
        System.out.printf("your address : %s\n",adrs);
        if(gender == 1)
        {
            System.out.println("gender : male\n");
        }
        else if(gender == 2)
        {
            System.out.println("gender : female\n");
            
        }
        conversion obj1 = new conversion(wt,ht);
        
        obj1.bmi(wt,ht);
    }
    
}
