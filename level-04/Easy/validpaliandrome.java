/*
https://leetcode.com/problems/valid-palindrome/submissions/1908262983/
Approach:
    Loops
Logic:
    keep two variables at both the end of the string. Iterate throught the while loop and increment and decrement 
    the values as needed . If value equal do the ++ or -- operation on the variables and if charcters are not equal return false else true.
*/
class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            // skip non-alphanumeric from left
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }

            // skip non-alphanumeric from right
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }

            // compare characters (case-insensitive)
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }

            l++;
            r--;
        }

        return true;
    }
}

/*
Time Complexity:
Best:O(1)
Average:O(n)
Worst:O(n)
Space Complexity:O(1)
*/
