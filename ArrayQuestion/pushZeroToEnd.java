package ArrayQuestion;
class solution{
    void pushZeroAtEnd(int[] arr){
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                arr[index] = arr[i];
                if(i!=index){
                    arr[i] = 0;
                }
                index++;
            }
        }
    }
}
public class pushZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,0,0,0,0,0,0,0,0,00,0,0,0,5,35,4,3,45235,13,0,65357,23};
        solution sol = new solution();
        sol.pushZeroAtEnd(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
