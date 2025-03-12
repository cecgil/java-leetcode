import java.util.HashMap;
import java.util.HashSet;

public class IsometricStrings {
    

    public static void main(String[] args) {
        isIsomorphic("egg", "add");
    }

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> indexS = new HashMap<>();
        HashMap<Character, Integer> indexT = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            if(!indexS.containsKey(s.charAt(i))) {
                indexS.put(s.charAt(i), i);
            }

            if(!indexT.containsKey(t.charAt(i))) {
                indexT.put(s.charAt(i), i);
            }

            if(!indexS.get(s.charAt(i)).equals(indexT.get(t.charAt(i)))) {
                return false;
            }
        }

        return true;
        
    }
}
