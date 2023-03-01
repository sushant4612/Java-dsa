package Assignment;

//https://leetcode.com/problems/number-of-good-pairs/

class NumIdenticalPairs {
    public int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;
        for(int i =0;i<nums.length;i++){
            for(int j =0;j<nums.length;j++){
                if(nums[i] == nums[j] && i<j){
                    goodPairs = goodPairs + 1;
                }
            }
        }
        return goodPairs;
    }
}