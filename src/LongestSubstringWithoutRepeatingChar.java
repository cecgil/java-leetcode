import java.util.HashMap;

public class LongestSubstringWithoutRepeatingChar {
    
    public static void main(String[] args) {
        lengthOfLongestSubstring(
            "abcabcbb"
        );        

    }

    public static int lengthOfLongestSubstring(String s) {
    
        int l = 0;
        int r = 0;
        int max = 1;
        HashMap<Character, Integer> hash = new HashMap<>();
        for(r = 0; r < s.length(); r++) {
            while(hash.containsKey(s.charAt(r))) {
                hash.remove(s.charAt(l));
                l+=1;
            }
            
            hash.put(s.charAt(r), r);
            max = Integer.max(max, r - l + 1);

        }
        
        return max;
    }

}
