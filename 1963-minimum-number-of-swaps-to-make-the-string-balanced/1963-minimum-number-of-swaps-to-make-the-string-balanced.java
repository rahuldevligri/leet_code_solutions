/*
class Solution {
    public int minSwaps(String s) {
        int open = 0, close = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '['){
                open++;
            } else {
                if(open <= 0){
                    close++;
                } else {
                    open--;
                }
            }
        }
        return (close + 1) / 2;
    }
}
*/

/* //using stack
class Solution {
    public int minSwaps(String s) {
        if(s.length()%2 != 0){
            return -1;
        }
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '['){
                stack.push(ch);
            } else {
                if(stack.isEmpty() || stack.peek() == ']'){
                    stack.push(ch);
                } else {
                    stack.pop();
                }
            }
        }
        int close = 0;
        while(!stack.isEmpty()){
            if(stack.pop() == ']'){
                close++;
            }
        }
        return (close + 1) / 2;
    }
}
*/

class Solution {
    public int minSwaps(String s) {
        Stack<Character> stack = new Stack();
        for(int i =0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '['){
                stack.push(ch);
            } else {
                if(stack.isEmpty() || stack.peek() == ']'){
                    stack.push(ch);
                } else {
                    stack.pop();
                }
            }
        }
        int totalBrackets = stack.size() / 2;
        int closeBrackets = (totalBrackets + 1) / 2;
        return closeBrackets;
    }
}