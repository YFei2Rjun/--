/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子数组和
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = nums[0];
        for(int x = 1;x<n ;x++){
            if(nums[x-1]>0){
                nums[x] = nums[x]+nums[x-1];
            }
        }
        for(int x : nums){
            if(x>sum){
                sum = x;
            }
        }
        return sum;
    }
}
// @lc code=end

