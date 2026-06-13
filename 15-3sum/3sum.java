class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        
        for (int i = 0; i < n - 2; i++) {
            if (nums[i] > 0) break; 
            
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            Set<Integer> seen = new HashSet<>();
            
            for (int j = i + 1; j < n; j++) {
                int required = -nums[i] - nums[j];
                
                if (seen.contains(required)) {
                    result.add(Arrays.asList(nums[i], required, nums[j]));
                    
                    while (j + 1 < n && nums[j] == nums[j + 1]) {
                        j++;
                    }
                }
                
                seen.add(nums[j]);
            }
        }
        
        return result;
    }
}