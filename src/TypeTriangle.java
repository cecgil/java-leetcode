public class TypeTriangle {

    public static void main(String[] args) {
        String res = triangleType(new int[]{8,4,2});
    }

    public static String triangleType(int[] nums) {
        if (nums[0] + nums[1] <= nums[2] ||
            nums[0] + nums[2] <= nums[1] ||
            nums[1] + nums[2] <= nums[0]) {
            return "none";
        }
        if(nums[0] == nums[1] && nums[0] == nums[2]) { return "equilateral";}
        if(nums[0] == nums[1] || nums[0] == nums[2] || nums[1] == nums[2]) { return "isosceles";}

        return "scalene";
        
    }
    
}
