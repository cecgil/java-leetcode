import java.util.HashMap;
import java.util.Map;

public class NRepeatedElementInSize2NArray {
    
    public static void main(String[] args) {
        
        
    }

    public int repeatedNTimes(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();  
        
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                return nums[map.get(nums[i])];
            }


            map.put(nums[i], i);
        }
        return 0;
    }
}
