package Practice;

public class FindUniqueOdd {
    public static void main(String[] args) {
        int[] arr = {4,1,4,4,6,6,6,8,8,8};
        System.out.println(unique(arr));
    }
    static int unique(int[] arr){
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }

        return sum%3;
    }
}