package Assignment;

//https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/

class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] arr = new int[26];
        int ch;
        for(int i = 0;i<sentence.length();i++){
            ch = sentence.charAt(i);
            if(arr[ch-97]==1){
                continue;
            }else{
                arr[ch-97] = 1;
            }
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i]!=1){
                return false;
            }
        }
        return true;
    }
}