package Practice;

public class IsOdd {
    public static void main(String[] args) {
        int num = 3;
        System.out.println(isOdd(num));
    }
    static boolean isOdd(int num){
        return (num & 1) == 1;
    }
}
