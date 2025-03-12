public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
    }


//nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int rigthM = m - 1;
        int rigthN = n - 1;
        int rigth = m + n - 1;

        while (rigthN >= 0) {
            if(rigthM >= 0 && nums1[rigthM] > nums2[rigthN]) {
                nums1[rigth] = nums1[rigthM];
                rigthM--;
            } else {
                nums1[rigth] = nums2[rigthN];
                rigthN--;
            }
            rigth--;
        }



    }
}
