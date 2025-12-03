/* 20. Valid Parentheses
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
determine if the input string is valid.

An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Example 1:              Example 2:
Input: s = "()"         Input: s = "()[]{}"
Output: true            Output: true

Example 3:              Example 4:
Input: s = "(]"         Input: s = "([])"
Output: false           Output: true
 */

import java.util.Stack;

public class Q05_ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stk.push(c);
            } else if(c == ')' && !stk.isEmpty() && stk.peek() == '('){
                stk.pop();
            } else if (c =='}' && !stk.isEmpty() && stk.peek() == '{'){
                stk.pop();
            } else if ( c == ']' && !stk.isEmpty() && stk.peek() == '['){
                stk.pop();
            } else {
                return false;
            }
        }
        return stk.isEmpty();
    }
    public static void main(String[] args){
        String str = "({[})";
        Q05_ValidParentheses q5 = new Q05_ValidParentheses();
        System.out.println(q5.isValid(str));
    }
}
