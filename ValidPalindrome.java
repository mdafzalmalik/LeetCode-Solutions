package leetcode;

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome_(s));
	}
	
	public static boolean isPalindrome_(String s) {

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int len = s.length();
        int i = 0;

        while (i < len / 2) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
            i++;
        }

        return true;
    }

}
