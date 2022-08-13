
package assignment.pkg2;

import java.util.Scanner;
public class Assignment2 {
     static boolean checkdelimiters(char[] A){
        boolean check = false;
        for(int i=0; i<A.length;i++){
            if((A[i]=='(' || A[i]=='[' || A[i]=='{') && (A[i]==')' || A[i]==']' || A[i]=='}')){
                check = true;
                
            }
        }
        return check;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please write a line of text\n ");
        String s=in.nextLine();
        
        char arr[] = s.toCharArray(); // convert the String object to array of char
        if(checkdelimiters(arr)){
            System.out.println("correct");
        }
        // iterate over the array using the for-each loop.       
        /*for(char c: arr){
            System.out.println(c);*/

    }   
}
