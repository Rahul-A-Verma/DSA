class Solution {
    public boolean isPalindrome(String s) {
        int l=0;
        int r=s.length()-1;

        while(l<r){
            // if(!isChar(s.charAt(l))){
            if(!Character.isLetterOrDigit(s.charAt(l))){
                l++;
            }
            // else if(!isChar(s.charAt(r))){
            else if(!Character.isLetterOrDigit(s.charAt(r))){
                r--;
            }
            else{
                // if(isCase(s.charAt(l))==isCase(s.charAt(r))){
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

    // public static boolean isChar(char ch){
    //     if((ch>='A'&& ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9')) {
    //         return true;
    //     }
    //     else{
    //         return false;
    //     }
    // }
    //  public static char isCase(char ch){
    //     if (ch >= 'A' && ch <= 'Z') {
    //     return (char) (ch + 32); 
    // }
    // return ch;
       
    //  }
}