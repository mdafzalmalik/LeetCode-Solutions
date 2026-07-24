class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                ans = Math.max(count, ans);
            } else if (nums[i] == 0) {
                count = 0;
            }
        }
        return Math.max(ans, count);
    }
}