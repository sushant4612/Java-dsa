package Practice.LargestOfThree;

import java.util.Scanner;

public class Approch1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        int max = num1;
        if (num2>max){
            max = num2;
        }else{
            max = num3;
        }
        System.out.println("Maximum number is " + max);
    }
}
