package TestCase;

import java.util.HashMap;

// Method to check if b[] is a subset of a[]
   
public class Test1 {
    public static boolean isSubset(int[] a, int[] b) {
        // Create a hashmap to store the count of elements in a[]
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<a.length;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
            System.out.println("this is a array"+map);
        }
         System.out.println("after addding a "+ map);
         for(int j=0;j<b.length;j++){
             if(map.containsKey(b[j])){
                 if(map.get(b[j]) == 1){
                     map.remove(b[j]);
                     System.out.println("this is b array remove"+map);
                 }
                 else{
                     map.put(b[j],map.get(b[j])-1);
                     System.out.println("this is somemore in b"+map);
                 }
             }
             else{
                 return false;
             }
         }
         System.out.println("after adding b"+map);
         return true;
    }
    public static void main(String[] args) {
    int[] a1 = {11, 7, 1, 13, 21, 3, 7, 3};
    int[] b1 = {11, 3, 7, 1, 7};
    System.out.println(isSubset(a1, b1));  // Output: true
    
    // Test case 2
    int[] a2 = {1, 2, 3, 4, 4, 5, 6};
    int[] b2 = {1, 2, 4};
    System.out.println(isSubset(a2, b2));  // Output: true
    
    // Test case 3
    int[] a3 = {10, 5, 2, 23, 19};
    int[] b3 = {19, 5, 3};
    System.out.println(isSubset(a3, b3));  // Output: false
  }
}
