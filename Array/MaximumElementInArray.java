package Array;
import java.util.*;
public class MaximumElementInArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter elements of an array:");
        for(int i = 0; i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max= arr[0];
        for(int i =0 ;i<arr.length;i++){
            if(arr[i]>max) 
             max=arr[i];
            }
            System.out.print("The maximum element is:"+"  " +max);
        }

    }
    