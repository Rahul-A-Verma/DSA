class Solution {
    public int maximumPopulation(int[][] logs) {
    
    int[] arr = new int[101];
    int current=0;
    int max=0;
    int year=0;
    
    for(int[] i : logs){
        arr[i[0]-1950]++;
        arr[i[1]-1950]--;
    }

    for(int i=0;i<arr.length;i++){
     
        current += arr[i];
        if(current>max){
            max=current;
            year=i;
        }
        
       
        
    }
    return year+1950;

    }
}