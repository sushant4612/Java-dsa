package Question;
/*
   1
  212
 32123
4321234
 32123
  212
   1
 */

public class Pattern17 {
    public static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n){
        for (int i = 1; i < 2*n ; i++) {
            int spaces = (i>n)?i-n:n-i;
            int c1 = (i>n)?2*n-i:i;
            int c2 = (i>n)?2*n-i:i;
            for (int j =1; j <=spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=c1 ; j++) {
                System.out.print(c1-j+1);
            }
            for (int j = 1; j < c2 ; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
