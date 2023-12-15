package Practice;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        ArrayList<String> ans = permutationsRet("","abc");
        System.out.println(ans);
        System.out.println(permutationsCount("","abc-------"));
    }

    static void permutations(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        int n = p.length();
        for (int i = 0; i <= n ; i++) {
            String first = p.substring(0,i);
            String second = p.substring(i,n);
            permutations(first+up.charAt(0) +second,up.substring(1));
        }
    }

    static ArrayList<String> permutationsRet(String p,String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        int n = p.length();
        for (int i = 0; i <= n ; i++) {
            String first = p.substring(0,i);
            String second = p.substring(i,n);
            list.addAll(permutationsRet(first+up.charAt(0) +second,up.substring(1)));
        }

        return list;
    }

    static int permutationsCount(String p,String up){
        if (up.isEmpty()){
            return 1;
        }

        int count = 0;

        int n = p.length();
        for (int i = 0; i <= n ; i++) {
            String first = p.substring(0,i);
            String second = p.substring(i,n);
            count = count + permutationsCount(first+up.charAt(0) +second,up.substring(1));
        }

        return count;
    }
}
