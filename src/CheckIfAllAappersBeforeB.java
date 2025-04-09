public class CheckIfAllAappersBeforeB {
    

    public static void main(String[] args) {
        checkString("aaabbb");
    }

    public static boolean checkString(String s) {

        int index = Integer.MAX_VALUE;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'b') {
                index = i;
            }
            if(i > index && s.charAt(i) == 'a') {
                return false;
            }
        }

        return true;

    }
}
