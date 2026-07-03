class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int ans=Integer.MAX_VALUE;
        int left=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
               int len=i-left+1;
               ans=Math.min(ans,len);
               sum-=nums[left];
               left++;
            }
           }
           
           return  ans == Integer.MAX_VALUE ? 0 : ans;
    }
}