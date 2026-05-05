class Solution {
    public int findNumbers(int[] nums) {
        int flag=0;
        for(int n : nums){
            int count=0;
            while(n!=0){
                int digit= n%10;
                count++;
                n/=10;
            }
            if(count%2==0){
                flag++;
            }
        }
        return flag;
    }
}