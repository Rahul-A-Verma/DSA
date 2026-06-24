class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currentCount = 0;
        int j=0;
      while(j<nums.length){
        if(nums[j]==1){
            j++;
            currentCount++;
        }
        else{
            maxCount=Math.max(maxCount,currentCount);
            j++;
            currentCount=0;
        }
      
      }
        return Math.max(maxCount,currentCount);
    }
}