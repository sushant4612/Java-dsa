package Practice;

public class PowerOfTwo {
    public static void main(String[] args) {
        int num = 0;
        System.out.println(isPowerOfTwo(num));
    }

    static boolean isPowerOfTwo(int num) {
        if(num == 0){
            return false;
        }
        return (num & (num-1)) == 0;
    }
}
