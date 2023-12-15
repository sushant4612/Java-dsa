package Practice;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2,2,1,4,1,5,6,5,6};
        int ans = findUnique(arr);
        System.out.println(ans);
    }
    static int findUnique(int[] arr){
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans ^= arr[i];
        }
        return ans;
    }
}
