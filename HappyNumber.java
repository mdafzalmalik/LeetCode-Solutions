package leetcode;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 19;
		System.out.println(isHappyNo(n));

	}
	
	public static boolean isHappyNo(int n) {
		while(n != 1 && n != 4) {
			// 4 is smallest unhappy no
			n = getSumOfSquares(n);
		}
		return n == 1;
		
	}
	
	public static int getSumOfSquares(int n) {
		int sum = 0;
		while(n > 0) {
			int digit = n % 10;
			sum += digit * digit;
			n = n / 10;
		}
		return sum;
	}

}
