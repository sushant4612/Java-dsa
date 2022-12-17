package Assignment;

//To find out whether the given String is Palindrome or not

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = "";
        for (int i = str1.length()-1; i >=0  ; i--) {
            str2 = str2 + str1.charAt(i);
        }
        if (str1.equals(str2)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
    }
}
