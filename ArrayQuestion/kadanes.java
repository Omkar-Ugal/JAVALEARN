package ArrayQuestion;

class Solution {
    int maxSubarraySum(int[] arr) {
        // Your code here
         int sum = 0;
        int maxsum = Integer.MIN_VALUE;  // Use Integer.MIN_VALUE for more accurate initialization
        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];  // Add current element to sum

            if (sum < arr[i]) {
                sum = arr[i];  // If sum goes negative, reset it to 0
            }

            maxsum = Math.max(maxsum, sum);  // Update maxsum to be the largest value
        }

        return maxsum;  // 
    }
}

public class kadanes {
    public static void main(String[] args) {
        
    }
}
