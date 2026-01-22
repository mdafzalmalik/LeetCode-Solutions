package leetcode;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits = {1,2,3};
		
		int[] result = plusOne_(digits);

	    for (int i = 0; i < result.length; i++) {
	        System.out.print(result[i] + " ");
	    }

	}
	
	public static int[] plusOne_(int[] digits) {
		for (int i = digits.length-1; i >= 0; i--) {
			if(digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
			
		}
		
		int[] ans = new int[digits.length + 1];
	    ans[0] = 1;
	    return ans;
	}

}
