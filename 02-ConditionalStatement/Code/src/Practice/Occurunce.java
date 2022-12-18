package Practice;

import java.util.Scanner;

public class Occurunce {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int count = 0;
        while (a>0){
            int rem = a%10;
            if (rem == b){
                count++;
            }
            a/=10;
        }
        System.out.println(count);
    }
}
