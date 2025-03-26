public class SwapMinMaxBetter {


    public static void main(String[] args) {
        SwapMinMaxBetter smmb = new SwapMinMaxBetter();
        smmb.swapMinMax(new int[]{1,4,5,9});
    }

    void swapMinMax(int[] nums) {

        int minIndex = getMinIndex(nums);
        int maxIndex = getMaxIndex(nums);
        swap(nums, minIndex, maxIndex);

    }

    int getMinIndex(int[] nums) {int min = Integer.MAX_VALUE; for(int i = 0; i < nums.length; i++) {if(nums[i] < min){min = i;}} return min;}
    int getMaxIndex(int[] nums) {int max = Integer.MIN_VALUE; for(int i = 0; i < nums.length; i++) {if(nums[i] > max){max = i;}} return max;}
    void swap(int[] nums, int min, int max){int temp = nums[min]; nums[min] = nums[max]; nums[max] = temp;}
    
}
