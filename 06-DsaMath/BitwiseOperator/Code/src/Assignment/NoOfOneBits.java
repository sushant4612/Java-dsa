package Assignment;

// https://leetcode.com/problems/number-of-1-bits

public class NoOfOneBits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        for(int i = 0;i < 32 ; i++){
            int rem = n&1;
            if(rem == 1){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
}