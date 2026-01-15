package leetcode;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
	            {1, 2, 3},
	            {4, 5, 6}
	        };

	        int[][] transposed = transposeMatrix(matrix);

	        for (int i = 0; i < transposed.length; i++) {
	            for (int j = 0; j < transposed[i].length; j++) {
	                System.out.print(transposed[i][j] + " ");
	            }
	            System.out.println();
	        }

	}
	
	public static int[][] transposeMatrix(int[][] matrix) {
	    int m = matrix.length;
	    int n = matrix[0].length;
	    int[][] result = new int[n][m];

	    for (int i = 0; i < m; i++) {
	        for (int j = 0; j < n; j++) {
	            result[j][i] = matrix[i][j];
	        }
	    }

	    return result;
	}


}
