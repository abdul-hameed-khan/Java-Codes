/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

import java.util.Scanner;


public class square extends two_dimshape{
   
    double r,a;
    @Override
    public double area()
    {
        Scanner input=new Scanner (System.in);
       final double pi=3.1459;
       
        System.out.println("plz enter the side of a square\n");
        r=input.nextDouble();
        a=r*r;
        return a;
    }
    @Override
    public String toString()
    {
     return "Area of a square is" +a;   
    }  
}

