public class MinimumSizeSubwarraySum {
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        minSubArrayLen(target, nums);
    }

    public static int minSubArrayLen(int target, int[] nums) {

        int minLen = Integer.MAX_VALUE;
        int left = 0;
        int curSum = 0;


        for(int i = 0; i < nums.length; i++) {

            curSum += nums[i];

            while(curSum >= target) {
                if(i - left + 1 < minLen){
                    minLen = i - left + 1;
                }

                curSum -= nums[left];
                left++;
            }
        }

        return minLen != Integer.MAX_VALUE ? minLen : 0;        

    }
}
