public class KthMissingPositiveNumber {
    

    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        findKthPositive(arr, k);
    }

    public static void findKthPositive(int[] arr, int k) {

        for(int i : arr){
            System.out.println("ESSE É O i AGORA: " + i);
            if(i <= k) {
                System.out.println("ESSE É O K: " + k);
                k++;
                System.out.println("ESSE É O K DEPOIS DO INCREMENTO: " + k);
            }
             else {
                break;
            }
        }
            
        

    }


}
