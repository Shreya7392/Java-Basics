import java.util.*;
public class SimpleInterst {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal amount:");
        double principal = sc.nextDouble();
        System.out.println("Enter the Rate of Interest per annum:");
        double rate = sc.nextDouble();
    System.out.println("Enter the time in years :");  
    double time = sc.nextDouble();
    double SimpleInterest = (principal*rate*time)/100;
    System.out.println("The Simple Interest is;" +SimpleInterest);
    }
}
