import java.util.HashMap;
import java.util.Map;

public class OneWay {

    public static void main(String[] args) {
        OneWay ow = new OneWay();
        boolean res = ow.oneWaySolution("pales", "bake");
        System.out.println(res);
    }


    boolean oneWaySolution(String str, String str2) {

        
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), i);
        }

        for(int j = 0; j < str2.length(); j++) {
            System.out.println(str2.charAt(j));
            if(!map.containsKey(str2.charAt(j))) {
                System.out.println("ENTREI");
                count++;
            }
        }
        System.out.println(count);


        return count > 3 ? false : true;

    }
    
}
