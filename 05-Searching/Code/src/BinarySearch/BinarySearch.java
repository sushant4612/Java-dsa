package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {3,6,8,9,10};
        int target = 6;
        System.out.println(binarySearch(arr,target));
    }
    static int binarySearch(int[] arr,int target){

        int s = 0;
        int e = arr.length-1;

        while(s<=e){

            int m = s + (e-s)/2;
            if(arr[m] == target ){
                return m;
            } else if (arr[m] < target){
                s = m + 1;
            }else{
                e = m - 1;
            }
        }
        return -1;    //if element doesn't exist
    }
}
