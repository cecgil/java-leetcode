import java.util.ArrayList;
import java.util.List;

public class CanBeTypeNWords {

    public static void main(String[] args) {

        CanBeTypeNWords c = new CanBeTypeNWords();
        c.canBeTypedWords("hello world",  "ad");
        
    }

    public void canBeTypedWords(String text, String brokenLetters) {

        String[] words = text.split(" ");

        List<String> list = new ArrayList<>();

        for(String word : words) {
            list.add(word);
            for(int i = 0; i > brokenLetters.length(); i++) {
                if(list.contains(String.valueOf(brokenLetters.charAt(i)))) {
                    list.remove(word);
                }
           }

        }

    }
    
}
