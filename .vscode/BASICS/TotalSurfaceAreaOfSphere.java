import java.util.*;
public class TotalSurfaceAreaOfSphere {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the Sphere :");
        double radius = sc.nextDouble();
        double totalSurfaceArea = 4*Math.PI*radius*radius;
        System.out.println("The total surface area of Sphere:"+ totalSurfaceArea);
        return;
    }
    
}
