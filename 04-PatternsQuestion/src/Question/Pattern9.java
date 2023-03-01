package Question;

/*
 *********
  *******
   *****
    ***
     *
 */

public class Pattern9 {
    public static void main(String[] args) {
        pattern10(5);
    }
    static void pattern10(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <i ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <=n ; j++) {
                System.out.print("*");
            }
            for (int j = i; j <n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
