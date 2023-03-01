package Question;
/*
 **********
 ****  ****
 ***    ***
 **      **
 *        *
 *        *
 **      **
 ***    ***
 ****  ****
 **********
 */

public class Pattern18 {
    public static void main(String[] args) {
        pattern18(5);
    }
    static void pattern18(int n){
        for (int i = 1; i <= 2*n ; i++) {
            int c1 = (i>n)?i-n:n-i+1;
            int space = (i>n)?(2*n)-((i-n)*2):(2*n)-(2*(n-i+1));
            for (int j = 1; j <= c1 ; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <space ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= c1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}