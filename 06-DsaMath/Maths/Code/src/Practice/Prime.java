package Practice;

public class Prime {
    public static void main(String[] args) {
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i + " " + isPrime(i));
        }
    }
    static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }

        int c = 2;

        while (c*c <= num){
            if(num % c == 0){
                return false;
            }
            c ++;
        }
        return true;
    }
}
