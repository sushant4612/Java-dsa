package BinarySearchQuestion;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {4,5,6,8,9,10};
        System.out.println(floor(arr,6));
    }
    static int floor(int[] arr,int target){
        int s = 0;
        int e = arr.length - 1;

        while (s <= e){
            int m = s + (e - s)/2;

            if(arr[m] == target){
                return m;
            }else if (arr[m] < target){
                s = m + 1;
            }else{
                e = m - 1;
            }
        }
        return e;
    }
}
