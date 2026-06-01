class Solution {
    public int arrangeCoins(int n) {
        long left = 1;
        long right=n;

        while(left<=right){
            long mid = (left+right)/2;
            if((mid*(mid+1)/2)==n){
                return (int)mid;
            }
            else if((mid*(mid+1)/2)<n){
                left=mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return (int)right;
    }
}