package Question;
/*
     *
    * *
   *   *
  *     *
 *       *
  *     *
   *   *
    * *
     *
 */

public class Pattern15 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for (int i = 1; i < 2*n ; i++) {
            int space = (i>n) ? i-n : n-i;
            int c = (i>n) ?((2*n)-(2*(i-n)))-1 : 2*i-1;
            for (int j = 1; j <= space ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=c ; j++) {
                if(j == 1 || j == c){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}