class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
    
           List<Integer> arr = new ArrayList<>();
          
          for(int i=0;i<matrix.length;i++){
            int mincol=0;

            for(int j=1;j<matrix[i].length;j++){
                if(matrix[i][j]<matrix[i][mincol]){
                    mincol=j;
                }
            }

            boolean lucky = true;

            for(int r=0;r<matrix.length;r++){
                if(matrix[r][mincol]>matrix[i][mincol]){
                    lucky=false;
                    break;
                }
            }

            if(lucky){
                arr.add(matrix[i][mincol]);
            }


          }
          return arr;

    }
}