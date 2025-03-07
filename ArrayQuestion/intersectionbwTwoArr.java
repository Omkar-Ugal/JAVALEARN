package ArrayQuestion;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        for(int num:nums1){
            set.add(num);
        }
        for(int num:nums2){
            set1.add(num);
        }
        set.retainAll(set1);

        int[] ans = new int[set.size()];
        int index = 0;
        for(int num:set){
            ans[index++] = num;
        }

        return ans;
    }
}
public class intersectionbwTwoArr {
    
}
