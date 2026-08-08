class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int maxA= 0;
        while(l<r){
            int h = Math.min(height[l],height[r]);
            int w = r-l;
            int a = h*w;
            maxA = Math.max(maxA,a);
             if(height[l]<=height[r]){
            l++;
        }
        else{
            r--;
        }
        }
       
        return maxA;
    }

}