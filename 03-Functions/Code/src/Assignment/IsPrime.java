package Assignment;

//Define a method to find out if a number is prime or not..

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = in.nextInt();
        if (isprime(num)){
            System.out.println("Prime");
        }else{
            System.out.println("Not prime");
        }
    }
    static  boolean isprime(int n){
        int c = 2;
        while (c<n){
            if (n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
