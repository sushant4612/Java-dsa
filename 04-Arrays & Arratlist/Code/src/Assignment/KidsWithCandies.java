package Assignment;

//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/submissions/870783514/

import java.util.ArrayList;

class KidsWithCandies {
    public ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        int max = 0;
        for(int i = 0;i<candies.length;i++){
            if(candies[i]>max){
                max = candies[i];
            }
        }

        for(int i = 0;i<candies.length;i++){
            if(candies[i]+extraCandies >= max){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
}