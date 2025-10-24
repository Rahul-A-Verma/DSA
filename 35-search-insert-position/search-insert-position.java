class Solution {
    public int searchInsert(int[] nums, int target) {
        
        
        //----------------------------------- Brute force method------------------------------------------
    
    /* 
    This Solution: Linear Search (O(n))
    The first solution uses a linear search (a simple for loop) to check every element starting from the beginning.
    In the worst-case scenario (when target is the largest number or doesn't exist and needs to be placed at the very end), the loop has to iterate through all n elements.
    This means the time taken grows directly in proportion to the size of the input array (n). This is inefficient for large arrays.*/

        
        // for(int i=0; i<nums.length;i++){
        //     if(nums[i]>=target){
        //         return i;
        //     }
    
           
        // }
        // return nums.length;


        // ----------------------------------- optimized solution-----------------------------------------
    /*
    This solution solution uses binary search. This algorithm works because the input array nums is sorted.
    Binary search repeatedly divides the search interval in half.
    In each step, it eliminates half of the remaining elements.
    This makes the search time grow logarithmically with the size of the input. For an array of size n, the number of operations is roughly log₂(n).*/

        
        int left =0;
        int right = nums.length-1;
        while(left<=right){
        int mid = left+(right-left)/2;

        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]>target){
            right= mid-1;
        }
        else{
            left= mid+1;
        }
      }
      return left;


    }
}

/*

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
 

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
-104 <= target <= 104*/
