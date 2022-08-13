/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoice.fa18.bcs.pkg013;
import java.util.Scanner;
/**
 *
 * @author fa18-bcs-013
 */
public class InvoiceFa18Bcs002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        Process Item = new Process ();
        
        
        int id, x , Qnt;
        System.out.println("Press 0 after Entering the Quantity to take your Bill");
        do 
        {
            System.out.println("Enter the Id : ");
            id = input.nextInt();
            System.out.println("Enter the Quantity");
            Qnt = input.nextInt();
            Item.Process(id, Qnt);
            
            x = input.nextInt();

           
            
            
        }while (x != 0);
        Item.print();
    }
    
}
