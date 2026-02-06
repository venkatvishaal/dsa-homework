/*
https://leetcode.com/problems/longest-substring-without-repeating-characters/
Approach:
    Sliding window with hashmap used for storing the maps
Logic:
    keep two pointers and create a hashset. The hash set stores the values and the pointers iteratee and
    check for the duplicates if the smae duplicate occur in that of the set then it returns the length of the substring.
*/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, maxLen = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}

/* 
Time complexity:
Best:O(n)
Average:O(n)
Worst:O(n)
Space Complexity:O(1)
*/