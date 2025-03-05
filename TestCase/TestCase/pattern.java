package TestCase;
import java.util.Scanner;


public class pattern{
   public static void printTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-1;j++){
                System.out.print(" ");
            }
            for(int k =1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       printTriangle(n);
       for(int i=0;i<n;i++){
        for(int j=1;j<=i+1;j++){
            System.out.print("*");
        }
        System.out.println();
       }
    }
}