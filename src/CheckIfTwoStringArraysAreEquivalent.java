public class CheckIfTwoStringArraysAreEquivalent {

    public static void main(String[] args) {
        CheckIfTwoStringArraysAreEquivalent ad = new CheckIfTwoStringArraysAreEquivalent();
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};

        boolean teste = ad.arrayStringsAreEqual(word1, word2);

        System.out.println(teste);
    }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(String a : word1) {
            sb.append(a);
        }

        for(String b : word2) {
            sb2.append(b);
        }

        return sb.toString().equals(sb2.toString());
        
    }
    
}
