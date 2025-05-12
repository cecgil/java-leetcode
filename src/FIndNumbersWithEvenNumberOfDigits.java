public class FIndNumbersWithEvenNumberOfDigits {
    

    public static void main(String[] args) {
        findNumbers(new int[]{12,345,2,6,7896});
    }

    public static int findNumbers(int[] nums) {

        int count = 0;

        for(int i = 0; i < nums.length; i++) {
            int aux = 0;
            int num = nums[i];
            while(num > 0) {
                num = num / 10;
                aux++;
            }

            if(aux % 2 == 0) {
                count++;
            }
            
        }

        
        return count;
    }
}
