class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] arr = new int[101];

        for(int i=0;i<logs.length;i++){
            arr[logs[i][0]-1950]++;
             arr[logs[i][1]-1950]--;
        }
        int max=0;
        int current=0;
        int year =0;

        for(int i=0;i<100;i++){
            current +=arr[i];
            if(current>max){
                max=current;
                year=i;
            }
        }
        return year +1950;
    }
}