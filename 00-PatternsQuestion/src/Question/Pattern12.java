package Question;

/*
 * * * * *
  * * * *
   * * *
    * *
     *
     *
    * *
   * * *
  * * * *
 * * * * *
 */

public class Pattern12 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for (int i = 1; i <= 2*n ; i++) {
            int space = (i>5) ? 2*n-i : i-1;
            int c = (i>5) ? i-n:n-i+1;
            for (int j = 1; j <= space ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= c ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
