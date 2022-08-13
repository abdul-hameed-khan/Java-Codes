/*
Name: ABDUL HAMEED KHAN
Reg no# FA18-BCS-002
Assignment 3
BCS 4A
 */
package assignment_3_fa18_bcs_002;
import java.util.Scanner;

public class Assignment_3_FA18_BCS_002 {

    static int term(int n) 
    {      
       
        int answer = 0; 
        for (int i = 1; i <= n; i++)  
            answer += i;  
          
        return answer; 
    } 
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.println("enter the term to find the number\n");
        int num= in.nextInt();
        System.out.println(term(num)); 
    }
    
}
