/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

import java.util.Scanner;

public class sphere extends three_dimshape{
     Scanner input=new Scanner (System.in);
    double r,a,v;
    final double pi=3.1459;
    @Override
    public double area()
    {
     
        System.out.println("plz enter the redius of a sphere\n");
        r=input.nextDouble();
        a=4*pi*(r*r);
        return a;
    }
     @Override
    public double volume() {
        v=4/3*(pi*(r*r*r));
        return v;
    }
    @Override
    public String toString()
    {
     return "Area of a sphere is" +a+"volume of sphere is"+v; 
     
    }
   
    
}
