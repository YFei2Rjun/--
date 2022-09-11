/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }

        char[] arr = String.valueOf(x).toCharArray();
        for (int i = 0, j = arr.length - 1; i < arr.length && j != i; i++, j--){

            if(arr[i] != arr[j]){
                return false;
            }

        }

        return true;
    }
}
// @lc code=end

