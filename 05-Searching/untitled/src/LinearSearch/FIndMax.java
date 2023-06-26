package LinearSearch;

public class FIndMax {
    public static void main(String[] args) {
        int[] arr = {9,10,78,100};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }
}
