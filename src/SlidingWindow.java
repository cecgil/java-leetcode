import java.util.HashMap;

public class SlidingWindow {
    

    public static void main(String[] args) {
        
    }

    public int slidingWindow(String str) {
        int l = 0; 
        int r = 0;
        int max = 1;

        HashMap<Character, Integer> hash = new HashMap<>();
        hash.put(str.charAt(0), 1);

        while(r < str.length() - 1) {
            r += 1;

            if(hash.containsKey(str.charAt(r))) {
                hash.put(str.charAt(r), hash.get(str.charAt(r)) + 1);
            } else {
                hash.put(str.charAt(r), 1);
            }

            while(hash.get(str.charAt(r)) == 3) {
                hash.put(str.charAt(l), hash.get(str.charAt(l)) - 1);
                l += 1;
            }
        }

         max = Math.max(max, r - l + 1);

         return max;
    }
}
