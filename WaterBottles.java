package leetcode;

public class WaterBottles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numBottles = 15; 
		int numExchange = 4;
		System.out.println(numberOfWaterBottles(numBottles, numExchange));

	}
	
	public static int numberOfWaterBottles(int numBottles, int numExchange) {
		int ans = numBottles;
		while(numBottles >= numExchange) {
			int newBottles = numBottles / numExchange;
			
			int remBottles = numBottles % numExchange;
			
			ans = ans + newBottles;
			
			numBottles = newBottles + remBottles;
		}
		return ans;
	}

}

