package LinearSearch;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,4,5},
                {7,8,10},
                {16,100}
        };
        int[] ans = search(arr,1099);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int target){
        int[] ans = {-1,-1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }
}