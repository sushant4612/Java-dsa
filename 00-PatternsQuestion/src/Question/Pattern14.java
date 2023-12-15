package Question;
/*
 *********
  *     *
   *   *
    * *
     *
 */

public class Pattern14 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for (int i = 1; i < 2*n ; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 1; i <n ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(" ");
            }
            int c = (2*n)-(i*2)-1;
            for (int j = 1; j <=c ; j++) {
                if(j == 1 || j == c){
                    System.out.print("*");
                }else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
