package loop;
import java.util.*;
public class SumOfDigits{
    public static void main(String[] args) {
        System.out.println("Enter Number:");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(n!=0){
        sum += n%10;
        n/=10;
    }

        System.out.println(sum); 
   }
}
