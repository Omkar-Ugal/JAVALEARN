package ArrayQuestion;

class sol{
    public void moveZero(int[] nums){
        int nonZero = 0;
       for(int i =0;i<nums.length;i++){
        if(nums[i] != 0){
            if(i != nonZero){
                nums[nonZero] = nums[i];
                nums[i] = 0;    
            }
            nonZero++;
         }
       }
    }

    public void print(int[] nums){
        moveZero(nums);
        for(int i =0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
public class moveZeros {
    public static void main(String[] args) {
        sol so = new sol();
        int[] arr = {0,0,0,1,0,02,3,2,2,1,33,0,0,1,0,3,12};
        so.print(arr);
    }
}
