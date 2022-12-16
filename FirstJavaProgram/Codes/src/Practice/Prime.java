package Practice;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 10;
        int c = 2;
        int flag=0;
        while(c*c<num){
            if(num%c==0){
                flag = 1;
            }
            c=c+1;
        }
        if (flag == 1){
            System.out.println(num + " is not a prime number");
        }else{
            System.out.println(num + " is a prime number");
        }
    }
}