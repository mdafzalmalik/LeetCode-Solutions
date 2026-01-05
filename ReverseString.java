package leetcode;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] s = {'h', 'e', 'l', 'l', 'o'};
		reverseCharArray(s);
		
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}

	}
	
	public static void reverseCharArray(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

}
