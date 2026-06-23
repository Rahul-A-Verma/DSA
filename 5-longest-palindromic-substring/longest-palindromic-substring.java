class Solution {
    public String longestPalindrome(String s) {
        String res="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(palin(s,i,j)){
                if((j-i+1)>res.length()){
                    res=s.substring(i,j+1);
                }
                }
            }
        }
        return res;
    }
    public boolean palin(String s, int l, int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
         return true;
    }
}