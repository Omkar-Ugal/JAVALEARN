package ArrayQuestion;
public class removeDublicate {
    public static int[] dub(int[] arr){
        int index=1;

        // for(int i=1;i<arr.length;i++){
        //     if(arr[i] > arr[i-1]){
        //         arr[index++] = arr[i];
        //         index++;
        //     }
        // }
        for(int i=1;i<arr.length;i++){
            if(arr[i] != arr[i-1]){
                arr[index++] = arr[i];
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,1,3,4,5,3,2,34,5,4,5,3,2};

        int[] result = dub(arr);
        for(int i=0;i<result.length;i++){
            if (i == 0 || result[i] != result[i - 1]) {
                System.out.print(result[i] + " ");
            }
        }
    }
}
