public class InsertSort {

    public static void main(String[] args) {
        insertSort(new int[]{31, 41, 59, 26, 41,58});
    } 

    public static void insertSort(int[] nums) {
        
        for(int j = 1; j < nums.length; j++) {
            int chave = nums[j];
            int i = j - 1;
            while( i >= 0 && nums[i] > chave) {
                nums[i + 1] = nums[i];
                i  = i - 1;
            }

            nums[i + 1] = chave;
        }

        for(int n : nums) {
            System.out.println(n);
        }
    }
    
}
