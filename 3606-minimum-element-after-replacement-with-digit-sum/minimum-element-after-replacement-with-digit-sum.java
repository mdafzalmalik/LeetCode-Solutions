class Solution {
    public int minElement(int[] nums) {
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i< nums.length; i++){
            String s = Integer.toString(nums[i]);
            int sum = 0;
            for(int j = 0; j < s.length(); j++){
                sum += Character.getNumericValue(s.charAt(j));
            }
            ans = Math.min(ans, sum);
            sum = 0;
        }
        return ans;
    }
}