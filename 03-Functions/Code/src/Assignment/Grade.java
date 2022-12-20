package Assignment;

/*Write a program that will ask the user to enter his/her marks (out of 100).
 Define a method that will display grades according to the marks entered as below:

Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail */

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your marks");
        float num = in.nextFloat();
        marks(num);
    }
    static void marks(float num){
        if(num>90 && num<101){
            System.out.println("AA");
        }
        if(num>80 && num<91){
            System.out.println("AB");
        }
        if(num>70 && num<81){
            System.out.println("BB");
        }
        if(num>60 && num<71){
            System.out.println("BC");
        }
        if(num>50 && num<61){
            System.out.println("CD");
        }
        if(num>40 && num<51){
            System.out.println("DD");
        }
        if(num<=40){
            System.out.println("Fail");
        }
    }
}
