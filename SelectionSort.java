import java.util.*;
public class SelectionSort{
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main (String[] args) {
        int[] arr = {7,3,1,5,6};
        int n = arr.length;
        int iterations = 0;
        for(int i=0;i<n-1;i++){
            int minElementIndex = i;
            boolean hasSwapped = false;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minElementIndex])
                {
                    hasSwapped = true;
                    iterations++;
                    minElementIndex = j;
                }
            }
            if(!hasSwapped == true){
               break;
            }
            swap(arr,minElementIndex,i);
        }
        for(int i:arr)
            System.out.print(i+" ");
        System.out.println("\n"+iterations);
    }
}