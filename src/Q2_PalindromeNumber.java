/* 9. Palindrome Number
Given an integer x, return true if x is a palindrome, and false otherwise.

Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
*/

import java.util.*;

public class Q2_PalindromeNumber {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindrome
        if (x < 0) return false;

        int ans = 0, mod = 0, org = x;
        while (x > 0) {
            mod = x % 10;          // extract last digit
            ans = ans * 10 + mod;  // build reversed number
            x /= 10;               // remove last digit
        }
        return ans == org;
    }
    public boolean isPalindromeString(int x) {
        String num = x + "";
        int left = 0;
        int right = num.length()-1;
        while(left < right){
            if(num.charAt(left) != num.charAt(right)) return false;
            left ++;
            right --;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        Q2_PalindromeNumber pn = new Q2_PalindromeNumber();
        System.out.println(pn.isPalindrome(num));
        System.out.println(pn.isPalindromeString(num));
    }
}
