class Solution {
 public static int[][] transpose(int[][] matrix) {
    for(int i=0;i<matrix.length;i++){
        for(int j=i;j<matrix[i].length;j++){
            int temp = matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
        }
    }
    Collections.reverse(Arrays.asList(matrix));
        return matrix;
    }

    public boolean findRotation(int[][] mat, int[][] target) {
      
       
        for(int c=0;c<4;c++){
         boolean flag = true;
            for(int i=0;i<mat.length;i++){
                for(int j=0;j<mat[i].length;j++){
                    if(mat[i][j]!= target[i][j]){
                        flag=false;
                        break;
                    }
                }
                if(!flag){
                    break;
                }
            }
            if(flag){
               return true; 
            }
            mat = transpose(mat);
        }
        return false;
    }
}