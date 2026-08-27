package loop;

import java.util.*;
public class CountNumbers {
    public static void main(String [] args ){
        System.out.println( "Enter Number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n!=0){
            n/=10;
            count++;
         }
         System.out.println(count);


    }

    
    
}
