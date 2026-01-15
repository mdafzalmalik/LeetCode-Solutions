package leetcode;

public class DetectCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "USA";
		System.out.println(isCapitalCorrect(s));
		System.out.println(isCapitalCorrect("FlaG"));
		System.out.println(isCapitalCorrect("Google"));
		System.out.println(isCapitalCorrect("leetcode"));
	}

	public static boolean isCapitalCorrect(String s) {
		if(s.equals(s.toUpperCase())) {
			return true;
		}
		if(s.equals(s.toLowerCase())) {
			return true;
		}
		String first = s.substring(0, 1);
		String rest = s.substring(1);
		if (first.equals(first.toUpperCase()) && rest.equals(rest.toLowerCase())) {
			return true;
		}
		return false;
	}
}
