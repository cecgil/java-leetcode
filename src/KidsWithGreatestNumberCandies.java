import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberCandies {
    

    public static void main(String[] args) {
        kidsWithCandies(new int[]{2,8,7}, 3);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = candies[0];
        List<Boolean> res = new ArrayList<>();

        for(int i = 1; i < candies.length; i++) { if(candies[i] > max) max = candies[i];} 

        for(int i = 0; i < candies.length; i++) {
            if(candies[i] + extraCandies >= max) {
                res.add(true);
            } else {
                res.add(false);
            }
        }

        return res;
    }
}
