package Assignment;

//https://leetcode.com/problems/running-sum-of-1d-array/

class RunningSum {
    public int[] runningSum(int[] nums) {
        int ans = 0;
        for(int i = 0;i<nums.length;i++){
            ans = ans + nums[i];
            nums[i] = ans;
        }
        return nums;
    }
}