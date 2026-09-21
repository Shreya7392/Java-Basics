package Array;

import java.util.*;
public class MultiplyAndAddInArrayIndex {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entet array size:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter elements of an array:"+ );
        for (int i =0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i< arr.length ; i++){
            if(i%2==1){
                arr[i] = arr[i] * 2;
            }else {
                arr[i] = arr[i] + 10;
            }
        }
        System.out.println("Modified array:");
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}  

