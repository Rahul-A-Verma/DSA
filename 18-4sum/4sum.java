class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
      int n = nums.length;
        Set<List<Integer>> uniqueQuadruplets = new HashSet<>();
        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                Set<Long> lookingFor = new HashSet<>();
                for (int k = j + 1; k < n; k++) {
                    long currentSum = (long) nums[i] + nums[j] + nums[k];
                    long remaining = target - currentSum;

                    if (lookingFor.contains(remaining)) {
                        List<Integer> quad = Arrays.asList(nums[i], nums[j], (int) remaining, nums[k]);
                        uniqueQuadruplets.add(quad);
                    }
                    lookingFor.add((long) nums[k]);
                }
            }
        }
        return new ArrayList<>(uniqueQuadruplets);

    }
}