class Solution {
    public void BArecursion(int[] num, int start){
        if(start<num.length){
            int temp = num[num[start]];
            BArecursion(num, start+1);
            num[start]=temp;
        }
    }
    public int[] buildArray(int[] nums) {
       BArecursion(nums,0);
       return nums;
    }
}