package Array;

import java .util.*;
public class DoubleTheOddElementsAndAdd10ToEvenElementsOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array:");
        int n = sc.nextInt();
        int[] arr = new int [n];
        System.out.print("Enter Elements Of Array:");
        for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
             if (arr[i] % 2 == 0) {
              System.out.print(arr[i] + 10 +"  ");
          } else {
              System.out.print(arr[i] * 2 +"  ");
       }
    }
 }
}

