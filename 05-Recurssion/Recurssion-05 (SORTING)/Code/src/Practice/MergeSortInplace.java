package Practice;

import java.util.Arrays;

public class MergeSortInplace {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        inplace(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void inplace(int[] arr,int s,int e){
        if(e-s == 1){
            return;
        }

        int m = s + (e-s)/2;

        inplace(arr,s,m);
        inplace(arr, m, e);

        merge(arr,s,m,e);
    }

    static void merge(int[] arr,int s,int m ,int e){
        int i = s;
        int j = m;
        int k = 0;
        int[] mix = new int[e-s];

        while(i < m && j <e){
            if(arr[i]<arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < m){
            mix[k] = arr[i];
            k++;
            i++;
        }
        while (j < e){
            mix[k] = arr[j];
            k++;
            j++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
}
