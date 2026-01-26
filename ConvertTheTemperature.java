package leetcode;

public class ConvertTheTemperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double celsius = 36.50;
		double[] ans = convertTheTemperature(celsius);
		
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}
	
	 public static double[] convertTheTemperature(double celsius) {
	        double kelvin = celsius + 273.15;
	        double fahrenheit = celsius * 1.80 + 32.00;

	        return new double[] { kelvin, fahrenheit };
	    }

}
