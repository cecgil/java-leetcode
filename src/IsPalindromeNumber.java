public class IsPalindromeNumber {

    public static void main(String[] args) {
        IsPalindromeNumber ip = new IsPalindromeNumber();

        ip.isPalindrome(10);
    }
    
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
        return false;
        }

        int copy = x;
        int reversed = 0;

        while(copy > 0) {
            int digit = copy % 10;
            reversed = reversed * 10 + digit;
            copy /= 10;
        }

        return reversed == x;

        
    }
}


