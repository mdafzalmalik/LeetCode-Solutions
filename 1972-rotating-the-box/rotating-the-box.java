class Solution {

    public char[][] rotateTheBox(char[][] box) {
        int m = box.length;
        int n = box[0].length;

        char[][] result = rotate90(box, m, n);

        for (int j = 0; j < m; j++) {
            int spaceBottomRow = n - 1;
            for (int i = n - 1; i >= 0; i--) {

                if (result[i][j] == '*') {
                    spaceBottomRow = i - 1;
                }

                else if (result[i][j] == '#') {
                    result[i][j] = '.';
                    result[spaceBottomRow][j] = '#';
                    spaceBottomRow--;
                }
            }
        }

        return result;
    }

    public char[][] rotate90(char[][] box, int m, int n) {

        char[][] result = new char[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j] = box[j][i];
            }
        }

        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = m - 1;

            while (left < right) {
                char temp = result[i][left];
                result[i][left] = result[i][right];
                result[i][right] = temp;
                left++;
                right--;
            }
        }
        return result;
    }
}