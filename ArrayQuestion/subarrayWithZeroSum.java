package ArrayQuestion;
import java.util.HashSet;

class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
        // Your code here
        HashSet<Integer> set = new HashSet<>();
        
        int sum = 0;
        
         for(int num:arr){
             sum+=num;
            if(sum == 0 || set.contains(sum)){
                return true;
            }
            set.add(sum);
        }
        return false;
    }
}
class subarrayWithZeroSum{
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {4, 2, -3, 1, 6};
        System.out.println(Solution.findsum(arr));
    }
}