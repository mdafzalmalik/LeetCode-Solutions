package leetcode;

public class FindPeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,1};
		int peakIndex = findPeakElementBinary(arr);
	    System.out.println(peakIndex); 
	}
	
	public static int findPeakElementLinear(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if((i == 0 || arr[i-1] < arr[i]) && (i == arr.length-1 || arr[i] > arr[i+1])) {
				return i;
			}
		}
		return -1;
	}
	
	public static int findPeakElementBinary(int[] arr) {
		int n = arr.length;
		if(n == 1) return 0;
		if(arr[0] > arr[1]) return 0;
		if(arr[n-1] > arr[n-2]) return n-1;
		
		int start = 1;
		int end = n-2;
		while(start <= end) {
			int mid = start + (end - start) / 2;
			if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) {
				return mid;
			}
			else if(arr[mid] > arr[mid-1]) {
				start = mid + 1;
			} 
			else {
				end = mid - 1;
			}
		}
		return -1;
	}

}
