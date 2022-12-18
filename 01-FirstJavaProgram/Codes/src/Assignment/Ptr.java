package Assignment;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class Ptr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Principle Time and Rate");
        int p = in.nextInt();
        int t = in.nextInt();
        int r = in.nextInt();
        int si = p*(1+r*t);
        System.out.println("Simple Intrest is " + si);
    }
}
