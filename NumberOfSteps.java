package leetcode;

public class NumberOfSteps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 14;
		System.out.println(CountNumberOfSteps(num));

	}
	
	public static int CountNumberOfSteps(int num) {
		int step = 0;
		while(num > 0) {
			if(num % 2 == 0) {
				num = num / 2;
				step += 1;
			}else {
				num -= 1;
				step += 1;
			}
		}
		return step;
	}

}
