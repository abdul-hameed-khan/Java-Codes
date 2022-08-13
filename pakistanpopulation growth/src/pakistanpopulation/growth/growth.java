
package pakistanpopulation.growth;

public class growth {
    double pop=200000000.0;
    double gr=0.021;
    int[][] a=new int[100][3];
    int cy=2019;
   double x=0;
    public growth()
    {
        
    }
    public void calculation()
    {
        for(int i=0;i<100;i++)
        {
          
            System.out.printf("%d\t\t%.2f\t\t%.2f\n",cy++,pop,x);
            x = pop*gr;
            pop=pop+x;
            if(pop>250000000 && pop<251369834.16)
                System.out.printf("population will be increased by 25%% in the year %d\n",cy);
            if(pop>300000000 && pop<303071317.83)
                System.out.printf("population will be increased by 50%% in the year %d\n",cy);
            if(pop>350000000 && pop<350529871.0)
                System.out.printf("population will be increased by 75%% in the year %d\n",cy);
            if(pop>400000000 && pop<405420053.50)
                System.out.printf("population will be increased by 100%% in the year %d\n",cy);

        }
    }
}
