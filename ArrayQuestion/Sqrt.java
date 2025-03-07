package ArrayQuestion;
class Solution {
    public int mySqrtInBuild(int x) {
        return (int)Math.sqrt(x);
    }
    public boolean isPerfectSquare(int num) {
        int start=0,end=num;
        if(num < 2){
            return true;
        }
        while(start<=end){
            int mid = start+(end - start)/2;
            long sq = (long)mid * mid;
            if(sq == num){
                return true;
            }
            else if(sq < num){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return false;
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
