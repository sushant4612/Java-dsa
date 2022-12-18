package Assignment;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Nc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int ans = 0;
        System.out.println("Enter a operator (+,*,-,/)");
        char op = in.next().charAt(0);
        if (op == '+'){
            ans = num1+num2;
        }
        if (op == '-'){
            ans = num1-num2;
        }
        if (op == '*'){
            ans = num1*num2;
        }
        if (op == '/'){
            ans = num1/num2;
        }
        System.out.println("Answer is " + ans);
    }
}
