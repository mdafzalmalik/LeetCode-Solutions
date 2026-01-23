package leetcode;

public class AddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 38;
		System.out.println(addDigits_(num));
	}
	
	public static int addDigits_(int num) {
        while (num >= 10) {  
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }


}
