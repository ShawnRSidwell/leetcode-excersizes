package NeetCode150.TwoPointers;

import java.lang.reflect.Array;
import java.util.ArrayList;

/*
125. Valid palindrome

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.



Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.


Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.
 */
public class ValidPalindrome {

    //fastest solution
    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) return true;
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            char startChar = s.charAt(start);
            char endChar = s.charAt(end);
            if (!Character.isLetterOrDigit(startChar)) {
                start++;
            } else if (!Character.isLetterOrDigit(endChar)) {
                end--;
            } else {
                if (Character.toLowerCase(startChar) != Character.toLowerCase(endChar)) {
                    return false;
                }
                start++;
                end--;

            }
        }
        return true;
    }


    //my solution to turn into character array
    public static boolean isPalindromeWArrayList(String s) {
        ArrayList<Character> letters = new ArrayList<>();
        if (s.length() <= 1) return true;

        char[] charArray = s.toCharArray();

        for (char letter : charArray) {
            if (Character.isLetterOrDigit(letter)) {
                char lowerCaseLetter = Character.toLowerCase(letter);
                letters.add(lowerCaseLetter);
            }
            ;
        }
        if (letters.size() <= 1) return true;
        if (letters.size() == 2) return letters.get(0).equals(letters.get(1));
        int iterator = letters.size() - 1;
        for (int i = 0; i <= letters.size() / 2; i++) {
            if (letters.get(i) != letters.get(iterator)) {
                return false;
            }
            iterator--;

        }
        return true;
    }

    public static void main(String[] args) {
        //false
        String x = "race a car";
        //false
        String v = "0p";
        //true
        String c = "00";
        //true
        String s = "A man, a plan, a canal: Panama";
        //true
        String z = ".,";


        System.out.println(isPalindrome(s));

    }
}
