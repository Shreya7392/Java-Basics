package loop;
import java.util.*;
public class DecreasingLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Number :");
        int n = sc.nextInt();
        for (int i =n ; i>=1 ; i--){
            System.out.println(i);
        }
    }
    
}
