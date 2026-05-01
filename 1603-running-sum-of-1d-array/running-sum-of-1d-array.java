class Solution {
    public int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        int sum=nums[0];
        for(int i=0;i<nums.length;i++){
            ans[i]=sum;
            if(i+1==nums.length)break;
            sum+=nums[i+1];
        }
        return ans;
    }
}