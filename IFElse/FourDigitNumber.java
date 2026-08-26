package IFElse;

 import java.util.*;
public class FourDigitNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a four-digit number: ");
        int num = sc.nextInt();
        
        if (num >= 1000 && num <= 9999) {
            System.out.println("Valid four-digit number.");
        } else {
            System.out.println("Invalid input. Please enter a four-digit number.");
        }
    }
}