
package polymorphism;

import static java.lang.Math.sqrt;
import java.util.Scanner;


public class tetrahedron  extends three_dimshape{
     Scanner input=new Scanner (System.in);
    double r,a,v;
    final double pi=3.1459;
    @Override
    public double area()
    {
     
        System.out.println("plz enter the edge of a tetrahedron\n");
        r=input.nextDouble();
        a=sqrt(3)*(r*r);
        return a;
    }
     @Override
    public double volume() {
        v=(r*r*r)/(6*sqrt(2));
        return v;
    }
    @Override
    public String toString()
    {
     return "Area of a tetrahedron is" +a+"\nvolume of tetrahedron is"+v; 
     
    }
   
    
}
