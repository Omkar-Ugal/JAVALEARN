package ArrayQuestion;

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        if(n == 0 || k == 0) return;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    public void reverse(int[] nums,int start,int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public void printArr(int[] nums,int k){
        rotate(nums, k);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}

class RotateArray {
     public static void main(String[] args) {
        Solution so = new Solution();
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;

        so.printArr(arr, k);
     }
}