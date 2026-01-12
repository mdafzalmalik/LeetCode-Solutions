package leetcode;

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "   fly me   to   the moon  ";
		System.out.println(lastWordLenght(s));

	}
	
	public static int lastWordLenght(String s) {
	    s = s.trim();
	    int len = 0;
	    int i = s.length() - 1;

	    while (i >= 0 && s.charAt(i) != ' ') {
	        len++;
	        i--;
	    }

	    return len;
	}


}
