class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return new int[]{-1, -1};
        }
        
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int otherHalf = target - nums[i];
            if (map.containsKey(otherHalf)) {
                res[0] = map.get(otherHalf);
                res[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return res;
    }
}