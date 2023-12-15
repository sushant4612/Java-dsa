package Question;

/*
     *
    * *
   *   *
  *     *
 *********
 */

public class Pattern13 {
    public static void main(String[] args) {
        pattern(6);
    }
    static void pattern(int n){
        for (int i = 1; i < n ; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1 ; j++) {
                if(j == 1 || j == 2*i-1 ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i < 2*n ; i++) {
            System.out.print("*");
        }
    }
}
