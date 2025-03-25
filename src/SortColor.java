public class SortColor {
    

    public static void main(String[] args) {
        
    }

    public void sortColor(int[] nums) {

        int red = 0;
        int white = 0;
        int blue = nums.length - 1;

        while(white <= blue) {
            if(nums[white] == 0) {
                int temp = nums[red];
                nums[red] = nums[white];
                nums[white] = temp;
                red++;
                white++;
            } else if (nums[white] == 1) {
                white++;
            } else {
                int temp = nums[blue];
                nums[blue] = nums[white];
                nums[white] = temp;
                blue--;
            }
        }


    }
}
