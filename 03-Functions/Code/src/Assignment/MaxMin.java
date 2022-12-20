package Assignment;

/*Define two methods to print the maximum and the minimum number respectively
among three numbers entered by the user.*/

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        System.out.println("Maximum element is " + max(num1,num2,num3));
        System.out.println("Manimum element is " + min(num1,num2,num3));
    }
    static int max(int a, int b, int c){
        int max = a;
        if(b>max){
            max = b;
        }
        if (c>max){
            max = c;
        }
        return max;
    }
    static  int min(int a,int b,int c){
        int min = a;
        if(b<min){
            min = b;
        }
        if (c<min){
            min = c;
        }
        return min;
    }
}
