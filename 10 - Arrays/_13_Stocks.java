//Return Max Profit
//If Only Loss --> Return 0 

public class _13_Stocks {
    public static void BuyStocks(int Prices[]){
        int BuyPrice = Integer.MAX_VALUE;
        int MaxProfit = 0;
        int Profit;

        for(int i=0;i<Prices.length;i++){
            if(Prices[i]>BuyPrice){
                Profit = Prices[i] - BuyPrice;
                MaxProfit = Math.max(MaxProfit,Profit);
            }
            else{
                BuyPrice =Prices[i];
            }
        }

        System.out.println("Max Profit : " + MaxProfit);
    }
    public static void main(String[] args) {
        int Prices[] = {7,1,3,5,6,4};
        BuyStocks(Prices);
    }
}
