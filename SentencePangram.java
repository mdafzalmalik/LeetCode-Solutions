package leetcode;

public class SentencePangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sen = "thequickbrownfoxjumpsoverthelazydog";
		
		System.out.println(isPangramSentence(sen));

	}
	
	public static boolean isPangramSentence(String sen) {
        boolean[] letters = new boolean[26];

        for (int i = 0; i < sen.length(); i++) {
            char ch = sen.charAt(i);
            letters[ch - 'a'] = true;
        }

        for (int i = 0; i < 26; i++) {
            if (!letters[i]) {
                return false;
            }
        }

        return true;
    }

}
