class Solution {
    public boolean removeOne(int l, int r, String s ){
                while(l<=r){
                    if(s.charAt(l)!=s.charAt(r)){
                       return false;
                    }
                    l++;
                    r--;
                }
                return true;
    }
    public boolean validPalindrome(String s) {
        int l=0;
        int r =s.length()-1;
        while(l<r){
            if(s.charAt(l)==s.charAt(r)){
                l++;
                r--;
            }
            else{
               return removeOne(l+1,r,s) || removeOne(l,r-1,s);
            }
        }
        return true;
    }
}
 