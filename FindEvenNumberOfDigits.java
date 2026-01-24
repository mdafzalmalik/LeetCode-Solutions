package leetcode;

public class FindEvenNumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,345,2,6,7896};
		System.out.println(countEvenDigitNumbers(arr));
	}
	
	public static int countEvenDigitNumbers(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            String s = Integer.toString(arr[i]);

            if (s.length() % 2 == 0) {
                count++;
            }
        }

        return count;
    }

}
