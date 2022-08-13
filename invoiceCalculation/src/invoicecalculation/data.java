/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoicecalculation;

/**
 *
 * @author Zulfiqar
 */
import java.util.Scanner;
public class data {
    Scanner input = new Scanner(System.in);
    
    public data()
    {
        
    }
    
   public void functions()
           {
       int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0;
       int a1=0,a2=0,a3=0,a4=0,a5=0,a6=0,a7=0,a8=0,a9=0,a10=0;
       int m1=1,m2=2,m3=3,m4=4,m5=5,m6=6,m7=7,m8=8,m9=9,m10=10;
       double t1=0d,t2=0d,t3=0d,t4=0d,t5=0d,t6=0d,t7=0d,t8=0d,t9=0d,t10=0d;
       int u1=10,u2=100,u3=500,u4=50,u5=70,u6=80,u7=60,u8=120,u9=110,u10=150;
       int d1=3,d2=5,d3=9,d4=12,d5=8,d6=14,d7=5,d8=9,d9=15,d10=7;
       String s1="eggs",s2="milk",s3="butter",s4="bread",s5="potatoes",s6="tomatoes",s7="burger",s8="kachup",s9="yougurt",s10="banana";
               int z=0;
          int x=0;     
        System.out.println("we have following items available on our store\n\n");
        System.out.printf(" %d   %s\n %d   %s\n %d   %s\n %d   %s\n",m1,s1,m2,s2,m3,s3,m4,s4);
        System.out.printf(" %d   %s\n %d   %s\n %d   %s\n %d   %s\n",m5,s5,m6,s6,m7,s7,m8,s8);
        System.out.printf(" %d   %s\n %d  %s\n",m9,s9,m10,s10);
         System.out.println("enter the id no. of the item you need to buy\n");
         while(z!=-1)
         {
          z =input.nextInt();
        if(z>0 && z<11)
        {
       switch(z)
        {
            case 1:
                System.out.println("enter the quantity of eggs you need to buy\n");
                a1=input.nextInt();
                 a=a1*u1;
                 t1 = (a-(a*0.03)); 
                break;
            case 2:
                System.out.println("enter the quantity of milk(1 kg pack) you need to buy\n");
                 a2=input.nextInt();
                b=a2*u2;
                 t2 =(b-(b*0.05)) ;
                break;
             case 3:
                System.out.println("enter the quantity of butter(1 kg pack) you need to buy\n");
                a3=input.nextInt();
                c=a3*u3;
                 t3 =(c-(c*0.09)) ;
                break;
                
            case 4:
                System.out.println("enter the quantity of bread you need to buy\n");
                 a4=input.nextInt();
                d=a4*u4;
                t4=(d-(d*0.12));
                break;
             case 5:
                System.out.println("enter the quantity of potatoes(1 kg pack) you need to buy\n");
                 a5=input.nextInt();
                e=a5*u5;
                 t5 = (e-(e*0.08));
                break;
            case 6:
                System.out.println("enter the quantity of tomatoes(1 kg pack) you need to buy\n");
                a6=input.nextInt();
                f=a6*u6;
                 t6 = (f-(f*0.14));
                break;
            case 7:
                System.out.println("enter the quantity of burger you need to buy\n");
                 a7=input.nextInt();
                g=a7*u7;
                 t7 =(g-(g*0.05)) ;
                break;
             case 8:
                System.out.println("enter the quantity of kachup(1 kg pack) you need to buy\n");
                 a8=input.nextInt();
                h=a8*u8;
                t8 =(h-(h*0.09)) ;
                break;
            case 9:
                System.out.println("enter the quantity of yougurt(1 kg pack) you need to buy\n");
                 a9=input.nextInt();
                i=a9*u9;
                 t9 =(i-(i*0.15)) ;
                break;
            case 10:
                System.out.println("enter the quantity of banana(1 dozen pack) you need to buy\n");
                a10=input.nextInt();
                j=a10*u10;
                 t10 =(j-(j*0.07)) ;
                break;
                default:
                    System.out.println("enter the correct id no. of the item\n");
                    break;
        
        }
       System.out.println("if you don't want to buy any more items then enter -1 \nelse press the id no. of item you want to buy\n");  
     }
        else if(z==-1)
        {
            
        }
     else
         {
           System.out.println("enter the correct id no. of the item\n");  
}  
}
         
        System.out.println("Items ID\tname\t\tunit price\titems purchase\ttotal price\tdiscount\ttotal after discount");
        System.out.printf(" %d      \t%s   \t\t  %d   \t\t    %d  \t\t    %d  \t\t    %d percent   \t   %.2f\n",m1,s1,u1,a1,a,d1,t1 );
        System.out.printf(" %d      \t%s   \t\t  %d   \t    %d  \t\t    %d  \t\t    %d percent    \t   %.2f\n",m2,s2,u2,a2,b,d2,t2 );
        System.out.printf(" %d      \t%s   \t  %d   \t    %d  \t\t    %d  \t\t    %d percent   \t   %.2f\n",m3,s3,u3,a3,c,d3,t3 );
        System.out.printf(" %d      \t%s   \t  %d   \t\t    %d  \t\t    %d  \t\t    %d percent   \t   %.2f\n",m4,s4,u4,a4,d,d4,t4 );
        System.out.printf(" %d      \t%s   \t  %d   \t\t    %d  \t\t    %d  \t\t    %d percent   \t   %.2f\n",m5,s5,u5,a5,e,d5,t5 );
        System.out.printf(" %d      \t%s   \t  %d   \t\t    %d  \t\t    %d  \t\t    %d percent   \t   %.2f\n",m6,s6,u6,a6,f,d6,t6 );
        System.out.printf(" %d      \t%s   \t  %d   \t\t    %d  \t\t    %d  \t\t    %d percent   \t   %.2f\n",m7,s7,u7,a7,g,d7,t7 );
        System.out.printf(" %d      \t%s   \t  %d   \t    %d  \t\t    %d  \t\t    %d percent   \t   %.2f\n",m8,s8,u8,a8,h,d8,t8 );
        System.out.printf(" %d      \t%s   \t  %d   \t    %d  \t\t    %d  \t\t    %d percent   \t   %.2f\n",m9,s9,u9,a9,i,d9,t9 );
        System.out.printf(" %d      \t%s   \t  %d   \t    %d  \t\t    %d  \t\t    %d percent   \t   %.2f\n",m10,s10,u10,a10,j,d10,t10 );
        double gt=a+b+c+d+e+f+g+h+i+j;
        double gtd=t1+t2+t3+t4+t5+t6+t7+t8+t9+t10;
         System.out.printf("\n\nthe grand total price is %.2f\n",gt);
         System.out.printf("\nthe grand total price after discount is %.2f\n\n",gtd);
               System.out.println("how do you want to pay the bill\n");
               System.out.println("enter 1 for paying the bill through your bank account\n");
              
               System.out.println("enter 2 for paying the bill by cash\n");
             
               
               int p=input.nextInt();
               
               if(p==1)
               {
                    
               }
               if(p==2)
               {
                   System.out.println("luigujh");
               }
               else
               {
                   System.out.println("please enter the correct number for paying the bill\n");
               }
               
}

}

