package Assignment;

// https://leetcode.com/problems/add-binary/

class BinaryAddition {
    public String addBinary(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        int i = 0,carry = 0;
        String ans = "";

        while(i<lenA || i<lenB || carry != 0){
            int x = 0;
            if(i<lenA && a.charAt(lenA - i - 1) == '1'){
                x = 1;
            }
            int y = 0;
            if(i<lenB && b.charAt(lenB - i - 1) == '1'){
                y = 1;
            }

            ans = String.valueOf((x+y+carry)%2) + ans;
            carry = (x + y + carry)/2;
            i+=1;
        }
        return ans;
    }
}