package Singleton;

import AccesControl.A;

public class Main  extends A {
    Main obj = new Main();
    int n = obj.num;

    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        Singleton obj3 = Singleton.getInstance();
    }
}