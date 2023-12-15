package Practice;

public class IsSorted {
    public static void main(String[] args) {
        int[] arr = {1,10,4,6,9};
        System.out.println(isSorted(arr,0));
    }
    static boolean isSorted(int[] arr,int index){
        if(index == arr.length-1){
            return true;
        }
        if(arr[index]>arr[index+1]){return false;
        }else{
            return isSorted(arr,index+1);
        }
    }
}
