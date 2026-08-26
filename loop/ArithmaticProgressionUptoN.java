package loop;

import java.util.*;

public class ArithmaticProgressionUptoN {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number :");
    int n = sc.nextInt();
    System.out.println("Enter a :");
    int a=sc.nextInt();
    System.out.println("Enter d");
    int d=sc.nextInt();
    for( int i=1 ; i<=n ; i++){
    System.out.println (a+" ");
    a += d;
    }
  }
}
