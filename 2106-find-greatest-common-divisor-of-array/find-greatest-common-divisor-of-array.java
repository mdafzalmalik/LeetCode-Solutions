import java.util.*;

class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int i = nums[0];
        while(i > 1){
            if((nums[0] % i == 0) && (nums[nums.length-1]) % i == 0){
                return i;
            }
            i--;
        }
        return 1;
    }
}