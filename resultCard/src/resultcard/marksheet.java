
package resultcard;
import java.util.Scanner;
public class marksheet {
   Scanner input = new Scanner (System.in);
   
  int[][] no=new int[7][6];
  String[] subj=new String[6];
  String marks[]={"Quiz1","Quiz2","Assignment1","Assignment2","Sessional1","Sessional2","Final theory"};
  public marksheet(){
      
  }
  public void input()
  {
      int q=1;
      for(int p=0;p<6;p++)
      {
          System.out.printf("please enter the name of subject %d\n",q++);
          subj[p]=input.next();
      }
      for(int i=0;i<7;i++)
      {
          for(int j=0;j<6;j++)
          {
              System.out.printf("plz enter the marks of %s in %s\n",marks[i],subj[j]); 
              no[i][j]=input.nextInt();
          }
      }
      
  }
  public void display()
  {
       for(int n=0;n<7;n++)
      {
          System.out.printf("%15s\t",marks[n]);
      }
     
     
      for(int k=0;k<6;k++)
      {
          System.out.printf("\n%s",subj[k]);
          for(int l=0;l<7;l++)
          {
              
              System.out.printf("%15d ",no[l][k]);   
          }
          System.out.println("\n");
      }
  }
}
