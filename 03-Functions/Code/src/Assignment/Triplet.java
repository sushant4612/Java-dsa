package Assignment;

//Write a function to check if a given triplet is a Pythagorean triplet or not.
// (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).

import java.util.Scanner;

public class Triplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter tree number");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (isTriplet(a,b,c)){
            System.out.println("Pythogorus triplet");
        }else {
            System.out.println("No triplet");
        }

    }
    static boolean isTriplet(int a,int b, int c){
        int x = a*a;
        int y = b*b;
        int z = c*c;

        return x == y + z || y == z + x || z == x + y;
    }
}
