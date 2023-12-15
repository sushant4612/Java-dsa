package Practice;

public class BinarySearchSQRT {
    public static void main(String[] args) {
        System.out.printf("%.3f",sqrt(10,3));
    }
   static double sqrt(int n,int p){
        int s = 0;
        int e = n;

        double ans = 0.0;

        while (s <= e){
            int m = s + (e-s)/2;

            if(m * m == n){
                return m;
            }
            if(m * m > n){
                e = m-1;
            }else{
                s = m+1;
            }
        }

        ans = e;

        double incr = 0.1;

        for (int i = 0; i < p ; i++) {
           while (ans * ans <= n){
               ans += incr;
           }
           ans -= incr;
           incr/=10;
       }
        return ans;
   }

}
