package leetcode;

import java.util.Arrays;

public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,1};
		System.out.println(isDuplicateUsingArraySort(arr));

	}
	
	public static boolean isContainDuplicate(int[] arr) {
		int i = 0;
		int j = i+1;
		while(i < arr.length) {
			if(j == arr.length) {
				i++;
				j = i+1;
			} 
			else if(arr[i] == arr[j]) {
				return true;
			} else {
				j++;
			}
		}
		return false;
	}
	
	public static boolean isDuplicateUsingArraySort(int[] arr) {
		Arrays.sort(arr);
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] == arr[i-1]) {
				return true;
			}
		}
		return false;
	}

}
