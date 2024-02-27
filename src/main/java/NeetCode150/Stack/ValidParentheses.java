package NeetCode150.Stack;

import java.util.HashMap;
import java.util.Stack;

/*
20. Valid Parentheses
https://leetcode.com/problems/valid-parentheses/

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false


Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
 */
 public class ValidParentheses {


     //faster, but messier.
     public static boolean fastIsValid(String s){
         int i = -1;
         char[] stack = new char[s.length()];
         for (char ch : s.toCharArray()) {
             if (ch == '(' || ch == '{' || ch == '[')
                 stack[++i] = ch;
             else {
                 if (i >= 0
                         && ((stack[i] == '(' && ch == ')')
                         || (stack[i] == '{' && ch == '}')
                         || (stack[i] == '[' && ch == ']')))
                     i--;
                 else
                     return false;
             }
         }
         return i == -1;
     }



    //clean code way
    public static boolean isValid(String s) {
        if(s.length() % 2 != 0 ) return false;
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> comps = new HashMap<>();
        comps.put('}', '{');
        comps.put(')', '(');
        comps.put(']', '[');
        for(int i=0; i < s.length(); i++){
            if(!stack.isEmpty() && stack.peek() == comps.get(s.charAt(i))){
                stack.pop();
            } else {
            stack.push(s.charAt(i));}

        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String s = "(]";
        System.out.println(isValid(s));


    }
}
