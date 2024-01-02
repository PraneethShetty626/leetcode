/*
 * @lc app=leetcode id=231 lang=java
 *
 * [231] Power of Two
 */

// @lc code=start
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n==0 ? false : Math.pow(2,(int) (Math.log(n) / Math.log(2))) == n;
    }
}
// @lc code=end

