package Assignment;

//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

import java.util.Scanner;

public class InputTill0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while (true){
            System.out.println("Input a number");
            int n = in.nextInt();
            if (n == 0){
                break;
            }
            sum = sum + n;
        }
        System.out.println(sum);
    }
}
