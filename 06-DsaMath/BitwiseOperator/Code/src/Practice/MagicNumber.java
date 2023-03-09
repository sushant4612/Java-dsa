package Practice;

public class MagicNumber {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(magic(n));
    }
    static int magic(int num){
        int ans = 0;
        int base = 5;

        while (num > 0){
            int last = num & 1;
            ans = ans + base*last;
            base = base * 5;
            num  = num >> 1;
        }
        return ans;
    }
}
