class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans =new int[nums.length*2];
        int count=0;
        for(int i=0;i<2;i++){
        for(int j=0;j<nums.length;j++){
            ans[count]=nums[j];
            count++;
        }
        }
        // for(int i=0;i<nums.length*2;i++){
        //     ans[i]=nums[i%nums.length];
        // }
        return ans;
    }
}