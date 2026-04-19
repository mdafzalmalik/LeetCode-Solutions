class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq = new int[26];
        for(int i = 0; i < s1.length(); i++){
            freq[s1.charAt(i)-'a']++;
        }

        for(int i = 0; i < s2.length(); i++){
            int wIdx = 0;
            int idx = i;
            int[] wFreq = new int[26];
            while(wIdx < s1.length() && idx < s2.length()){
                wFreq[s2.charAt(idx)-'a']++;
                wIdx++;
                idx++;
            }

            if(isSame(freq, wFreq)){
                return true;
            }
        }
        return false;
    }
    public static boolean isSame(int[] freq, int[] wFreq){
        for(int i = 0; i < freq.length; i++){
            if(freq[i] != wFreq[i]){
                return false;
            }
        }
        return true;
    }

}