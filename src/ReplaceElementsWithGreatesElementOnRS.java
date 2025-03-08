public class ReplaceElementsWithGreatesElementOnRS {

    public static void main(String[] args) {

        ReplaceElementsWithGreatesElementOnRS r = new ReplaceElementsWithGreatesElementOnRS();
        int[] teste ={17,18,5,4,6,1};
        r.replaceElements(teste);
        
    }

    public void replaceElements(int[] arr) {
        int n = arr.length;
        int max = -1;

        for(int i = n - 1; i >= 0; i--) {
            int temp = max;
            
            max = Math.max(max, arr[i]);

            arr[i] = temp;
        }

    }
    
}
