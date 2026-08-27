package loop;
import java.util.*;
public class SumNumbersAndReverse {
    public static void main(String[] args) {
        System.out.println("Enter Number:");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int original = n;
        int r = 0;
        while (n!=0) {
            r *= 10;
            r+=n%10;
            n/=10;
         }
         int sum = original +r;
        System.out.println("reverse :" + r);
        System.out.println("sum:" + sum);

    }
    
}
