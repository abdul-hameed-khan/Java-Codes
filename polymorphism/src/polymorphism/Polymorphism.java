
package polymorphism;

import java.util.Random;
import java.util.Scanner;
       
        
public class Polymorphism {

 
    public static void main(String[] args) {
       Scanner ob=new Scanner (System.in);
       shape[] s=new shape[6];
       Random r= new Random();
       int op=1;
       while(op>0)
       {
        int a=r.nextInt(5);
           System.out.println("the random number generated is:"+a);
           switch(a)
           {
               case 0:
                   s[0]= new circle();
                   s[0].area();
                   s[0].toString();
               break;
               case 1:
                   s[1]= new square();
                   s[1].area();
                   s[1].toString();
               break;
               case 2:
                   s[2]= new triangle();
                   s[2].area();
                   s[2].toString();
                   
               break;
               case 3:
                   s[3]= new circle();
                   s[3].area();
                   s[3].toString();
               break;
               case 4:
                   s[4]= new circle();
                   s[4].area();
                   s[4].toString();
               break;
               case 5:
                   s[5]= new circle();
                   s[5].area();
                   s[5].toString();
               break;
           }
           
       }

    } 
}
