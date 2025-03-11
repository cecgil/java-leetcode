public class Maximum69Number {
    public static void main(String[] args) {
        

    }


    public int maximum69Number (int num) {
        int length = String.valueOf(num).length();
        int index = 0;
        int[] digits = new int[length];


        for (int i = length - 1; i >= 0; i--) {
            digits[i] = num % 10;
            if(digits[i] == 6) {
                index = i;
            }
            num /= 10;
        }

        digits[index] = 9;

        for (int digit : digits) {
            num = num * 10 + digit;
        }

        return num;

        
    }
}
