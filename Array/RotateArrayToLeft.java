package Array;
import java.util.*;

public class RotateArrayToLeft{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter elements of an array:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter number of positions to rotate left:");
        int d = sc.nextInt();
        rotateArrayToLeft(arr, n, d);
        System.out.println("Array after rotation:");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void rotateArrayToLeft(int [] arr, int n, int d){
        d = d % n;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void reverse(int [] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
