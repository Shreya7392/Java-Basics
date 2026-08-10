package IFElse;
import java.util.*;
public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        double n = sc.nextDouble();
        if (n < 0) { n = n*-1;
        System.out.println("The absolute value is: " + n);
        }
        else {
           n = n*1;
        }
        System.out.println("The absolute value is: " + n);
    }
}
