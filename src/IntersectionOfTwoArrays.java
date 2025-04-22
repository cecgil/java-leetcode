import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        intersection(new int[]{1,2,2,1}, new int[]{2,2});
    }


    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> res = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        for(int i = 0; i < nums2.length; i++) {
            if(set.contains(nums2[i])) {
                res.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }

        int[] resultArray = res.stream().mapToInt(Integer::intValue).toArray();

        return resultArray;

    }
}
