import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValidAnagram {
    

    public static void main(String[] args) {
        
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if(!map.containsKey(ch) || map.get(ch) == 0) {
                return false;
            }

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        return true;
        

    }
}
