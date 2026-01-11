package leetcode;

import java.util.Arrays;

public class TwoSneakyNumbers {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] arr = {1, 3, 2, 3, 4, 2};

        int[] result = findSneakyNumbers(arr);

        System.out.println(result[0] + " " + result[1]);
    }
    
    public static int[] findSneakyNumbers(int[] arr) {
        Arrays.sort(arr);
        int[] ans = new int[2];
        int j = 0;

        for (int i = 1; i < arr.length && j < 2; i++) {
            if (arr[i] == arr[i - 1]) {
                ans[j] = arr[i];
                j++;
            }
        }

        return ans;
    }

}
