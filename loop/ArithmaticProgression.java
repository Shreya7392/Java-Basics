package loop;

import java.util.Scanner;
public class ArithmaticProgression{
    public static void main (final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        final int n = sc.nextInt();
        for (int i = 2; i <= 3 * n - 1; i += 3) {
            System.out.println(i+"  ");
        }

    }

}

