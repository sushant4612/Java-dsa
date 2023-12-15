package Assignment;

//https://leetcode.com/problems/counting-bits

class CountingBits {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        
        for(int i = 0; i<=n ; i++){
            ans[i] = noOfOneBit(i);
        }
        return ans;
    }
    public int noOfOneBit(int i){
        int count = 0;
        while(i!=0){
            int last = i & 1;
            if(last == 1){
                count++;
            }
            i = i >> 1;
        }

        return count;
    }
}