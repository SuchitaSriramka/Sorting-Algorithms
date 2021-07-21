import java.util.*;
public class MergeSort{
    public static void merge(int arr[],int leftStart,int leftEnd,int rightStart,int rightEnd){
        int temp[] = new int[rightEnd-leftStart+1];
        int position = 0;
        int start = leftStart;
        while(leftStart<=leftEnd && rightStart<=rightEnd){
            if(arr[leftStart]<=arr[rightStart])
                temp[position++] = arr[leftStart++];
            else
                temp[position++] = arr[rightStart++];
        }
        while(leftStart<=leftEnd)
            temp[position++] = arr[leftStart++];
        while(rightStart<=leftStart)
            temp[position++] = arr[rightStart++];
        for(int i=0;i<position;i++)
            arr[i+start] = temp[i];
    }
    public static void mergeSort(int arr[],int low,int high){
        if(low == high)
            return;
        int mid = (high+low)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, mid+1, high);
    }
    public static void main (String[] args) {
        int[] arr = {7,3,1,5,6,3,2,9,4};
        int n = arr.length;
        mergeSort(arr,0,arr.length-1);
        for(int i:arr)
            System.out.print(i+" ");
    }
}