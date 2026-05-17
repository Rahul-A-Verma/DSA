class Solution {
    public int largestAltitude(int[] gain) {
        int Current=0;
        int max=0;
        for(int i=0;i<gain.length;i++ ){
            Current+= gain[i];
             if (Current > max) {
                max = Current;
            }
        }
        return max;
    }
}