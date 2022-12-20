package Assignment;

import java.util.Scanner;

public class SumTillN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number");
        int num = in.nextInt();
        int sum = sum(num);
        System.out.println("Sum is "+ sum);
    }
    static int sum(int n){
        int ans = 0;
        for (int i = 1; i <=n ; i++) {
            ans = ans+i;
        }
        return ans;
    }
}
