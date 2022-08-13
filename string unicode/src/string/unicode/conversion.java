/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.unicode;

/**
 *
 * @author Zulfiqar
 */
public class conversion {
  //  String name;
    
    public void Sconversion(String n)
    {
    String name;
     name = n;   
     int len=n.length();
     for(int i=0;i<len;i++)
     {
         int s=name.charAt(i);
         System.out.printf(" %d",s);
         
     }
        System.out.println("\n");
    }
    
            
}
