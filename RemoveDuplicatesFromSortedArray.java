class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return nums.length;
        }
        
        int unique = nums[0];
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > unique) {
                unique = nums[i];
                int temp = nums[count];
                nums[count] = nums[i];
                nums[i] = temp;
                
                count++;
            }
            else continue;
        }
        return count;    
    }
}