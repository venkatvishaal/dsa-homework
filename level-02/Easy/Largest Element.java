/*
https://www.naukri.com/code360/problems/largest-element-in-the-array-largest-element-in-the-array_5026279?leftPanelTabValue=SUBMISSION

Approach:
1.Bruteforce:
    Initalize a temporary variable and traverse the array and update the temp variable after each traversal
2.Logic:
    Compare each element with max value(Current)
*/
import java.util.* ;
import java.io.*; 

public class Solution {

    static int largestElement(int[] arr, int n) {
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
               max=arr[i]++;
            }
        }
        return max;


    }
}
/*
Time complexity:
O(n)
best:O(n)
Average:O(n)
Worst:O(n)
Space Complexity:
O(1) 
*/