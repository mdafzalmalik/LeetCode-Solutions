package leetcode;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,7,11,15};
		int target = 9;
		
		int[] ans = twoSumIndex(arr, target);
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}

	}
	
	public static int[] twoSumIndex(int[] arr, int target) {
        int[] ans = new int[2];
        int i = 0;

        while (i < arr.length) {
            int j = i + 1;
            while (j < arr.length) {
                if (arr[i] + arr[j] == target) {
                    ans[0] = i;   // FIXED
                    ans[1] = j;   // FIXED
                    return ans;   // FIXED
                }
                j++;
            }
            i++;
        }

        return ans;
    }

}
