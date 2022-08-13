/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Database1 {
  
       public static void main(String[] args) throws FileNotFoundException {
         File f = new File("C:\\Users\\Zulfiqar\\Desktop\\file.txt");
        Scanner sc=new Scanner(f);
       // sc.useDelimiter("\\Z");
       for (int i=0;i<=6;i++){
          System.out.println(sc.nextLine());
         
       }
        String m=""; 
        String[] matches = m.split("\n");
          // System.out.println("\n\n\n\n");
        System.out.println(matches[0]);
    }
    
}
