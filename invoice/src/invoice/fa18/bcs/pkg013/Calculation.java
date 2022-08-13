/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoice.fa18.bcs.pkg013;



/**
 *
 * @author fa18-bcs-013
 */
public class Calculation {
    
    int cost, id, quantity = 1, totalPrice, dis = 2;
    char Bill;
    String item_id;
    
   
       String id_1 = "Lays";
       String id_2 = "Juice";
       String id_3 = "Biscuit";
       String id_4 = "Rice";
       String id_5 = "Grains";
       String id_6 = "Ketchup";
       String id_7 = "Salanty";
       String id_8 = "Cold drinks";
       String id_9 = "Bread";
       String id_10 = "Eggs";
       
       
       int Id_1 = 10;
       int Id_2 = 25;
       int Id_3 = 15;
       int Id_4 = 90;
       int Id_5 = 100;
       int Id_6 = 250;
       int Id_7 = 20;
       int Id_8 = 25;
       int Id_9 = 45;
       int Id_10 = 100;
       
//       Calculation (int Item_id, int Qnt)
//       {
//        id = Item_id;  
//        quantity = Qnt;
//       }
     
    
   public void Process (int id)
   {
       
        switch (id) {
            case 1:
                item_id = id_1;
                cost = Id_1;
                break;
            case 2:
                item_id = id_2;
                cost = Id_2;
                break;
            case 3:
                item_id = id_3;
                cost = Id_3;
                break;
            case 4:
                item_id = id_4;
                cost = Id_4;
                break;
            case 5:
                item_id = id_5;
                cost = Id_5;
                break;
            case 6:
                item_id = id_6;
                cost = Id_6;
                break;
            case 7:
                item_id = id_7;
                cost = Id_7;
                break;
            case 8:
                item_id = id_8;
                cost = Id_8;
                break;
            case 9:
                item_id = id_9;
                cost = Id_9;
                break;
            case 10:
                item_id = id_10;
                cost = Id_10;
                break;
            default:
                break;
            
        }
       
       
       for (int i = 1; i <= quantity; i++)
       {
           dis++;
       }
       System.out.printf("ID\t\tItem Name\t\t Price\t\t Total Price\t\t Discount\t\t Total with Discount\n");
       System.out.println(id + "\t\t" + item_id + "\t\t\t " + cost + "\t\t " + (cost * quantity) + "\t\t\t " + dis + "\t\t");
   }
    
    public void Print (int id)
    {
        System.out.printf("ID\t\tItem Name\t\t Price\t\t Total Price\t\t Discount\t\t Total with Discount");
        System.out.println(id + "\t\t" + item_id + "\t\t" + cost + "\t\t" + (cost * quantity) + "\t\t" + dis + "\t\t");
    }

    
    
}
