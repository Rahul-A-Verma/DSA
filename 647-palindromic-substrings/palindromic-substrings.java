class Solution {
    public int palin(String s, int l, int r){
        int count =0;
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            count++;
                l--;
                r++;
            }
            return count;
        }
    public int countSubstrings(String s) {
        int count = 0;
       
        for(int i=0;i<s.length();i++){
            int odd =palin(s, i ,i);
            int even=palin(s,i,i+1);
        
            count +=odd+even;

            
        }
        return count;
    }
}