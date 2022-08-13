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
public class conversion {
    double w,y;
   
    double kg=0d,ht=0d;
Scanner input = new Scanner(System.in);
    public conversion( double i,double h)
    {
         y=h; 
       w= i;
    }
    public void wconversion()
    {
        
       if(w==1)
       {
           System.out.println("enter your weight in kg\n");
            kg = input.nextDouble();
       }
       else
       {
           System.out.println("enter your weight in pounds\n");
          double kg1 = input.nextDouble();
           kg= kg1 * 0.453;
       }
    }
    public void hconversion()
    {
        
       if(y==3)
       {
           System.out.println("enter your height in meters\n");
        ht=input.nextDouble();
        }
        if (y==4)
       {
            System.out.println("enter your height in feet\n");
           double ht1=input.nextDouble();
           ht=ht1 * 0.3043;
       }
        if(y==5)
       {
           System.out.println("enter your height in inches\n");
         double ht2=input.nextDouble();
         ht=ht2 * 0.0254;
       }

       if(y==6)
       {
           System.out.println("enter your height in cm\n");
           double ht3 = input.nextDouble();
           ht = ht3 * 0.01;
       }
 }
    public void bmi()
    {
        
        double bm = (kg/ht)*ht;
        System.out.printf("your body mass index is %.2f\n",bm);
        if(bm < 18.5)
        {
            System.out.println("you are under weight\n");
        }
        else if(bm > 18.5 && bm < 24.9)
        {     
       System.out.println("you have normal weight\n");
    }
        else if(bm > 24.9 && bm < 29.9)
        {
            System.out.println("you are over-weight\n");
        }
        else
        {
            System.out.println("you are obese\n");
        }
}
}