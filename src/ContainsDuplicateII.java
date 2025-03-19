import java.util.HashSet;

public class ContainsDuplicateII {

    public static void main(String[] args) {
        ContainsDuplicateII cd = new ContainsDuplicateII();
        int[] nums = {1,0,1,1};
        cd.containsNearbyDuplicate(nums, 1);
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashSet<Integer> window = new HashSet<>();
        
        int l = 0;

        for(int i = 0; i < nums.length; i++) {
            if(window.contains(nums[i])) {
                return true;
            }

            window.add(nums[i]);

            if(i - l > k) {
                window.remove(nums[l]);
                l++;
            }
        }

        return false;


        
    
    }
    
}
