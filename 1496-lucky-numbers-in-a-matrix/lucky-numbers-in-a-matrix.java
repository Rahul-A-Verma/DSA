class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            int minCol = 0;

            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] < matrix[i][minCol]) {
                    minCol = j;
                }
            }

            boolean isLucky = true;

            for (int r = 0; r < rows; r++) {
                if (matrix[r][minCol] > matrix[i][minCol]) {
                    isLucky = false;
                    break;
                }
            }

            if (isLucky) {
                ans.add(matrix[i][minCol]);
            }
        }

        return ans;
    }
}