class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int sum=0;
        while(x>0){
            int reminder = x%10;
            sum = sum * 10 + reminder;
            x=x/10;
        }
        if(sum == n){
             return true;
             }
        else{
             return false;
        }
    }
}