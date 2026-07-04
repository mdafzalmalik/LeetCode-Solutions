package leetcode;

public class WeightedWordMapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = { "abcd", "def", "xyz" };
		int[] weights = { 5, 3, 12, 14, 1, 2, 3, 2, 10, 6, 6, 9, 7, 8, 7, 10, 8, 9, 6, 9, 9, 8, 3, 7, 7, 2 };
		String ans = getAnswer(words, weights);
        System.out.println(ans);

	}
	
	public static String getAnswer(String[] words, int[] weights) {
        String ans = "";

        for (int i = 0; i < words.length; i++) {
            int weight = weightedSum(words[i], weights);
            int mod = weight % 26;
            char ansChar = (char) ('z' - mod);
            ans += ansChar;
        }

        return ans;
    }

	public static int weightedSum(String str, int[] arr) {
		int sum = 0;
		int i = 0;
		while (i < str.length()) {
			char ch = str.charAt(i);
			sum += arr[ch-'a'];
			i++;
		}
		return sum;
	}

}
