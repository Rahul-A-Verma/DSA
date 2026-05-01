class Solution {
    public int maximumWealth(int[][] accounts) {
        int MaxW=0;
        for(int i=0;i<accounts.length;i++){
             int currenW=0;
            for(int j=0;j<accounts[i].length;j++){
                currenW+=accounts[i][j];
            }
            if(currenW>MaxW){
                MaxW=currenW;
    
            }
          
        }
        return MaxW;
    }
}