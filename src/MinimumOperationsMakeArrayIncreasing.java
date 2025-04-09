public class MinimumOperationsMakeArrayIncreasing {
    

    public static void main(String[] args) {
        minOperations(new int[] {1,1,1});
    }

    public static int minOperations(int[] nums) {
        int count = 0;
        for(int i = 1; i < nums.length; i++) {
            int prev = nums[i];
            nums[i] = Math.max(nums[i - 1] + 1, nums[i]);
            count += nums[i] - prev;
        }

        return count;
    }
}
