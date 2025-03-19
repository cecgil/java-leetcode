public class MergeStringsAlternately {
    

    public static void main(String[] args) {
        mergeAlternately("ab", "pqrs");
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int length = word1.length() >= word2.length() ? word2.length() : word1.length();
        int count = 0;

        for(int i = 0; i < length; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
            count++;
        }

        if(word1.length() > length) {
            sb.append(word1.substring(count));
        } else {
            sb.append(word2.substring(count));
        }

        return sb.toString();

        
    }

}
