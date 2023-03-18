package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSequence {
    public static void main(String[] args) {
//        subsequenceAscii("","abc");
        System.out.println(suseqAscii("","abc"));
    }
    static void subsequence(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        subsequence(up.charAt(0) + p,up.substring(1));
        subsequence(p,up.substring(1));
    }

    static ArrayList<String> suseq(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> left = suseq(p + up.charAt(0),up.substring(1));
        ArrayList<String> right = suseq(p,up.substring(1));

        left.addAll(right);

        return left;
    }

    static void subsequenceAscii(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        subsequenceAscii(up.charAt(0) + p,up.substring(1));
        subsequenceAscii(p,up.substring(1));
        subsequenceAscii(p+(up.charAt(0) + 0),up.substring(1));
    }

    static ArrayList<String> suseqAscii(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> first =  suseqAscii(p + up.charAt(0),up.substring(1));
        ArrayList<String> second = suseqAscii(p,up.substring(1));
        ArrayList<String> third = suseqAscii(p+(up.charAt(0)+0),up.substring(1));

        first.addAll(second);
        first.addAll(third);

        return first;
    }
}
