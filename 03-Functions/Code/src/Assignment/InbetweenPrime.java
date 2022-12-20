package Assignment;

//Write a function that returns all prime numbers between two given numbers.

import java.util.Scanner;

public class InbetweenPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        prime(num1,num2);
    }
    static void prime(int a,int b){
        for (int i = a; i <= b ; i++) {
            int flag = 0;
            if (i>0){
                int c = 2;
                while (c<i){
                    if (i%c==0){
                        flag = 1;
                        break;
                    }
                    c++;
                }
                if (flag == 0){
                    System.out.println(i);
                }
            }
        }
    }
}
