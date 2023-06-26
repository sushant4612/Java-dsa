package LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,8,0,19,7};
        int ans = linearSearch(arr,7);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr,int target){
        //if array is empty return -1
        if(arr.length == 0){
            return -1;
        }

        //iterate through every element of array
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }

        //if element not present return -1
        return -1;
    }

    static int linearSearch1(int[] arr,int target){
        //if array is empty return -1
        if(arr.length == 0){
            return Integer.MAX_VALUE;
        }

        //iterate through every element of array
         for(int item : arr){
             if(item == target){
                 return target;
             }
         }

        //if element not present return
        return Integer.MAX_VALUE;
    }

    static boolean linearSearch2(int[] arr,int target){
        //if array is empty return -1
        if(arr.length == 0){
            return false;
        }

        //iterate through every element of array
        for(int item : arr){
            if(item == target){
                return true;
            }
        }

        //if element not present return false
        return false;
    }
}
