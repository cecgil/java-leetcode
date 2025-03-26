public class Bubble {
    

    public static void main(String[] args) {
        bubbleSort(new int[]{3,4,5,2,1});
    }

    public static void bubbleSort(int [] nums) {
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = 0; j < nums.length - 1; j++){
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        for(int i : nums) {
            System.out.println(i);
        }
    }
}
