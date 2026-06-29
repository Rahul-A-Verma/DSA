class Solution {
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){

            int odd = palin(s,i,i);
            int even = palin(s,i,i+1);
            count += odd+even;
            // int l=i;
            // int r=i;
            // while(l<=r && l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            //     count++;
            //     l--;
            //     r++;
            // }
            // int l2=i;
            // int r2=i+1;
            // while(l2<=r2 && l2>=0 && r2<s.length() && s.charAt(l2)==s.charAt(r2)){
            //     count++;
            //     l2--;
            //     r2++;
            // }
            
        }      
        return count;
    }
    public static int palin(String s, int l, int r){
        int count=0;
           while(l<=r && l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                count++;
                l--;
                r++;
            }
            return count;
    }
}