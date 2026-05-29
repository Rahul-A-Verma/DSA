class Solution {
    public int mySqrt(int x) {
        long result=0;
        long low=1;
        long high=x;

        while(low<=high){
          long mid=(low+high)/2;

            if(mid*mid<=x){
                result=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
    
      return (int)result;
    }
}