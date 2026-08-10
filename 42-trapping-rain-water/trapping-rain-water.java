class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int water=0;
        int maxL=height[l];
        int maxR=height[r];
        while(l<r){
            if(maxL>maxR){
                r--;
                maxR=Math.max(maxR,height[r]);
                water+= maxR-height[r];

            }
            else{
                 l++;
                maxL=Math.max(maxL,height[l]);
                water+= maxL-height[l];
            }
        }
        return water;
    }
}