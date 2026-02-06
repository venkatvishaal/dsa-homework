/*
https://leetcode.com/problems/longest-palindromic-substring/submissions/1910595917/
Approach:
    loops and searching
Logic:
    use the same logic as binary search if element found return , else element is stop if they exceed expand further

*/
class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandFromCenter(s, i, i);       
            int len2 = expandFromCenter(s, i, i + 1);   
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() &&
               s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
/* 
TimeComplexity:
Best:O(n^2)
Average:O(n^2)
Worst:O(n^2)
SpaceComplexity:O(1)
*/