package leetcode;

public class FinalValueAfterPerformingOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] opera = {"--X","X++","X++"};
		System.out.println(finalValue(opera));

	}
	
	public static int finalValue(String[] opera) {
        int x = 0;

        for (int i = 0; i < opera.length; i++) {
            if (opera[i].contains("+")) {
                x++;
            } else {
                x--;
            }
        }

        return x;
    }

}
