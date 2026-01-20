package leetcode;

public class FirstUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "leetcode";
		System.out.println(uniqueCharIndex(s));

	}
	
	public static int uniqueCharIndex(String s) {
		int[] count = new int[26];
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			count[ch-'a']++;
		}
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(count[ch-'a'] == 1) {
				return i;
			}
		}
		return -1;
	}

}
