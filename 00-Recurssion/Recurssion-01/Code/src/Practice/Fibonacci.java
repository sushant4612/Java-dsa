package Practice;

public class Fibonacci {
    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++) {
            System.out.print(Fib(i) + " ");
        }
    }

    static int Fib(int n){
        if(n<2){
            return n;
        }

        return Fib(n-1) + Fib(n-2);
    }
}
