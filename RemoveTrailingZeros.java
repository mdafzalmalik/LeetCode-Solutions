package leetcode;

public class RemoveTrailingZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "51230100";
		
		System.out.println(removeTrailingZerosFromString(s));

	}
	
	public static String removeTrailingZerosFromString(String s) {
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == '0') {
            i--;  
        }
        return s.substring(0, i + 1);  
    }

}
