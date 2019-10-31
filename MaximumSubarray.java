class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int res = nums[0];
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sum = Math.max(sum, nums[i]);   
            res = Math.max(res, sum);
        }
        return res;
    }
}