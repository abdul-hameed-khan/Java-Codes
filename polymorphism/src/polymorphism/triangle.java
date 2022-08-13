/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

import java.util.Scanner;


public class triangle extends two_dimshape {
     double b,h,a;
    @Override
    public double area()
    {
        Scanner input=new Scanner (System.in);
   
        System.out.println("plz enter the base\n");
        b=input.nextDouble();
        System.out.println("plz enter the height\n");
        h=input.nextDouble();
       a=(h*b)/2;
        return a;
    }
    @Override
    public String toString()
    {
     return "Area of a triangle is" +a;   
    }  
}

