package String;

class Solution {
    // int start = 0, end = 0;
    // public String longestPalindrome(String s) {
    //     helper(s.toCharArray(), 0, s.length());
    //     return s.substring(start, end + 1);
    // }
    // void helper(char[] arr, int i, int n) {
    //     if(i > n - 1) return;
    //     int left = i, right = i;
    //     while(right < n - 1 && arr[right] == arr[right + 1]) {
    //         right++;
    //     } 
    //     i = right;
    //     while(left > 0 && right < n - 1 && arr[left - 1] == arr[right + 1]) {
    //         left--;
    //         right++;
    //     }
    //     if(end - start < right - left) {
    //         start = left;
    //         end = right;
    //     }
    //     helper(arr, ++i, n);
    // }


    private String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        
        return s.substring(left + 1, right);
    }
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        String longest = "";
        
        for (int i = 0; i < s.length(); i++) {
           
            String oddPalindrome = expandAroundCenter(s, i, i);
            
            String evenPalindrome = expandAroundCenter(s, i, i + 1);
            
           
            if (oddPalindrome.length() > longest.length()) {
                longest = oddPalindrome;
            }
            if (evenPalindrome.length() > longest.length()) {
                longest = evenPalindrome;
            }
        }

        return longest;
    }
}
/*To achieve the best time complexity for finding the longest palindromic substring, we need to improve upon the O(n^2) time complexity of the center-expansion approach. The optimal solution to this problem uses a Manacher's Algorithm, which solves the problem in O(n) time complexity. This is the most efficient known algorithm for this problem.

Manacher's Algorithm Overview:
Manacher’s Algorithm works by processing the string in such a way that it can efficiently calculate the longest palindromic substring in linear time. It utilizes symmetry properties of palindromes and avoids redundant checks, which allows the algorithm to achieve O(n) time complexity.

Key Concepts of Manacher’s Algorithm:
Transform the string: To handle both even and odd-length palindromes uniformly, we can insert a special character (e.g., #) between each character of the string and at the boundaries.
Array of Palindrome Radii: We use an array p to store the radius (half-length) of the palindrome centered at each position.
Dynamic Expansion with Symmetry: By maintaining the center and rightmost boundary of the rightmost palindrome, the algorithm can exploit symmetry to expand palindromes efficiently. */
public class LongPalindromeSubArr {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        System.out.println(solution.longestPalindrome("babad"));  // Output: "bab" or "aba"
        System.out.println(solution.longestPalindrome("cbbd"));   // Output: "bb"
    }
}
