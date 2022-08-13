/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank_account_system;
import java.util.Scanner;

public class account {
    Scanner input = new Scanner(System.in);
    int c;
    String name;
    double ib;
    
    public account(int ac)
    {
       c=ac;
      
    }
    public void acc1()
    {
        if(c==1)
        {
            
        
       name="abdul hameed";
       c=1;
       ib=10000d;
            System.out.printf("your name is %s\nyour account number is %d\nyour initial balance is %.2f\n\n",name,c,ib);
   
    }
    }
    public void acc2()
    {
        if(c==2)
        {
            name="abdul muqeet";
       c=2;
       ib=50000d;
            System.out.printf("your name is %s\nyour account number is %d\nyour initial balance is %.2f\n\n",name,c,ib);
        }
        
    }
      public void acc3()
    {
        if(c==3)
        {
            name="hanzala";
       c=3;
       ib=78000d;
            System.out.printf("your name is %s\nyour account number is %d\nyour initial balance is %.2f\n\n",name,c,ib);
        }
        
    }
        public void acc4()
    {
        if(c==4)
        {
            name="hashir";
       c=4;
       ib=50450d;
            System.out.printf("your name is %s\nyour account number is %d\nyour initial balance is %.2f\n\n",name,c,ib);
        }
        
    }
          public void acc5()
    {
        if(c==5)
        {
            name="hamid";
       c=5;
       ib=58500d;
            System.out.printf("your name is %s\nyour account number is %d\nyour initial balance is %.2f\n\n",name,c,ib);
        }
        
    }
          public void acc6()
    {
        if(c<1 || c>5)
        {
          
            System.out.println("enter correct account number as given 1-5 ");
        }
       
    }
          
          public void deposit(int c)
          {
              int d=c;
             if(d==1)
        {
            System.out.println("enter the amount you want to deposit\n");
            int a1=input.nextInt();
            System.out.printf("your new account balance is %d\n\n",(a1+10000));
        } 
          }
          public void withdraw(int g)
          {
              int w=g;
              if(w==2)
        {
            System.out.println("enter the amount you want to withdraw\n");
            int a2=input.nextInt();
            System.out.printf("your new account balance is %d\n\n",(10000-a2));
        }
          }
          public void check_bal(int e)
          {
              int q=e;
              if(q==3)
        {
            System.out.printf("your current balance is %.2f\n",ib);
        }
        
          }
}
