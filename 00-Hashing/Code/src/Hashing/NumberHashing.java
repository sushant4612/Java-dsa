package Hashing;

import java.util.Scanner;

public class NumberHashing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number you want to check");
        int a = in.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            int num = in.nextInt();
            arr[i] = num;
        }

        //Precompute hashing
        int[] hash = new int[13];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        System.out.println("Enter the number you want to check");
        int noToCheck = in.nextInt();
        for (int i = 0; i < noToCheck ; i++) {
            int num = in.nextInt();
            System.out.println(hash[num]);
        }
    }
}
