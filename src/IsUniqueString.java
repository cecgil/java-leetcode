import java.util.HashSet;
import java.util.Set;

public class IsUniqueString {

    public static void main(String[] args) {
        IsUniqueString ius = new IsUniqueString();
        ius.isUnique("adorador");
    }

    void isUnique(String str) {
        Set<Character> a = new HashSet<>();

        for(int i = 0; i < str.length(); i++) {
            if(a.contains(str.charAt(i))) {
                System.out.println("Caracteres não são unicos");
                return;
            }

            a.add(str.charAt(i));
        }

        System.out.println("É unico");
    }
    
}
