/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heartratemonitor;

public class heart_rate {
    String s1,s3;
    int b,age,x;
    public heart_rate(String s4,String s5,int c)
    {
        s1=s4;
        s3=s5;
        b=c;
    }
    public void showingname()
    {
       System.out.printf("\nyour first name is : %s\n",s1); 
       System.out.printf("your last name is : %s\n",s3);
    }
    public void calculate_age()
    {
         age=2019-b;
        System.out.printf("your age in years is %d\n",age);
    }
    public void maxheartrate(){
         x= 220-age;
        System.out.printf("your maximum heart rate is %d\n",x);
    }
    public void targetheartrate()
    {
        int g = (x*50)/100;
        int h = (x*85)/100;
        System.out.printf("your target heart range is between %d - %d\n",g,h);
    }
        
        
        
        
        
        
    
}
