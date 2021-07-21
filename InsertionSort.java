import java.util.*;
public class InsertionSort{
    public static void main (String[] args) {
        int[] arr = {7,3,1,5,6,3,2,9,4};
        int n = arr.length;
        int iterations = 0;
        for(int i=1;i<n;i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>current){
                iterations++;
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        System.out.println("iterations = "+iterations);
        for(int i:arr) 
            System.out.print(i+" ");
    }
}