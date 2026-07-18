class Solution {
    public int removeDuplicates(int[] nums) {
        int p = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[p]!=nums[i]){
                p++;
                nums[p]=nums[i];
            }
            
           
        } return p+1;
        // int unique=1;
        // int off=0;
        // while(p<nums.length){
        //     if(nums[p]==nums[p-1]){
        //         p++;
        //         continue;
        //     }
        //     unique++;
        //     nums[++off]=nums[p];
        //     p++;
        // }
        // return unique;
    }
}