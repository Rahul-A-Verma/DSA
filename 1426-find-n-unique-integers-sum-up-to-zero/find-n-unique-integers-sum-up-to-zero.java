class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int element =1;
        int i=0;

        while(i+1<n){
              arr[i]=element;
              arr[i+1]=-element;
              i+=2;
              element++;
    
        }
        return arr;
    }
}