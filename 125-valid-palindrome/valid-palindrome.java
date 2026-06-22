class Solution {
    public boolean isAlphaNum(char c){
        return (c>='a' && c<='z') || (c>='A' && c<='Z') || (c>='0' && c<='9');
    }
    public boolean isPalindrome(String s) {
        int l=0;
        int r =s.length()-1;
        while(l<r){
            if(!isAlphaNum(s.charAt(l))){
                l++;
            }
            else if(!isAlphaNum(s.charAt(r))){
                r--;
            }
            else{
                 if(Character.toLowerCase(s.charAt(l))==Character.toLowerCase(s.charAt(r))){
                l++;
                r--;
            }
                 else{
                     return false;
                 }
            }
        }
        return true;
    }
}