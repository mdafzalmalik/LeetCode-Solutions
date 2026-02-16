package leetcode;

public class SubarrayProductLessThanK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 5, 2, 6 };
		int k = 100;
		System.out.println(productLessThanK(arr, k));

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
