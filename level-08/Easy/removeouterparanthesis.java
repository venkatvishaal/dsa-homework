/*
https://leetcode.com/problems/remove-outermost-parentheses/submissions/1912286709/
Approach:
    Travese inside while keeping track of the paranthesis and only append if it is not a primitive one
Logic:
    Outermost is 0 and 1 
*/
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int depth = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (depth > 0) {
                    result.append(c);
                }
                depth++;
            } else { // c == ')'
                depth--;
                if (depth > 0) {
                    result.append(c);
                }
            }
        }
        return result.toString();
    }
}

/* 
Time complexity:
Best:O(n)
Average:O(n)
Worst:O(n)
Space Complexity:O(n)
*/