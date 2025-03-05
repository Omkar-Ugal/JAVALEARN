package String;

class Solution {
    // public String convert(String s, int numRows) {
    //     if (numRows == 1 || numRows >= s.length()) {
    //         return s;
    //     }

       
    //     StringBuilder[] rows = new StringBuilder[numRows];
    //     for (int i = 0; i < numRows; i++) {
    //         rows[i] = new StringBuilder();
    //     }

    //     int currentRow = 0;
    //     boolean goingDown = false;  

        
    //     for (char c : s.toCharArray()) {
    //         rows[currentRow].append(c);

            
    //         if (currentRow == 0 || currentRow == numRows - 1) {
    //             goingDown = !goingDown;
    //         }

           
    //         currentRow += goingDown ? 1 : -1;
    //     }

      
    //     StringBuilder result = new StringBuilder();
    //     for (StringBuilder row : rows) {
    //         result.append(row);
    //     }
    //         return result.toString();
    // }
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        int length = s.length();

        char[] result = new char[length];
        int result_index = 0;
        final int original_offset = numRows + (numRows - 2);
        int offset = original_offset;

        for (int line = 0; line < numRows && result_index < length; line++) {
            result[result_index++] = s.charAt(line);

            for (int index = line + offset; index < length && result_index < length;
                 index += offset) {
                result[result_index++] = s.charAt(index);

                if (original_offset - offset > 0) {
                    index += original_offset - offset;

                    if (index < length) {
                        result[result_index++] = s.charAt(index);
                    }
                }
            }

            offset -= 2;

            if (offset == 0) {
                offset = original_offset;
            }
        }

        return new String(result);
    }
}
public class zigzagConvers {
   public static void main(String[] args) {
    String s = "PAYPALISHIRING";
    int numRows = 3;
    Solution sol = new Solution();
    sol.convert(s, numRows);
   }
}
