class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] matrix = new int[r][c];
        int[] arr = new int[r*c];

        if(mat.length*mat[0].length!=r*c){
            return mat;
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
              arr[(i*mat[i].length)+j]=mat[i][j];
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=arr[(i*c)+j];
            }
        }
       
        return matrix;
    }
}