package leetcode;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 126843321;
		System.out.println(isPalindrome_(n));

	}
	
	public static boolean isPalindrome_(int n) {
		String s = Integer.toString(n);
		int len = s.length();
		int i = 0;
		while(i < len/2) {
			if(s.charAt(i) != s.charAt(len-i-1)) {
				return false;
			}
			i++;
		}
		return true;
	}

}
