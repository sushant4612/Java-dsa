package Assignment;

//To find Armstrong Number between two given number.

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the two number");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        for (int i = num1; i < num2 ; i++) {
            int arm = 0;
            int temp = i;
            while(temp!=0){
                int rem = temp%10;
                arm = arm + rem*rem*rem;
                temp=temp/10;
            }
            if (i == arm){
                System.out.println(i);
            }
        }
    }
}