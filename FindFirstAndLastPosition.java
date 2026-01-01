package leetcode;

public class FindFirstAndLastPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,7,7,8,8,10};
		int item = 6;
		
		int[] ans = searcPositions(arr, item);
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}

	}
	
	public static int[] searcPositions(int[] arr, int item) {
		int firstPosition = firstOccurence(arr, item);
		int lastPosition = lastOccurence(arr, item);
		
		return new int[]{firstPosition, lastPosition};
	}
	
	public static int firstOccurence(int[] arr, int item) {
		int start = 0;
		int end = arr.length-1;
		int result = -1;
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
			if(arr[mid] == item) {
				result = mid;
				end = mid - 1;
			}
			else if(arr[mid] < item) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return result;
	}
	public static int lastOccurence(int[] arr, int item) {
		int start = 0;
		int end = arr.length-1;
		int result = -1;
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
			if(arr[mid] == item) {
				result = mid;
				start = mid + 1;
			}
			else if(arr[mid] < item) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return result;
	}
	
	

}
