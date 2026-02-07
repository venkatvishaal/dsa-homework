/*
https://leetcode.com/problems/reverse-string/
Approach:
    Two pointers
Logic:
    use the two pointers l and r to iterate and reverse the string. Use a temporary variable to store the new value.

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
Time complexity:
Best:O(n)
Average:O(n)
Worst:O(n)
Space Complexity:O(1)
*/