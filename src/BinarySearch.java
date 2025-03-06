public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        bs.binarySearch(nums, 3);
    }

    public int binarySearch(int[] nums, int n) {

        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int mid = (left+right) / 2;
            if(nums[mid] == n) {
                System.out.println(mid);
                return mid;
            }
            else if (nums[mid] < n) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return -1;



    }
}
