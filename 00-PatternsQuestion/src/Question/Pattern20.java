package Question;
/*
 ****
 *  *
 *  *
 *  *
 ****
 */

public class Pattern20 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for (int i = 1; i <=n ; i++) {
            if(i == 1 ||i == n){
                for (int j = 1; j <n ; j++) {
                    System.out.print("*");
                }
            }else{
                for (int j = 1; j <n ; j++) {
                    if(j == 1 || j == n-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }
    }
}
