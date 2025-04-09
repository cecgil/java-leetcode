public class ReverseDegreeString {
    public static void main(String[] args) {
        reverseDegree("abc");
    }

    public static int reverseDegree(String s) {
        int res = 0;
        int index = 1;

        for(int i = 0; i < s.length(); i++) {
            char letra = s.charAt(i);
            int inversao = 'z' - letra + 1;
            res += inversao * index;
            index++;
        }
    
        return res;
    }
}
