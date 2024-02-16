package NeetCode150.Arrays;


/*
1. Two Sum
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


Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class TwoSum {


    //fastest answer
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if(numMap.containsKey(comp)){
                return new int[]{numMap.get(comp), i};
            }
            numMap.put(nums[i], i);


        }

        return null;
    }





    //Slow, brute force. Uses two loops
    public static int[] twoSumUsingLoops(int[] nums, int target) {

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 1; j < nums.length; j++) {
                if(i == j){
                    continue;
                }
                if(nums[j] + nums[i] == target){
                    System.out.println(i + "," + j);
                    return new int[]{i, j};
                }
            }

        }
        return null;
    }

    public static void main(String[] args) {

        // should equal [0,1]
        int[] numList1 = {2,7,11,15};
        int target1 = 9;

        // should equal [1,2]
        int[] numList2 = {3,2,4};
        int target2 = 6;

        // should equal [1,2]
        int[] numList3 = {2,5,5,11};
        int target3 = 10;


        System.out.println(twoSum(numList1, target1));


    }



}
