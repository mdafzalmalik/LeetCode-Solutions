package leetcode;

public class Search2DMatrixII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
			    {1, 2, 3, 4},
			    {5, 6, 7, 8},
			    {9, 10, 11, 12},
			    {13, 14, 15, 16}
			};
		int key = 5;
		
		System.out.println(search(arr, key));

	}
	
	public static boolean search(int[][] arr, int key) {
		int n= arr.length;
		int m = arr[0].length;
		
		int i = 0;
		int j = m-1;
		while(i < n && j >= 0) {
			if(arr[i][j] == key) {
				return true;
			}
			else if(arr[i][j] > key) {
				j--;
			} else {
				i++;
			}
		}
		return false;
	}

}
