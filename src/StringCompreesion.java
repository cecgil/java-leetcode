import java.util.HashMap;

public class StringCompreesion {

    public static void main(String[] args) {
        String res =compression("aabcccccaaa");
        System.out.print(res);
    }

    // aabcccccaaa
    // a2blc5a3
    static String compression(String str) {

        if (str == null || str.isEmpty()) {
            return str;
        }

        int count = 1;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {

            if(i + 1 == str.length() || str.charAt(i) != str.charAt(i + 1)) {
                sb.append(str.charAt(i)).append(count);
                count = 1;
            } else {
                count++;
            }
        }   

        return sb.length() < str.length() ? sb.toString() : str;

    }

    
    
}
