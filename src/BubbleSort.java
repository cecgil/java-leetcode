public class BubbleSort {

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(new int[]{2,4,6,7});
    }

    public void bubbleSort(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(nums[j] > nums[i]) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }

        for(int teste : nums) {
            System.out.print(teste);
        }
    }
    
}
