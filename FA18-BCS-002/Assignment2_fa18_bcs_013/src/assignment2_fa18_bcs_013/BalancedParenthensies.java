/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_fa18_bcs_013;

/**
 *
 * @author Shadow
 */
import java.util.Stack;

public class BalancedParenthensies {

    public static boolean balancedParenthensies(String s) {
        Stack<Character> stack  = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if(character == '[' || character == '(' || character == '{' ) {     
                stack.push(character);
            } else if(character == ']') {
                if(stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            } else if(character == ')') {
                if(stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }           
            } else if(character == '}') {
                if(stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
}