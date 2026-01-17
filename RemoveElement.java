package leetcode;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 2, 2, 3};
		int val = 3;
		System.out.println(removeElements(arr, val));

	}
	
	public static int removeElements(int[] arr, int val) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(val != arr[i]) {
				arr[count] = arr[i];
				count++;
			}
		}
		return count;
	}

}
