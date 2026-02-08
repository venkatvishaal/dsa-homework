/*
https://leetcode.com/problems/evaluate-reverse-polish-notation/description/
Approach:
    Use the basic stack operations and conditional statements
Logic:
    Create a stack and then inside the loop check whether the varibales inside the array are numbers or characters
    if they are characters like +,*,/ we use the operation after we have seen the numbers. Like [2,3,*,4,5,+,+]gives 2*3+4+5

*/

class Solution {
    public int evalRPN(String[] tokens) 
    {
    Stack<Integer> stack =new Stack<>();
    for(String token :tokens)
    {
        if(token.equals("+")||token.equals("-")||token.equals("*")||token.equals("/"))
        {
            int b=stack.pop();
            int a=stack.pop();
            int result=0;
            if(token.equals("+"))
            {
                result=a+b;
            }
            else if(token.equals("-"))
            {
                result=a-b;
            }
            else if(token.equals("*"))
            {
                result=a*b;
            }
            else
            {
                result=a/b;
            }
        stack.push(result);
        }
        else
        {
            stack.push(Integer.parseInt(token));
        }
        
    }
    return stack.pop();
    }
}

/* 
Time complexity:
Best:O(n)
Average:O(n)
Worst:O(n)
Space Complexity:O(n)
*/