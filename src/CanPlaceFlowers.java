public class CanPlaceFlowers {

    public static void main(String[] args) {
        canPlaceFlowers(new int[]{1,0,0,0,1}, 2);
    }

    public static void canPlaceFlowers(int[] flowerbed, int n) {
        
        for(int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i] == 1) {
                i+=n;
            } else if (flowerbed[i] == 0 && flowerbed[i + n] == 0) {
                System.out.println("TRUE");
            }
        }

        System.out.println("FALSE");

    }
    
}
