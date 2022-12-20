package Assignment;

//Write a program to print the sum of two numbers entered by user by defining your own method.

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int sum = sum(num1,num2);
        System.out.println("Sum is " + sum);
    }
    static int sum(int a,int b){
        return a+b;
    }
}
