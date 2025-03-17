import java.util.ArrayList;
import java.util.List;

public class ReachMeandSumMyDigits {

    public static void main(String[] args) {
        Long init = 10l;
        long[] patt = {2l, 1l, 3l};
        int nterm = 15;
        sumDigNthTerm(init, patt, nterm);
    }
        
    public static long sumDigNthTerm(long initval, long[] patternl, int nthterm) {

        List<Long> list = new ArrayList<>();
        list.add(initval);
        int j = 0;
        for(int i = 0; i < nthterm; i++) {
            if (j == patternl.length) { // Corrigindo para rodar ciclicamente dentro do patternl
                j = 0;
            }
            Long res = list.get(i) + patternl[j];
            list.add(res);
            j++;
        }
        
        System.out.println(list.get(nthterm));

        String numeroStr = String.valueOf(list.get(nthterm));
        long res = 0;
        for(char c : numeroStr.toCharArray()) {
            res += Character.getNumericValue(c);
        }
        
        return res;
        
    }
    
}
