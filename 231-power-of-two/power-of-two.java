class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0)return false;
        while(n%2==0){
            n=n/2;
        }
        if(n==1 ){
            return true;
        }
        else{
            return false;
        }
    }
}
/*

Example 1:

Input: n = 1
Output: true
Explanation: 20 = 1
Example 2:

Input: n = 16
Output: true
Explanation: 24 = 16
Example 3:

Input: n = 3
Output: false
 

Constraints:

-231 <= n <= 231 - 1
 

Follow up: Could you solve it without loops/recursion?*/
