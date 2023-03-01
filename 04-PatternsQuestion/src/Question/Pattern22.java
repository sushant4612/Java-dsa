package Question;
/*
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
 */

public class Pattern22 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(value(i, j) + " ");
            }
            System.out.println();
        }
    }
    static int value(int x,int y){
        int sum = x+y;
        if(sum%2 == 0){
            return 1;
        }
        return 0;
    }
}