import java.util.Scanner;
public class mycode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no:");
        int a=sc.nextInt();
        for (int i=0;i<a;i++){
            // for (int j=0;j<a+1-i;j++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
