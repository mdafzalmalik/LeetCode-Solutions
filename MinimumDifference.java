package leetcode;

import java.util.Arrays;

public class MinimumDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9,4,1,7};
		int k = 2;
		System.out.println(findMinDiff(arr, k));

	}
	
	public static int findMinDiff(int[] arr, int k) {
        if (k == 1) {
            return 0;
        }

        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i <= arr.length - k; i++) {
            int diff = arr[i + k - 1] - arr[i];
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        return minDiff;
    }

}
