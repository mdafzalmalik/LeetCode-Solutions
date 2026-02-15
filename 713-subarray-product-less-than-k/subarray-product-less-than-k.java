class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        return productLessThanK(nums, k);
    }

    public static int productLessThanK(int[] arr, int k) {
		int si = 0;
		int ei = 0;
		int ans = 0;
		int p = 1;
		while (ei < arr.length) {
			// grow
			p = p * arr[ei];
			// shrink
			while (p >= k && si <= ei) {
				p = p / arr[si];
				si++;
			}
			// ans
			ans = ans + (ei - si + 1);
			ei++;
		}
		return ans;
	}
}