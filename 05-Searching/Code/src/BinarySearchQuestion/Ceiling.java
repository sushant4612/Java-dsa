package BinarySearchQuestion;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,99};
        System.out.println(ceiling(arr,8));
    }
    static int ceiling(int[] arr,int target){

        // if target element is greater than last element
        if(target > arr[arr.length - 1]) return -1;

        int s = 0;
        int e = arr.length-1;

        while(s <= e){
            int m = s + (e-s)/2;
            if( arr[m] == target){
                return m;
            }else if(arr[m] < target){
                s = m + 1;
            }else {
                e = m - 1;
            }
        }
        return s;
    }
}
