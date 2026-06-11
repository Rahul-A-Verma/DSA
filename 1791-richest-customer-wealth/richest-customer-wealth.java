class Solution {
    public int maximumWealth(int[][] accounts) {
        int custumerWealth=0;
        int maxWealth=0;

        for(int i=0;i<accounts.length;i++){
             custumerWealth=0;
            for(int j=0;j<accounts[i].length;j++){
                custumerWealth+=accounts[i][j];
            }
            if(custumerWealth>maxWealth){
                maxWealth=custumerWealth;
            }
           
        }
        return maxWealth;
    }
}