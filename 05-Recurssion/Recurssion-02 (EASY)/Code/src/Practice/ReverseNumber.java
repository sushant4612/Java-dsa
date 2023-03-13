package Practice;

public class ReverseNumber {
    static int sum = 0;
    public static void main(String[] args) {
        rev(1562);
        System.out.println(sum);
        System.out.println(rev2(1234));
    }
    static void rev(int n){
        if(n == 0){
            return;
        }
        int rem = n %10;
        sum = sum*10 + rem;
        rev(n/10);
    }

    static int rev2(int n){
        int digit = (int)(Math.log10(n)) + 1;
        return helper(n,digit);
    }

    static int helper(int n,int digit){
        if(n == 0){
            return 0;
        }
        int rem = n%10;
        return rem*(int)Math.pow(10,digit-1) + helper(n/10,digit-1);
    }
}
