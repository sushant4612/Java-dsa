package Assignment;

// https://leetcode.com/problems/reverse-bits/

public class ReverseBit {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ans = 0;
        for(int i = 0 ; i < 32 ; i++){
            int lsb = n & 1;
            n = n >> 1;
            int rev = lsb << (32 - i - 1);
            ans = ans | rev;
        }
        return ans;
    }
}