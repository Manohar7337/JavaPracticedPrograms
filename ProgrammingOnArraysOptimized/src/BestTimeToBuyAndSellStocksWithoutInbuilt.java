class BuyAndSell{
public static int maxProfit(int[] prices) {
        int buy=prices[0];
        int buyday=0;
        int sell=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];
                buyday=i;
            }
        }
        if(prices[prices.length-1]==buy){
            return 0;
        }else{
            sell=prices[buyday+1];
            for(int i=buyday+1;i<prices.length;i++){
                if(prices[i]>sell){
                    sell=prices[i];
                }
            }
        }
        return sell-buy;
    }
}
public class BestTimeToBuyAndSellStocksWithoutInbuilt {

	public static void main(String[] args) {
		int prices[]= {7,1,5,3,6,4};
		int result=BuyAndSell.maxProfit(prices);
		System.out.println(result);

	}

}
