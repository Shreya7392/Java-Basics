package Array;

public class PassingArrayToMethods {
    public static void main(String[] args) {
        int [] arr ={41,56,76,32};
        System.out.println(arr[3]); 
        Change(arr);
        System.out.println(arr[3]);
    }

    public static void Change(int [] arr) {
        arr[3] = 99;
    }   
    
}
