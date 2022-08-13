/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearsearchlab1;

public class array {
    
    public boolean  search(int[] b,int m){
         boolean fnd=false;
        
        for(int i=0;i<b.length;i++)
        {
            if(b[i] == m)
            {
               fnd=true;
               
            }
           
        }
        return fnd;
    }
}
