/*
 * @lc app=leetcode id=258 lang=java
 *
 * [258] Add Digits
 */

// @lc code=start
class Solution {
    public int addDigits(int num) {
        while(num >= 10){
            num = sum(num);
        }

        return num;
    }

    private int sum(int num){
        int sum = 0 ;
        while(num != 0){
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
}
// @lc code=end

