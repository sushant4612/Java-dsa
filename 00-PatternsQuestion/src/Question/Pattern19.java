package Question;
/*
 *        *
 **      **
 ***    ***
 ****  ****
 **********
 ****  ****
 ***    ***
 **      **
 *        *
 */
public class Pattern19 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for (int i = 1; i < 2* n ; i++) {
            int c1 = (i>n) ?2*n-i:i;
            int spaces = (i>=n) ?(n*2)-(2*n-i)*2 :(2*n)-(i*2);
            for (int j = 1; j <=c1 ; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <=spaces ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=c1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
