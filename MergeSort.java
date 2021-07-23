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
/*
import java.util.*;
public class Main{
    public static int merge(int arr[],int leftStart,int leftEnd,int rightStart,int rightEnd){
        int temp[] = new int[rightEnd-leftStart+1];
        int inversionCount = 0;
        int position = 0;
        int start = leftStart;
        int start2 = rightStart;
        while(leftStart<=leftEnd && rightStart<=rightEnd){
            if(arr[leftStart]<=arr[rightStart])
                temp[position++] = arr[leftStart++];
            else{
                temp[position++] = arr[rightStart++];
                inversionCount+=start2-leftStart;
            }
        }
        while(leftStart<=leftEnd)
            temp[position++] = arr[leftStart++];
        while(rightStart<=leftStart)
            temp[position++] = arr[rightStart++];
        for(int i=0;i<position;i++)
            arr[i+start] = temp[i];
        return inversionCount;
    }
    public static int mergeSort(int arr[],int low,int high){
        int count = 0;
        if(low < high){
        int mid = (high+low)/2;
        count+=mergeSort(arr, low, mid);
        count+=mergeSort(arr, mid+1, high);
        count+=merge(arr, low, mid, mid+1, high);            
        }
        return count;
    }
    public static void main (String[] args) {
        int[] arr = {1, 20, 6, 4, 5};
        int n = arr.length;
        int count = mergeSort(arr,0,arr.length-1);
        for(int i:arr)
            System.out.print(i+" ");
        System.out.println(count);
    }
}
*/
