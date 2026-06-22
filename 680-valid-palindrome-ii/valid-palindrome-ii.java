class Solution {
    public boolean validPalindrome(String s) {
        int l=0;
        int r =s.length()-1;
        while(l<r){
            if(s.charAt(l)==s.charAt(r)){
                l++;
                r--;
            }
            else{
                int l1=l+1;
                int r1=r;
                boolean flag1=true;
                while(l1<=r1){
                    if(s.charAt(l1)!=s.charAt(r1)){
                       flag1=false;
                    }
                    l1++;
                    r1--;
                }
                boolean flag2=true;
                int l2=l;
                int r2=r-1;
                 while(l2<=r2){
                    if(s.charAt(l2)!=s.charAt(r2)){
                       flag2=false;
                    }
                    l2++;
                    r2--;
                }
               
                return flag1 || flag2;
                
            }
        }
        return true;
    }
}
 