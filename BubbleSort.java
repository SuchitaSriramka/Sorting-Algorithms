import java.util.*;
public class BubbleSort{
    public static void swap(int array[], int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void main (String[] args) {
        int array[] = {1,2,4,3};
        int n = array.length;
        int iteration1 = 0;
        int iteration2 = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                iteration1++;
                if(array[j]>array[j+1])
                    swap(array,j,j+1);
            }
        }
        for(int i=1;i<n;i++){
            boolean hasSwapped = false; 
            for(int j=0;j<n-i;j++){
                iteration2++;
                if(array[j]>array[j+1])
                hasSwapped = true;
                    swap(array,j,j+1);
            }
            if(!hasSwapped == true)
                break;
        }
        for(int i:array)
            System.out.print(i+" ");
        System.out.println("iteration1 = "+iteration1+" iteration2 = "+iteration2);
    }
}