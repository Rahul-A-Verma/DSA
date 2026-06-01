class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0;
        int r = letters.length-1;
        int result =-1;
        while(l<=r){
            int m=(l+r)/2;

            if(letters[m]>target){
                result=m; 
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        if(result==-1){
            return letters[0];
        }

           return letters[result];
        
    }
}