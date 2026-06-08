public class FindTheDifference {
    
    public static void main(String[] args) {

        FindTheDifference f = new FindTheDifference();
        f.findTheDifference("abcd", "abcde");
        
    }

    public char findTheDifference(String s, String t) {
        if (s.isEmpty()) {
            return t.charAt(0);
        }
        char a = s.charAt(0);
        char b = t.charAt(0);

        for(int i = 1; i < s.length(); i++) {
            a ^= s.charAt(i);
        }
        for(int i = 1; i < t.length(); i++) {
            b ^= t.charAt(i);
        }  

        return (char) (a ^ b);
    }
}

//FUCK COPILOT GIVE ME THE ANSWER