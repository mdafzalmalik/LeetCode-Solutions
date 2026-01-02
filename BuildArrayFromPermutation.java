package leetcode;

public class BuildArrayFromPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,2,1,5,3,4};
		
		int[] ans = buildArrayPermutation(arr);
		
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}
	
	public static int[] buildArrayPermutation(int[] arr) {
		int[] ans = new int[arr.length];
		for (int i = 0; i < ans.length; i++) {
			ans[i] = arr[arr[i]];
		}
		return ans;
	}

}
