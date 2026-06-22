class Solution {
    public int trap(int[] height) {
        int left =0;
        int right = height.length-1;
        int water = 0;
        int maxLH=height[left];
        int maxRH=height[right];
        while(left<right){
            if(maxLH < maxRH){
                left++;
                maxLH=Math.max(maxLH,height[left]);
                water += maxLH -height[left];
            }
            else{
                right--;
                maxRH=Math.max(maxRH,height[right]);
                water += maxRH -height[right];
            }
        }
        return water;
    }
}