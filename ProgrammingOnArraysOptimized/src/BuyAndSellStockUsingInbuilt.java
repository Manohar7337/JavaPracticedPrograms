//leetcode 121.
class BuyAndSellStock{
	
		   public static int maxProfit(int[] prices) {
		    int maxPro=0;
		    int minPrice=Integer.MAX_VALUE;
		    for(int i=0;i<prices.length;i++){
		    	//to find min element in array
		        minPrice=Math.min(prices[i],minPrice);
		        //to find max profit
		        maxPro=Math.max(maxPro,prices[i]-minPrice);
		    }
		return maxPro;
		
		}
}
public class BuyAndSellStockUsingInbuilt {

	public static void main(String[] args) {
		int prices[]= {7,1,5,3,6,4};
	int result=	BuyAndSellStock.maxProfit(prices);
	System.out.println(result);
	}

}
