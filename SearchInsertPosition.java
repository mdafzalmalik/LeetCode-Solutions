package leetcode;

public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,5,7,8};
		int item = 6;
		System.out.println(searchPosition(arr, item));

	}
	
	public static int searchPosition(int[] arr, int item) {
		int start = 0;
		int end = arr.length-1;
		
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if(arr[mid] == item) {
				return mid;
			}
			else if(arr[mid] < item) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return start;
	}

}
