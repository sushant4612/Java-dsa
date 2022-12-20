package Assignment;

//Write a function to find if a number is a palindrome or not. Take number as parameter.

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
        palin(num);
    }
    static void palin(int num){
        int ans = 0;
        int temp = num;
        while (num>0){
            int rem = num%10;
            ans = ans *10 + rem;
            num/=10;
        }
        if (temp == ans){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not palindrome");
        }
    }
}
