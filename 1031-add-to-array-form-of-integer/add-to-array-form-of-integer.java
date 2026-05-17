class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> arr = new ArrayList<>();

        int pointer = num.length-1;
        int carry=0;
        int sum=0;
        while(pointer>=0||k>0){
            int newp=0;
            int d=k%10;
            if(pointer>=0){
                 newp=num[pointer];
            }
           
            sum= newp+d+carry;
            carry=sum/10;
            int digit=sum%10;
            arr.add(digit);
            pointer--;
            k=k/10;
        }
        if(carry>0){
                arr.add(carry);
            }
            Collections.reverse(arr);
      return arr;

    }
}