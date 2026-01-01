package leetcode;

public class ProductofArrayExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {6,2,3,4};
		int[] ans = produtExceptItself(arr);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}
	
	public static int[] produtExceptItself(int[] arr) {
		int n = arr.length;
		
		int[] left = new int[n];
		left[0] = 1;
		for(int i = 1; i < left.length; i++) {
			left[i] = left[i-1] * arr[i-1];
		}
		
		int[] right = new int[n];
		right[n-1] = 1;
		for (int i = right.length-2; i >= 0; i--) {
			right[i] = right[i+1] * arr[i+1];
		}
		
		for (int i = 0; i < left.length; i++) {
			left[i] = left[i] * right[i];
		}
		
		return left;
	}

}
