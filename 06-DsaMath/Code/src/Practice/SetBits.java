package Practice;

public class SetBits {
    public static void main(String[] args) {
        int n = 46;
        System.out.println(Integer.toBinaryString(n));

        System.out.println(count(n));
    }

    private static int count(int n) {
        int count = 0;

//        while (n>0){
//            count++;
//            n = n-(n&(-n));
//        }

        while (n>2){
            count++;
            n = n &(n-1);
        }

        return count;
    }

}
