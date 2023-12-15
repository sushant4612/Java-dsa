package Practice;

public class RBS {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,1,2,34};
        System.out.println(rbs(arr,3,0, arr.length-1));

    }
    static int rbs(int[] arr,int target,int start,int end){
        if(start > end){
            return -1;
        }
        int m = start + (end - start)/2;
        if(arr[m] == target){
            return m;
        }

        if(arr[start] <= arr[m]){
            if(target >= arr[start] && target <= arr[m]){
                return rbs(arr, target, start, m-1);
            }else{
                return rbs(arr, target, m + 1, end);
            }
        }

        if (target <= arr[end] && target >= arr[m]){
            return rbs(arr, target, m+1, end);
        }
        return rbs(arr, target, start, m-1);
    }
}