package leetcode;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 5;
	     String[] result = fizzBuzz(n);
	     
	     for (int i = 0; i < result.length; i++) {
	            System.out.println(result[i]);
	        }

	}
	
	public static String[] fizzBuzz(int n) {
        String[] answer = new String[n];

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                answer[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                answer[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                answer[i - 1] = "Buzz";
            } else {
                answer[i - 1] = String.valueOf(i);
            }
        }

        return answer;
    }

}
