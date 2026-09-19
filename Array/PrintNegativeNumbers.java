package Array;

import java.util.Scanner;

public class PrintNegativeNumbers {
    public static void main(String [] args){
     Scanner sc = new Scanner (System.in);
     System.out.print("Enter size of an array:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter elements of an array:");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Negative numbers in an array are:");
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
    
}
