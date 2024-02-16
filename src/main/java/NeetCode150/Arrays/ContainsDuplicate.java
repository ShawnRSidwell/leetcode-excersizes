package NeetCode150.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


/*  217. Contains Duplicate
https://leetcode.com/problems/contains-duplicate/description/
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true


Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
 */
public class ContainsDuplicate {


    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numsUsed = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            if(numsUsed.contains(nums[i])) {
                return true;
            }
            numsUsed.add(nums[i]);
        }
        return  false;
    }


    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 1};
        int[] num2 = {1,2,3,4};
        int[] num3 = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(num1));
    }
}
