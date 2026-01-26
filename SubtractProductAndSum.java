package leetcode;

public class SubtractProductAndSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4421;
		System.out.println(subtractTheProductAndSum(n));

	}
	
	public static int subtractTheProductAndSum(int n) {
		n = Math.abs(n);
		int sum = 0;
		int product = 1;
		while(n > 0) {
			int digit = n % 10;
			sum += digit;
			product *= digit;
			n = n / 10;
		}
		
		return product - sum;
	}

}
