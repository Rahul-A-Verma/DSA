class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // for(int i=0;i<numbers.length-1;i++){
        //     for(int j=i+1;j<numbers.length;j++){
        //         if(numbers[i]+numbers[j]==target){
        //             return new int[]{i + 1, j + 1};
        //         }
        //     }
        // }
        // return new int[]{-1,-1};

        // HashMap <Integer, Integer> map = new HashMap<>();
        // for(int i=0;i<numbers.length;i++){
          
        //     int key = target-numbers[i];
        //     if(map.containsKey(key)){
        //         return new int[] { map.get(key), i + 1 };
        //     }
        //       map.put(numbers[i],i+1);
        // }
        //   return new int[] {};

        int l=0;
        int r=numbers.length-1;
        while(l<r){
           
            if(numbers[l]+numbers[r]==target){
                return new int[]{l + 1, r + 1};
            }
            else if(numbers[l]+numbers[r]>target){
                r--;
            }
            else{
                l++;
            }
        }
        return new int[]{};
    }
}