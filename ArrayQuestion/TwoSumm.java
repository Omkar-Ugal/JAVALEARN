package ArrayQuestion;

import java.util.HashMap;

class solution{
    public int[] twosum(int[] nums,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            int complement = k - nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return new int[] {};
    }
}
public class TwoSumm {

    public static void main(String[] args) {
     int[] nums = {2,11,8,5};
     int k = 19;
    solution sol = new solution();
    int[] result = sol.twosum(nums, k);
    for(int i =0;i<result.length;i++){
        System.out.print(result[i]+" ");
     }
    }
}
