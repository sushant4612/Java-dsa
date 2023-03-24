package Practice;

import java.util.ArrayList;
import java.util.List;

class NumPad {
    public List<String> letterCombinations(String digits) {
        List<String> ans = helper("",digits);
        if(ans.get(0) == ""){
            return new ArrayList<>();
        }
        return ans;
    }
    public static List<String> helper(String p,String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> list = new ArrayList<>();

        int digit = up.charAt(0) - '0';
        if(digit == 7){
            for(int i = (digit-2)*3 ; i<= (digit-1)*3 ; i++){
                char ch = (char)('a' + i);
                list.addAll(helper(p + ch,up.substring(1)));
            }
        }else if(digit == 8){
            for(int i = ((digit-2)*3)+1 ; i<= (digit-1)*3 ; i++){
                char ch = (char)('a' + i);
                list.addAll(helper(p + ch,up.substring(1)));
            }
        }else if(digit == 9){
            for(int i = ((digit-2)*3) + 1 ; i<= (digit-1)*3+1 ; i++){
                char ch = (char)('a' + i);
                list.addAll(helper(p + ch,up.substring(1)));
            }
        }else if(digit >1 && digit <7){
            for(int i = (digit-2)*3 ; i< (digit-1)*3 ; i++){
                char ch = (char)('a' + i);
                list.addAll(helper(p + ch,up.substring(1)));
            }
        }
        return list;
    }
}