package Assignment;

//Define a method that returns the product of two numbers entered by user.

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int product = product(num1,num2);
        System.out.println("Product is " + product);
    }
    static int product(int a,int b){
        return a*b;
    }
}
