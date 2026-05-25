class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
    
           List<Integer> minarr = new ArrayList<>();
           List<Integer> maxarr = new ArrayList<>();

        for(int i=0;i<matrix.length;i++){
               int min=Integer.MAX_VALUE;
            for(int j=0;j<matrix[0].length;j++){
               if(matrix[i][j]<min){
                min=matrix[i][j];
               }
            }
            minarr.add(min);
        }
         for(int i=0;i<matrix[0].length;i++){
               int max=0;
            for(int j=0;j<matrix.length;j++){
               if(matrix[j][i]>max){
                max=matrix[j][i];
               }
            }
            maxarr.add(max);
        }
            minarr.retainAll(maxarr); 
        return minarr;

    }
}