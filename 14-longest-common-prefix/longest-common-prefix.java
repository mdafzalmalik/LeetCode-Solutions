import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        return longestPrefix(strs);
    }
    static String longestPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        Arrays.sort(strs, Comparator.comparingInt(String::length));

        StringBuilder result = new StringBuilder();
        String s = strs[0];

        for (int i = 0; i < s.length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (s.charAt(i) != strs[j].charAt(i)) {
                    return result.toString();
                }
            }
            result.append(s.charAt(i));
        }

        return result.toString();
    }
}