class Solution {
    public int maxArea(int[] height) {
        int left = 0; 
        int right = height.length - 1;
        int curWater = 0;
        int resMax = 0;
        while (left < right && left < height.length && right < height.length) {
            if (height[left] <= height[right]) {
                curWater = height[left] * (right - left);
                resMax = Math.max(resMax, curWater);
                left++;
            } else {
                curWater = height[right] * (right - left);
                resMax = Math.max(resMax, curWater);
                right--;
            }
        }
        return resMax;
    }
}