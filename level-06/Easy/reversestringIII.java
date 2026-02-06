/*
https://leetcode.com/problems/reverse-words-in-a-string-iii/submissions/1910591620/
Aprroach:
    Array and Two pointers
Logic:
    First convert the string to an array as string in java are immutable. Then inside the loop calculate
    the elements and use the same swapping concept for two pointers.
*/
class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int start = 0;

        for (int i = 0; i <= n; i++) {
            if (i == n || arr[i] == ' ') {
                reverse(arr, start, i - 1);
                start = i + 1;
            }
        }
        return new String(arr);
    }

    private void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
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
