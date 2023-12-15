import java.util.Arrays;

public class MergeSortInplace {
    public static void main(String[] args) {
        int[] arr = {5,6,2,1,0,-1};
        mergeSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    private static void mergeSort(int[] arr,int start,int end){
        if(end - start == 1){
            return;
        }

        int mid = start + (end - start) / 2;

        mergeSort(arr,start,mid);
        mergeSort(arr,mid,end);

        sort(arr,start,end,mid);
    }

    private static void sort(int[] arr,int start,int end,int mid){
        int mix[] = new int[end - start];
        int i = start;
        int j = mid;
        int k = 0;

        while(i < mid && j < end){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i < mid){
            mix[k] = arr[i];
            k++;
            i++;
        }

        while(j < end){
            mix[k] = arr[j];
            k++;
            j++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[start + l] = mix[l];
        }
    }
}
