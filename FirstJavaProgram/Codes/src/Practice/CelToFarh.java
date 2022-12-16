package Practice;

import java.util.Scanner;

public class CelToFarh {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cel = in.nextInt();
        int far = (cel * 9/5) + 32;
        System.out.println("In farhenit: "+far);
    }
}