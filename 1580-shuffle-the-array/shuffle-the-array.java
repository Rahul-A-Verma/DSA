class Solution {
    public int[] shuffle(int[] nums, int n) {
       int p1=nums[0];
      int p2=n+2;
       int[] ans= new int[2*n];
       for(int i=0;i<nums.length;i++){
        if(i%2==0){
            ans[i]=nums[i/2];
        }
        else{
             ans[i]=nums[n+(i/2)];
        }
       
        }
return ans;
    }
}