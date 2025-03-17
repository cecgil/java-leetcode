import java.util.HashMap;
import java.util.Map;

public class DivideArrayIntoEqualPairs {

    public static void main(String[] args) {
        int[] nums = {3,2,3,2,2,2};
        divideArray(nums);
    }

    public static boolean divideArray(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int i : map.values()) {
            if(i % 2 != 0) {
                return false;
            }
        }

        return true;
    }
    
}
