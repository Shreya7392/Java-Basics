package IFElse;
import java.util.*;
public class ProfitLoss{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Cost Price :");
        int cp = sc.nextInt();
        System.out.println("Enter the value of Selling Price :");
        int sp = sc.nextInt();
        if (sp > cp) 
    { System.out.println("Seller has incurred profit" + (sp-cp));}
        else if (cp > sp) {
            System.out.println("Seller has incurred loss" + (cp-sp));
        }
        else if (cp == sp){
            System.out.println("Seller has neither made profit nor incurred loss");
        }
    }
    
}
