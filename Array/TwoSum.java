package Array;

public class TwoSum {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int target = 7;
        System.out.println(twoSum(arr, target));
    }
    
   public static boolean twoSum(int arr[], int target) {
        int n =arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
            if(arr[i]+arr[j]==target){
                return true;
            }
            else if(arr[i]+arr[j]<target){
                i++;
            }
            else{
                j--;
            }
        }
         return  false;
    }
}

