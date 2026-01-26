package leetcode;

public class Maximum69Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9669;
		System.out.println(maximum69Number_(n));

	}
	
	public static int maximum69Number_(int n) {
        char[] digits = Integer.toString(n).toCharArray();
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == '6') {
                digits[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(digits));
    }

}
