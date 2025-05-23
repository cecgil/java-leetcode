public class AddBinary {

    public static void main(String[] args) {
        
    }

    public String addBinary(String a, String b) {

        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while(i >= 0 || j >= 0) {
            int sum = carry;
            sum += a.charAt(i) - '0';
            sum += b.charAt(j) - '0';
            sb.append(sum % 2);
            carry = sum / 2;

            i--;
            j--;
        }

        if(carry != 0) sb.append(carry);
        return sb.reverse().toString();
        
    }

    
}
