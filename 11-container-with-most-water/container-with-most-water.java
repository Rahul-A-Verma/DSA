class Solution {
    public int maxArea(int[] height) {
        int maxa=0;
        int left = 0;
        int right = height.length-1;

        while(left<right){
            int minH = Math.min(height[left],height[right]);
            int w = right-left;
            int area = minH*w;
            maxa = Math.max(maxa,area);
            if(height[left]<=height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxa;
    }
}