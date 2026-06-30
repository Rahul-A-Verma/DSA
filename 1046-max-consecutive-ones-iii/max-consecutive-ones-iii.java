class Solution {
    public int longestOnes(int[] nums, int k) {
        int count=0;
        int l=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }
            if(count>k){
                if(nums[l]==0){
                    count--;
                }
                l++;
            }
           
        }
    return nums.length-l;
}

}