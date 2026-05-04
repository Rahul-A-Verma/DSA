class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] result = new int[nums.length];
        // for(int i=0; i<nums.length; i++){
        //       int p = index[i];
        //     int v = nums[i];
        // for(int j=i;j>p;j--){
        //     result[j]=result[j-1];
        // }
        // result[p]=v;
        // }

        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            // ArrayList.add(index, value) handles the shifting automatically
            list.add(index[i], nums[i]);
        }
        
        // Convert the ArrayList back to a primitive int array
        for (int i = 0; i < nums.length; i++) {
            result[i] = list.get(i);
        }
        
        
        return result;
    }
}