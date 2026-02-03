/*
https://leetcode.com/problems/guess-number-higher-or-lower/submissions/1906065847/
Approach:
Binary search
Logic:
first declare l&h. when l<h guess the mid value , call guess(mid)
if returns 0 -> num is mid.
if returns -1 -> nums is high move left, high=mid-1.
if returns 1 -> num is too low move left, low=mid+1.
*/


/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l = 1;
        int r = n;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            int res = guess(mid);

            if (res == 0) {
                return mid;
            } else if (res < 0) { 
                r = mid - 1;
            } else { 
                l = mid + 1;
            }
        }
        return -1;
    }
}


/*
Time complexity:

Best:O(1)
Average:O(log n)
Worst:O(log n)

Space Complexity:O(1)
*/