package Assignment;

/*Write a program to print the sum of negative numbers, sum of positive even numbers and the sum
of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when
the user enters a zero.*/

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Nsum = 0;
        int Even = 0;
        int Odd = 0;
        while (true){
            System.out.println("Input Number : ");
            int num = in.nextInt();
            if(num == 0) {
                break;
            }else if(num<0){
                Nsum = Nsum + num;
            }else if (num % 2 == 0){
                Even = Even + num;
            }else{
                Odd = Odd + num;
            }
        }
        System.out.println("Negative Sum is " + Nsum);
        System.out.println("Even Sum is " + Even);
        System.out.println("Odd Sum is " + Odd);
    }
}