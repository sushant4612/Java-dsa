package Question;

/*
     *
    * *
   * * *
  * * * *
 * * * * *
 */

public class Pattern10 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = i; j < n ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
