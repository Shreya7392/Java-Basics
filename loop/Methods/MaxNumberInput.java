package loop.Methods;
import java.util.*;
public class MaxNumberInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
         System.out.println("Enter b:");
        int b = sc.nextInt();
         System.out.println("Enter c:");
        int c = sc.nextInt();
        System.out.println("The max number is :" + " " Math.max(Math.max(a,b),c));
        
    }
}
