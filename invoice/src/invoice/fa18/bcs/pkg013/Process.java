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
public class Process {
    int cost, Id1,Id2,Id3,Id4,Id5,Id6,Id7,Id8,Id9,Id10, q1,q2,q3,q4,q5,q6,q7,q8,q9,q10, totalPrice, dis = 2;
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
       
       public void Process (int id, int qnt)
   {
       
        switch (id) {
            case 1:
                item_id = id_1;
                cost = Id_1;
                Id1 = id;
                q1 = qnt;
                break;
            case 2:
                item_id = id_2;
                cost = Id_2;
                Id2 = id;
                q1 = qnt;
                break;
            case 3:
                item_id = id_3;
                cost = Id_3;
                Id3 = id;
                q1 = qnt;
                break;
            case 4:
                item_id = id_4;
                cost = Id_4;
                Id4 = id;
                q1 = qnt;
                break;
            case 5:
                item_id = id_5;
                cost = Id_5;
                Id5 = id;
                break;
            case 6:
                item_id = id_6;
                cost = Id_6;
                Id6 = id;
                q1 = qnt;
                break;
            case 7:
                item_id = id_7;
                cost = Id_7;
                Id7 = id;
                q1 = qnt;
                break;
            case 8:
                item_id = id_8;
                cost = Id_8;
                Id8 = id;
                break;
            case 9:
                item_id = id_9;
                cost = Id_9;
                Id9 = id;
                q1 = qnt;
                break;
            case 10:
                item_id = id_10;
                cost = Id_10;
                Id10 = id;
                q1 = qnt;
                break;
            default:
                break;
            
        }
        int gt = 0;
            gt = gt + cost*qnt;
            float discount = ((float)dis/(float)100) * cost;
            float gdt = gt - discount;
        for (int i = 1; i <= qnt; i++)
       {
           dis++;
       }
            System.out.printf("ID\t\tItem Name\t\t Price\t\t Quantity \t\t Total Price\t\t Discount\t\t Total with Discount\n");
            System.out.println(id + "\t\t" + item_id + "\t\t\t " + cost + "\t\t" + qnt + "\t\t " + (cost * qnt) + "\t\t\t " + dis + "%\t\t" );
       
    }
       public void print ()
       {
           System.out.println("******************************************************************************************************");
           System.out.println("******************************************************************************************************");
           System.out.println("******************************************************************************************************");
           System.out.printf("ID\t\tItem Name\t\t Price\t\t Quantity \t\t Total Price\t\t Discount\t\t Total with Discount\n");
           if (Id1 > 0)
           {
               
                System.out.println(Id1 + "\t\t" + item_id + "\t\t\t " + cost + "\t\t" + q1 + "\t\t " + (cost * q1) + "\t\t\t " + dis + "%\t\t" );
           }
           if (Id2 > 0)
           {
                System.out.println(Id2 + "\t\t" + item_id + "\t\t\t " + cost + "\t\t" + q2 + "\t\t " + (cost * q2) + "\t\t\t " + dis + "%\t\t" );
           }
           if (Id3 > 0)
           {
                System.out.println(Id3 + "\t\t" + item_id + "\t\t\t " + cost + "\t\t" + q3 + "\t\t " + (cost * q3) + "\t\t\t " + dis + "%\t\t" );
           }
           if (Id4 > 0)
           {
                System.out.println(Id4 + "\t\t" + item_id + "\t\t\t " + cost + "\t\t" + q4 + "\t\t " + (cost * q4) + "\t\t\t " + dis + "%\t\t" );
           }
           if (Id5 > 0)
           {
                System.out.println(Id5 + "\t\t" + item_id + "\t\t\t " + cost + "\t\t" + q5 + "\t\t " + (cost * q5) + "\t\t\t " + dis + "%\t\t" );
           }
           if (Id6 > 0)
           {
                System.out.println(Id6 + "\t\t" + item_id + "\t\t\t " + cost + "\t\t" + q6 + "\t\t " + (cost * q6) + "\t\t\t " + dis + "%\t\t" );
           }
           if (Id7 > 0)
           {
                System.out.println(Id7 + "\t\t" + item_id + "\t\t\t " + cost + "\t\t" + q7 + "\t\t " + (cost * q7) + "\t\t\t " + dis + "%\t\t" );
           }
           if (Id8 > 0)
           {
                System.out.println(Id8 + "\t\t" + item_id + "\t\t\t " + cost + "\t\t" + q8 + "\t\t " + (cost * q8) + "\t\t\t " + dis + "%\t\t" );
           }
           if (Id9 > 0)
           {
                System.out.println(Id9 + "\t\t" + item_id + "\t\t\t " + cost + "\t\t" + q9 + "\t\t " + (cost * q9) + "\t\t\t " + dis + "%\t\t"  );
           }
           if (Id10 > 0)
           {
                System.out.println(Id10 + "\t\t" + item_id + "\t\t\t " + cost + "\t\t" + q10 + "\t\t " + (cost * q10) + "\t\t\t " + dis + "%\t\t" );
           }
       }
      
}
