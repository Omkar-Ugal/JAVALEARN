package String;

class Solution {
    public int myAtoi(String s) {
      
        if (s == null || s.length() == 0) {
            return 0;
        }

        s = s.trim();

        if (s.length() == 0) {
            return 0;
        }

        int index = 0;
        int sign = 1;
        long result = 0;

        if (s.charAt(index) == '-') {
            sign = -1;
            index++;
        } else if (s.charAt(index) == '+') {
            index++;
        }

        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            result = result * 10 + (s.charAt(index) - '0');
            index++;

            if (result > Integer.MAX_VALUE) {
                if (sign == 1) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }
        }

        result *= sign;

        return (int) result; 
    }
}
public class stringToInt {
    
}
