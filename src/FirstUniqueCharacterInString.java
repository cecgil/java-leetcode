import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInString {

    public static void main(String[] args) {
        
    }
    
    public int firstUniqChar(String s) {

        Map<Character, int[]> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            if(!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), new int[]{i, 1});
            } else {
                map.get(s.charAt(i))[1] += 1;
            }
        }

        for(int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i))[1] ==  1) {
                return map.get(s.charAt(i))[0];
            } 
        }

        return -1;
        
    }

}
