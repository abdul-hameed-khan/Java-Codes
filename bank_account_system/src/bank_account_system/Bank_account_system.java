/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank_account_system;

import java.util.Scanner;
public class Bank_account_system {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String name;
        int acc_no;
        double init_balnc = 10000d;
        System.out.println("kindly enter your acc no between 1-5 e.g 1");
        acc_no=input.nextInt();
        

        account b = new account( acc_no);
        b.acc1();
      b.acc2();
      b.acc3();
      b.acc4();
      b.acc5();
      b.acc6();
        System.out.println("enter 1 to deposit\n");
        System.out.println("enter 2 to withdraw\n");
        System.out.println("enter 3 to check balance\n");
        int a = input.nextInt();
      b.deposit(a);
      b.withdraw(a);
      b.check_bal(a);
        
         
         
        
    }
    
}
