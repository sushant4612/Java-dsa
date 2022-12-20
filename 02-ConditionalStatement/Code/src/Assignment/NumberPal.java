package Assignment;

//Armstrong Number In Java

import java.util.Scanner;

public class NumberPal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int ans = 0;
        int temp = num;
        while(num!=0){
            int rem = num%10;
            ans = ans *10 + rem;
            num/=10;
        }
        System.out.println(ans);
        if (temp == ans){
            System.out.println("Palindrome Number");
        }else{
            System.out.println("Not Palindrome Number");
        }
    }
}
