package Assignment;

//Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class InputAndLargest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number");
        int max = in.nextInt();
        if (max == 0){
            System.out.println(0);
        }
        while (true){
            System.out.println("Input number");
            int num = in.nextInt();
            if(num>max){
                max = num;
            }
            if (num == 0){
                break;
            }
        }
        System.out.println(max);
    }
}
