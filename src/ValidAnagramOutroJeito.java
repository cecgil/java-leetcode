import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ValidAnagramOutroJeito {
    

    public static void main(String[] args) {
        boolean res1 = isAnagram("anagram", "nagaram");
        //boolean res2 = isAnagram("rat", "car");
    }

    public static boolean isAnagram(String s, String t) {
        
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> count = new HashMap<>();

        for (char x : s.toCharArray()) {
            count.put(x, count.getOrDefault(x, 0) + 1);
        }

        for(char z : t.toCharArray()){
            count.put(z, count.getOrDefault(z, 0) - 1);
        }


        for(int a : count.values()) {
            if(a < 0) {
                return false;
            }
        }
        
        return true;

    }
}
