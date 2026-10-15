class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            } else {
                if(stack.isEmpty()) return false;
                char t = stack.pop();
                if(ch == ')' && t != '(' ||ch == '}' && t != '{' 
                || ch == ']' && t != '[') {
                return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
//time: O(n)
//space: O(n)