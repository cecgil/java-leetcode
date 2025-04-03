import java.util.ArrayList;
import java.util.List;

public class FindThePeaks {
    

    public static void main(String[] args) {
        findPeaks(new int[]{1,4,3,8,5});
    }

    public static List<Integer> findPeaks(int[] mountain) {
        
        List<Integer> haha = new ArrayList<>();

        for(int i = 1; i < mountain.length - 1; i++) {
            if(mountain[i] >  mountain[i - 1] && mountain[i] > mountain[i + 1]) {
                haha.add(i);
            }
        }
        return haha;
    }
}
