package Assignment;

//Input currency in rupees and output in USD.

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the currency in rupee");
        int rupee = in.nextInt();
        float usd = rupee * 0.012f;
        System.out.println("In USD " + usd);
    }
}
