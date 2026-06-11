class Solution {
    public int maximumWealth(int[][] accounts) {
        int custumerWealth=0;
        int maxWealth=0;
        int sum=0;
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            custumerWealth=sum;
            if(custumerWealth>maxWealth){
                maxWealth=custumerWealth;
            }
            sum=0;
        }
        return maxWealth;
    }
}