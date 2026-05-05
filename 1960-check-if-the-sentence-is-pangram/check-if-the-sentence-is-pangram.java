class Solution {
    public boolean checkIfPangram(String sentence) {
       int count=0;
        if(sentence.length()<26){
            return false;
        }
         for(int j=97;j<123;j++){
            if(sentence.contains(String.valueOf((char)j))){
                count++;
            }
           }
         if(count==26){
            return true;
         }
         else{
            return false;
            }
    }
}