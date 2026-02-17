class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        return getAnswer(words, weights);
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