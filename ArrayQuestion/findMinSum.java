package ArrayQuestion;

import java.util.Arrays;

class solution{
    public long minSum(int[] A,int[] B,int n){
        Arrays.sort(A);
        Arrays.sort(B);
        long sum = 0;
        for(int i=0;i<n;i++){
            sum+=Math.abs(A[i] - B[i]);
        }
        return sum;
    }
}
public class findMinSum {
    public static void main(String[] args) {
        int[] A = {1,2,3};
        int[] B = {1,3,4};

        solution sol = new solution();
       System.out.println(sol.minSum(A, B, 3)); 
    }
}
