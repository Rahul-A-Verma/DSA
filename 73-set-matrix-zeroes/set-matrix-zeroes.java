class Solution {
    public void setZeroes(int[][] matrix) {
      int m = matrix.length;
        int n = matrix[0].length;
        
        // Extra storage arrays to remember zero positions
        boolean[] zeroRows = new boolean[m];
        boolean[] zeroCols = new boolean[n];
        
        // Step 1: First pass to identify all original zero positions
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (matrix[r][c] == 0) {
                    zeroRows[r] = true;
                    zeroCols[c] = true;
                }
            }
        }
        
        // Step 2: Second pass to apply the zeroes to the matrix
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                // If either the row or column was marked, change cell to 0
                if (zeroRows[r] || zeroCols[c]) {
                    matrix[r][c] = 0;
                }
            }
        }   
    }
}