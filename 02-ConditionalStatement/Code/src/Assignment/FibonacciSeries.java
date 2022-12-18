package Assignment;

//Fibonacci Series In Java Programs

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for (int i = 2; i <= n ; i++) {
            int temp = b;
            b = a+b;
            a = temp;
            System.out.println(b);
        }
    }
}
