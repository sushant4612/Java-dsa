package Packages.A;

import static Packages.B.Greetings.message;

public class Greetings {
    public static void main(String[] args) {
        message();
    }

    static void greetings(){
        System.out.println("Hey ! how are you ?");
    }
}
