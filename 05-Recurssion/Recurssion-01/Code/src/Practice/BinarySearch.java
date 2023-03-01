package Practice;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {3,6,10,89,100};
        int target = 1000;
        System.out.println(binarySearch(arr,target,0, arr.length-1));
    }
    static int binarySearch(int arr[],int target,int start,int end){
        if(end<start){
            return -1;
        }
        int mid = start + (end - start)/2;

        if(arr[mid] == target){
            return mid;
        }

        if(arr[mid]>target){
            return binarySearch(arr,target,start,mid-1);
        }
        return binarySearch(arr,target,mid+1,end);
    }
}
