public class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length - 1;
        int max = Arrays.stream(nums).max().getAsInt();
        if (max != n) return false;
        int[] count = new int[n + 1];
        for (int num : nums) {
            if (num < 1 || num > n) return false;
            count[num]++;
        }
        for (int i = 1; i < n; i++) {
            if (count[i] != 1) return false;
        }
        return count[n] == 2;
    }
}