class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
           for (int[] row : image) {
            int left = 0;
            int right = row.length - 1;
            
            while (left <= right) {
                if (row[left] == row[right]) {
                    int flippedValue = row[left] ^ 1;
                    row[left] = flippedValue;
                    row[right] = flippedValue;
                }
                
                left++;
                right--;
            }
        }
        return image;
    }
}