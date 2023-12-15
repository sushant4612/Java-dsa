package Hashing;

import java.util.Scanner;
import java.util.SortedMap;

public class CharacterHashing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = in.next();

        //compute
        int[] hash = new int[26];
        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i) - 97]++;
        }

        System.out.println("Enter the no character you want to find");
        int num = in.nextInt();
        for (int i = 0; i < num; i++) {
            char ch = in.next().charAt(0);
            System.out.println(hash[ch - 97]);
        }
    }
}
