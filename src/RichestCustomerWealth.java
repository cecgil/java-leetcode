public class RichestCustomerWealth {

    public static void main(String[] args) {
                int[][] matriz = {
            {1, 5},
            {7, 3},
            {3, 5}
        };
        maximumWealth(matriz);
    }
    

    public static int maximumWealth(int[][] matriz) {

        int sum = 0;
        int res = 0;

         for (int i = 0; i < matriz.length; i++) {
                sum = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sum += matriz[i][j]; 
            }
            if(sum > res) {
                res = sum;
            }
        }

        return res;
    }
}
