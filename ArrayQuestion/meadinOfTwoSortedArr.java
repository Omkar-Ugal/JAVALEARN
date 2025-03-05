package ArrayQuestion;

import java.util.Arrays;

class Solution {
    // public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    //     int n1=nums1.length;
    //     int n2=nums2.length;
    //     int n=n1+n2;
    //     int ind2=n/2;
    //     int ind1=ind2-1;
    //     int cnt=0;
    //     int ind1ele=Integer.MAX_VALUE,ind2ele=Integer.MAX_VALUE;
    //     int i=0,j=0;
    //     while(i<n1&&j<n2)
    //     {
    //         if(nums1[i]<nums2[j])
    //         {
    //             if(cnt==ind1) ind1ele=nums1[i];
    //             if(cnt==ind2) ind2ele=nums1[i];
    //             cnt++;
    //             i++;
    //         }
    //         else{
    //             if(cnt==ind1) ind1ele=nums2[j];
    //             if(cnt==ind2) ind2ele=nums2[j];
    //             cnt++;
    //             j++;
    //         }
    //     }
    //     while(i<n1){
    //         if(cnt==ind1) ind1ele=nums1[i];
    //         if(cnt==ind2) ind2ele=nums1[i];
    //         cnt++;
    //         i++;
    //     }
    //     while(j<n2){
    //         if(cnt==ind1) ind1ele=nums2[j];
    //         if(cnt==ind2) ind2ele=nums2[j];
    //         cnt++;
    //         j++;
    //     }
    //     if(n%2==1)
    //     {
    //         return (double)ind2ele;
    //     }
    //     return (double)((double)(ind1ele + ind2ele)) / 2.0;
    // }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length,m=nums2.length;
        
        int[] result = new int[n+m];
         System.arraycopy(nums1, 0, result, 0, n);
         System.arraycopy(nums2, 0, result, n, m);

        Arrays.sort(result);

        int totalLen = n + m;

        if(totalLen % 2 != 0){
            return result[totalLen/2];
        }
        else{
            return (result[totalLen/2-1] + result[totalLen/2])/2.0;
        }
    }
}
public class meadinOfTwoSortedArr {
    public static void main(String[] args) {
        int[] num = {1,3};
        int[] num1 = {2};

        Solution sol = new Solution();
        System.out.println(sol.findMedianSortedArrays(num, num1));
    }
}
