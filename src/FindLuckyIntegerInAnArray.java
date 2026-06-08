import java.util.HashMap;

public class FindLuckyIntegerInAnArray {
    
    public static void main(String[] args) {
        findLucky(new int[]{2,2,3,4});
    }

    //arr = [2,2,3,4]

    public static void findLucky(int[] arr) {
        int index = 0;
        int x = 1, y = 0;
        int count = 0;
        
        while(index < arr.length) {
            if(arr[index] == arr[x]) {
                count++;
            }


        }
        
    }


}
