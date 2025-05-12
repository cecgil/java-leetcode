import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Finding3DigitEvenNumber {
    
    public static void main(String[] args) {
        
    }

    public static int[] findEvenNumbers(int[] digits) {
        /*
         * Input: digits = [2,1,3,0]
            Output: [102,120,130,132,210,230,302,310,312,320]
            Explanation: All the possible integers that follow the requirements are in the output array. 
            Notice that there are no odd integers or integers with leading zeros.
         */

         HashSet<Integer> set = new HashSet<>();

         for(int i = 0; i < digits.length; i++) {
            for(int j = 0; j < digits.length; j++) {
                for(int k = 0; k < digits.length; k++) {
                    if(i == j || i == k || j == k) continue;
                    int num = (digits[i] * 100) + (digits[j] * 10) + digits[k];
                    if(num % 2 == 0 && digits[i] != 0) {
                        set.add(num);
                    }
                }
            }
            
         }

         ArrayList<Integer> list = new ArrayList<>(set);
         Collections.sort(list);
         int[] result = new int[list.size()];
         for(int i = 0; i < result.length; i++)
         {
            result[i] = list.get(i);
         }

        return result;

    }
}
