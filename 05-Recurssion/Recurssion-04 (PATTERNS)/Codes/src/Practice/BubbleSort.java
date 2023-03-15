package Practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1,5,10,6};
        sort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr,int r,int c){
        if(r == 0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]) {
                swap(arr, c, c + 1);
            }
            sort(arr,r,c+1);
        }else{
            sort(arr,c-1,0);
        }
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
