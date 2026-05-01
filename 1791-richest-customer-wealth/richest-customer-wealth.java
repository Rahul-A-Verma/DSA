class Solution {
    public int maximumWealth(int[][] accounts) {
       int sum=0;
        int sum2=0;
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            if(sum>sum2){
                sum2=sum;
                sum=0;
            }
            else{
                sum=0;
            }
          
        }
        return sum2;
    }
}