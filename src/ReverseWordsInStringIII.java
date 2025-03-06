public class ReverseWordsInStringIII {

    public static void main(String[] args) {
        ReverseWordsInStringIII rwis = new ReverseWordsInStringIII();
        rwis.reverseWords("Let's take LeetCode contest");
    }

    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int l = 0, r = 0;
        int n = s.length();

        while (r < n) {
            if(s.charAt(r) != ' ') {
                r++;
            } else {
                sb.append(new StringBuilder(s.substring(l, r)).reverse()).append(" ");
                r++;
                l = r;
            }
        }

        sb.append(new StringBuilder(s.substring(l, r)).reverse());

        return sb.toString();

    }
}
