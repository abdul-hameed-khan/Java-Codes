
package parkingcharges;
import java.util.Scanner;

public class parking {
    Scanner input = new Scanner (System.in);
    int[] veh_id=new int[5] ;
    double[] t_parked=new double [5];
    double[] amount=new double [5];
    double total=0.0;
    
   // double[5] tpotal={0.0,0.0,0.0,0.0,0.0};
    public parking()
    {
        
    }
    public void input()
    {
        System.out.println("plz enter the data of 5 cars\n");
        for(int i=0;i<5;i++)
        {
            System.out.println("please enter the vehicle id\n");
            veh_id[i] = input.nextInt();
            System.out.println("please enter the time parked of a car in hours\n");
            t_parked[i]= input.nextDouble();
            
        }
    }
        public void cal_charges()
        {
            
        
        for( int j=0;j<5;j++)
        {
            
        
        if(t_parked[j]<=3 && t_parked[j]>0)
        {
          amount[j]= 20.0;  
        }
        if(t_parked[j]>3 && t_parked[j]<=24)
        {
            amount[j]=20+((t_parked[j]-3)*5);
        }
        if(t_parked[j]>24)
        {
            amount[j]=125.0;
        }
     
        total=total+amount[j];
    }
        }
        public void display()
        {
            
        
        System.out.println("\nVehicle ID\t\tTime parked\t\tAmount payed\n");
        for (int k = 0; k < 5; k++) {
            System.out.printf("%d\t\t\t%.2f\t\t\t%.2f\n",veh_id[k],t_parked[k],amount[k]);
            
        }
            System.out.printf("\n\t\t the total amount is %.2f\n\n",total);
    }
}
