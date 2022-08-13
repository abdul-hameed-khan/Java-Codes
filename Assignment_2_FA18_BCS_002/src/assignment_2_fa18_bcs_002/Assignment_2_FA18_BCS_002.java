/*
Name: ABDUL HAMEED KHAN
Reg no# FA18-BCS-002
Assignment 2
BCS 4A
*/
package assignment_2_fa18_bcs_002;

import java.util.Scanner;
import java.util.Stack;
public class Assignment_2_FA18_BCS_002 {

  
    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
        System.out.println("please enter the expression to check balanced parenthesis\n");
        String check= in.nextLine();
       

       System.out.println(checkBalanced(check));
        
    }

    public static boolean checkBalanced(String check)
    {
        Stack<Character> S = new Stack<>();
        for(int a = 0; a < check.length(); a++)
        {
            char let = check.charAt(a);
            if(let == '[' || let == '{' || let == '(')
                S.push(let);
            else if(let == ']' || let == '}' || let == ')')
            {
                if(S.empty())
                    return false;
                switch(let)
                {
                    // Opening square brace
                    case ']':
                        if (S.pop() != '[')
                            return false;
                        break;
                    // Opening curly brace
                    case '}':
                        if (S.pop() != '{')
                            return false;
                        break;
                    // Opening paren brace
                    case ')':
                        if (S.pop() != '(')
                            return false;
                        break;
                    default:
                        break;
                }
            }
        }
        if(S.empty())
            return true;
        return false;
    }
   
}
