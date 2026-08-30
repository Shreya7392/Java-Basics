package Array;
 
import java.util.*;
public class ProductOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int n = sc.nextInt();
        int arr[]= new int [n];
        System.out.println("Enter elements of an array:");
        for(int i=0; i<arr.length;i++){
         arr[i] =sc.nextInt();
        }
        int product =1;
        for(int i=0 ;i<arr.length;i++){
            product*=arr[i];
        }
            System.out.print("Product of an Array:" +product +"  ");
        }
    }

    

