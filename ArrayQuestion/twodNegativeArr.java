package ArrayQuestion;

class Solution {
    public int countNegativesBinarySerach(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int ans = 0;

        int i =0;
        while(i < n){
            for(int j =0;j < m;j++){
                if(grid[i][j] < 0){
                    ans += n-j;
                    ans += m-i-1;
                    m--;
                    break;
                }
            }

            i++;
        }

        return ans;
    }
    public int countNegatives(int[][] grid) {
        int neg = 0;
        for(int i =0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j] < 0){
                    neg++;
                }
            }
        }
        return neg;
    }
}
public class twodNegativeArr {
    public static void main(String[] args) {
        
    }
}
