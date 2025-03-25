public class BestTimeSellAndBuy {

    public static void main(String[] args) {
        maxProfit(new int[]{7,1,5,3,6,4});
    }

    public static int maxProfit(int[] prices) {

        int buy = prices[0];
        int venda = 0;

        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < buy) {
                buy = prices[i];
            } else if(venda < prices[i] - buy){
                venda = prices[i] - buy;
            }
        }

        return venda;

    }
    
}
