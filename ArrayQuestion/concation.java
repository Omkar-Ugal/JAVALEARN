package ArrayQuestion;

// class Solution {
//     public int[] getConcatenation(int[] nums) {
//         int array[]=new int[2*nums.length];
//         System.arraycopy(nums,0,array,0,nums.length);
//         System.arraycopy(nums,0,array,nums.length,nums.length);
//         return array;
//     }
// } 
class solution{
    public int[] concanate(int[] arr){
        int[] ans = new int[arr.length*2];
        for(int i=0;i<arr.length;i++){
            ans[i] = arr[i];
            ans[i+arr.length] = arr[i];
        }
        return ans;
    }
}
public class concation {
public static void main(String[] args) {
    solution sol = new solution();
    int[] arr = {1,2,3};
    int[] result = sol.concanate(arr);
    for(int i = 0;i<result.length;i++){
        System.out.print(result[i]+" ");
    }
  }
}