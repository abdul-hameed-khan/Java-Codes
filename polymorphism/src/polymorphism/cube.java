/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

import java.util.Scanner;

public class cube  extends three_dimshape{
     Scanner input=new Scanner (System.in);
    double r,a,v;
    final double pi=3.1459;
    @Override
    public double area()
    {
     
        System.out.println("plz enter the edge of a cube\n");
        r=input.nextDouble();
        a=6*(r*r);
        return a;
    }
     @Override
    public double volume() {
        v=r*r*r;
        return v;
    }
    @Override
    public String toString()
    {
     return "Area of a cube is" +a+"\nvolume of cube is"+v; 
     
    }
   
    
}
