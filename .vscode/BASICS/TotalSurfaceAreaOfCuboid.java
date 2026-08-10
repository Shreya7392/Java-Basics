import java.util.*;
    public class TotalSurfaceAreaOfCuboid {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the cuboid:");
        double length = sc.nextDouble();
        System.out.println("Enter the breadth of the cuboid:");
        double breadth = sc.nextDouble();
        System.out.println("Enter the height of the cuboid:");
        double height = sc.nextDouble();
        double totalSurfaceArea =2*(length*breadth+breadth*height+height*length);
        System.out.println("The Total Surface Area Of A Cuboid Is: "+ totalSurfaceArea);
        }
    }
    
