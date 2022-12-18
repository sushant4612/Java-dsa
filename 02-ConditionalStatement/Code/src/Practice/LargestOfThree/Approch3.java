package Practice.LargestOfThree;

import java.util.Scanner;

public class Approch3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        int max = Math.max(Math.max(num1,num2),num3);

        System.out.println("Maximun number is " + max);
    }
}
