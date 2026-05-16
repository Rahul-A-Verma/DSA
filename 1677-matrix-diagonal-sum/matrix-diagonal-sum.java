class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int mid = mat.length / 2;
        for(int i=0;i<mat.length;i++){
               sum+=mat[i][i];
               sum+= mat[i][mat.length-1-i];
            }
            if(mat.length%2!=0){
                sum-=mat[mid][mid];
            }
                return sum;
        
    }
}