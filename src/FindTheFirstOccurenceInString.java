public class FindTheFirstOccurenceInString {
    public static void main(String[] args) {
        int res = strStr("sadbutsad", "sad");

        System.out.println(res);
    }

    public static int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();

        if(n > m) {
            return -1;
        }

        for(int i = 0; i < m - n; i++) {
            if(haystack.substring(i, i + n).equals(needle)) {
                return i;
            }
        }

        return -1;

    }
}
