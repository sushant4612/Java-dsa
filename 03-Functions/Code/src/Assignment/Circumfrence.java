package Assignment;

//Write a program to print the circumference and area of a circle
// of radius entered by user by defining your own method.

import java.util.Scanner;

public class Circumfrence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius");
        int r = in.nextInt();
        float cir = cirumfrence(r);
        float area = area(r);
        System.out.println("Circumfrence is "+ cir +" and area is "+area);
    }
    static float cirumfrence(int r){
        return 2 *3.14f*r;
    }
    static float area(int r){
        return 3.14f*r*r;
    }
}
