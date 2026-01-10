package leetcode;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "()[]{}";
		
		boolean isValid = checkValidBrackets(s);
		System.out.println(isValid);
	}
	
	public static boolean checkValidBrackets(String s) {
        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        }
        return s.length() == 0;
    }

}
