package Practice;

//Time - O(n)
//Space - O(n)

public class Print5 {
    public static void main(String[] args) {
        printBoth(5);
    }
    static void print(int n){
        if(n == 0){
            return;
        }
        print(n-1);
        System.out.println(n);
    }

    static void printRev(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printRev(n-1);
    }

    static void printBoth(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printBoth(n-1);
        System.out.println(n);
    }
}