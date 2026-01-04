package leetcode;

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,5,6,7,0,1,2};
		int item = 6;
		System.out.println(searchItem(arr, item));

	}
	
	public static int searchItem(int[] arr, int item) {
		int start = 0;
		int end = arr.length-1;
		while(start <= end) {
			int mid = start + (end - start) / 2;
			if(arr[mid] == item) {
				return mid;
			}
			if(arr[start] <= arr[mid]) {
				if(arr[start] <= item && item <= arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if(arr[mid] <= item && item <= arr[end]) {
					start = mid + 1;
				} else {
					end  = mid - 1;
				}
			}
		}
		return -1;
	}

}
