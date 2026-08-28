package Array;
import java. util.*;
public class PrintSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.print("Enter Array Elemts:");
        for(int i=0; i<arr.length;i++){
         arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum+=arr[i];
            System.out.print("The sum of array is:"+"  "+sum);
        }

    }
    
}
