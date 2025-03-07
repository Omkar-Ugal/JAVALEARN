package ArrayQuestion;
class Solution {
    public int mySqrtInBuild(int x) {
        return (int)Math.sqrt(x);
    }
    public int mySqrt(int x) {
        if(x == 0){
            return 0;
        }
        int left = 1,right = x;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(mid == x /mid){
                return mid;
            }
            else if(mid < x /mid){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return right;
    }
}
public class Sqrt {
   public static void main(String[] args) {
    Solution sol = new Solution();
    sol.mySqrt(100);
   } 
}
