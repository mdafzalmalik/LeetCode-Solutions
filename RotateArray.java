package leetcode;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7};
		int k = 3;
		rotateArrayKTimes(arr, k);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
	
	public static void rotateArrayKTimes(int[] arr, int k) {
		int n = arr.length;
		k = k % n;
		for (int i = 0; i < k; i++) {
			int temp = arr[n-1];
			for (int j = n-2; j >= 0; j--) {
				arr[j+1] = arr[j];
			}
			arr[0] = temp;
		}
	}

}
