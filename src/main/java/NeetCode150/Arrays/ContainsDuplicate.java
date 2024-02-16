package NeetCode150.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

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
