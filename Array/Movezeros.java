package Array;

public class Movezeros{
    public static void main(String[] args){
        int [] arr = {0,1,0,3,12};
        int n = arr.length;
        int i=0;
        int j=0;
        while (j<n){
            if (arr[j] !=0){
                int temp = arr[i];
                arr[i] =arr[j];
                arr[j] = temp;
                i++;
            }
            j++;
        }
        for (int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
    }

}