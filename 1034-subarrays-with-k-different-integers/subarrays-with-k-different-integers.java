class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return helper(nums,k)-helper(nums,k-1);
    }
    public int helper(int[] nums, int k){

        int l=0;
        int count=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

            while(map.size()>k){
                map.put(nums[l],map.get(nums[l])-1);
                 if(map.get(nums[l])==0){
                    map.remove(nums[l]);
                }
                l++;
               
            }
            count+=i-l+1;
    }
    return count;
    }
}