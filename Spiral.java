package leetcode;


public class Spiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
			    {1, 2, 3, 4},
			    {5, 6, 7, 8},
			    {9, 10, 11, 12},
			    {13, 14, 15, 16}
			};
		printSpiral(arr);

	}
	
	public static void printSpiral(int[][] arr) {
		int minR = 0;
		int minC = 0;
		int maxR = arr.length-1;
		int maxC = arr[0].length-1;
		int te = arr.length * arr[0].length; // total no. of elements
		int c = 0;
		
//		while(minR <= maxR && minC <= maxC) or 
		
		while(c < te) {
			for(int i = minC; i <= maxC && c < te; i++) {
				System.out.print(arr[minR][i] + " ");
				c++;
			}
			minR++;
			
			for (int i = minR; i <= maxR && c < te; i++) {
				System.out.print(arr[i][maxC] + " ");
				c++;
			}
			maxC--;
			
			for (int i = maxC; i >= minC && c < te; i--) {
				System.out.print(arr[maxR][i] + " ");
				c++;
			}
			maxR--;
			
			for (int i = maxR; i >= minR && c < te; i--) {
				System.out.print(arr[i][minC] + " ");
				c++;
			}
			minC++;
		}
		
		
	}

}
