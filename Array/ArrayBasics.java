package Array;
public class ArrayBasics{
    public static void main(String[] args) {
        int [] arr = new int [4];
        arr[0] = 10;
        arr[1] = 30;
        arr[2] = 2;  
        arr[3] = -5;
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
