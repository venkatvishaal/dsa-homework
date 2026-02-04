/*
https://leetcode.com/problems/reverse-string/
Approach:
    Two pointers

Logic:
First initialize two pointers l and r and then inside the loop create a temp varaible which is used to store the value
use the same operation of swapping of two numbers using a third variable and keep track of the char
increment l and decrement r
*/
class Solution {
    public void reverseString(char[] s) 
    {
        int l=0;
        int r=s.length-1;
        while(l<r)
        {
            char temp =s[l];
            s[l]=s[r];
            s[r]=temp;
            l++;
            r--;
        }


    }

}
/*
Time Complexity:
Best:O(1)
Average:O(1)
worst:O(1)

Space complexity:O(1)
*/