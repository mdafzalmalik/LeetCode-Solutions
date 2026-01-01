package leetcode;

public class ValidAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "afzal";
		String s2 = "lalaz";
		
		System.out.println(isAnagram(s1, s2));

	}
	
	public static boolean isAnagram(String s1, String s2) {
	    s1 = s1.toLowerCase().replaceAll("[^a-z]", "");
	    s2 = s2.toLowerCase().replaceAll("[^a-z]", "");
		if(s1.length() != s2.length()) {
			return false;
		}
		
		int[] freq = new int[26];
		for(int i = 0; i < s1.length(); i++) {
			freq[s1.charAt(i)-'a']++;
			freq[s2.charAt(i)-'a']--;
		}
		
		for(int i = 0; i < freq.length; i++) {
			if(freq[i] != 0) {
				return false;
			}
		}
		return true;
	}

}
