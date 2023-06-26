package LinearSearch;

class Leetcode1925 {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(isEven(num)){
                count++;
            }
        }   
        return count;
    }
    private static boolean isEven(int num){
        int count = 0;
        while(num > 0){
            count ++;
            num /= 10;
        }
        return count % 2 == 0;
    }
}
