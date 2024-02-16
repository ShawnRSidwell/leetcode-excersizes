package NeetCode150.Arrays;

import java.util.*;

/*
242. Valid Anagram

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false

Constraints:
1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.


Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
 */
public class ValidAnagram {

    //This is the fastest way to accomplish
    public static boolean isAnagram(String x, String y) {
        char[] wordX = x.toCharArray();
        char[] wordY = y.toCharArray();

        Arrays.sort(wordX);
        Arrays.sort(wordY);

        return Arrays.equals(wordX, wordY);
    }

    // Slower, created for practice using Hashmap.
    public static boolean isAnagramUsingHash(String x, String y){
        HashMap <Character, Integer> Count = new HashMap<>();

        for(char letter : x.toCharArray()){
            Count.put(letter, Count.getOrDefault(letter, 0) + 1);
        }
        for(char letter : y.toCharArray()){
            Count.put(letter, Count.getOrDefault(letter, 0) - 1);
        }

        for(int val : Count.values()){
            if(val !=0){
                return false;
            }
        }
        return true;
    }





    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        String x = "rat";
        String y = "car";

        System.out.println(isAnagramUsingHash(s,t));
        System.out.println(isAnagramUsingHash(x,y));


    }
}
