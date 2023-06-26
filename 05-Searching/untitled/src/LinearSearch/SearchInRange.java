package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {4,5,0,-5};
        System.out.println(range(arr,0,1,2));
    }
    static int range(int[] arr,int target,int start,int end){
        if(arr.length == 0){
            return -1;
        }

        for (int i = start; i <=  end; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
