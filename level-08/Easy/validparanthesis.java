/*
https://leetcode.com/problems/valid-parentheses/submissions/1912289405/
Approach:
    Stack can be used to find whether the paranthesis is closed or not as it follows LIFO 
Logic:
    Brackets must be opened in the reverse order of the opening so we use stack

*/
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;

                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

/* 
Time complexity:
Best:O(n)
Average:O(n)
Worst:O(n)
Space Complexity:O(n)
*/