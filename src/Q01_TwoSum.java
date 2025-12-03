/*\
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q01_TwoSum {
    public int[] twoSum1(int[] nums, int target) {

        for(int i=1; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                if (nums[j]+nums[j-i] == target){
                    return new int[] {j-i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int check = target - nums[i];
            if(hm.containsKey(check))
                return new int[] {hm.get(check), i};
            hm.put(nums[i],i);
        }
        return new int[1];
    }
    public int[] twoSum3(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
        public static void main(String[] args){
            Q01_TwoSum q1 = new Q01_TwoSum();
            int[] ans = q1.twoSum1(new int[]{2, 11, 7, 15}, 9);
            System.out.println(Arrays.toString(ans));
    }
}
