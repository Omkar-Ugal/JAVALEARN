package String;

import java.util.HashSet;

class Solution {
    // public int lengthOfLongestSubstring(String s) {
    //    int n = s.length();
    //     int maxLength = 0;
    //     int[] lastIndex = new int[128];
        
    //     for (int start = 0, end = 0; end < n; end++) {
    //         char currentChar = s.charAt(end);
    //         start = Math.max(start, lastIndex[currentChar]);
    //         maxLength = Math.max(maxLength, end - start + 1);
    //         lastIndex[currentChar] = end + 1;
    //     }
        
    //     return maxLength; 
    // }
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> mpp = new HashSet<>();
         int left=0 ,maxlen = 0;
 
         for(int right = 0;right<s.length();right++){
             while(mpp.contains(s.charAt(right))){
                 mpp.remove(s.charAt(left));
                 left++;
             }
             mpp.add(s.charAt(right));
 
             maxlen = Math.max(maxlen,right - left + 1);
         }
         return maxlen;
     }
}
class LongestSubStringWithoutReaptingChar{
public static void main(String[] args) {
    String s = "abcabcbb";
    Solution sol = new Solution();
    System.out.println(sol.lengthOfLongestSubstring(s));
}
}