package Assignment;

//A person is eligible to vote if his/her age is greater than or equal to 18.
// Define a method to find out if he/she is eligible to vote.

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = in.nextInt();
        vote(age);
    }
    static void vote(int age){
        if (age >= 18){
            System.out.println("Able to vote");
        }else{
            System.out.println("Not able to vote");
        }
    }

}
