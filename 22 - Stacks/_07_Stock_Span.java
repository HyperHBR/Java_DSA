import java.util.Stack;

public class _07_Stock_Span {
    public static void StockSpanSolver(int Stocks[],int Span[]){
        Stack<Integer> s = new Stack<>();

        s.push(0);
        Span[0] = 1;

        for(int i=1;i<Stocks.length;i++){
            int CurrStockPrice = Stocks[i];

            while(!s.isEmpty() && CurrStockPrice>=Stocks[s.peek()]){
                s.pop();
            }

            if(s.isEmpty()){
                Span[i] = i+1;
            }
            else{
                Span[i] = i-s.peek();
            }

            s.push(i);
        }
    }
    public static void main(String[] args) {
        int Stocks[] = {100,80,60,70,60,85,100};
        int Span[] = new int[Stocks.length];

        StockSpanSolver(Stocks,Span);

        for(int i=0;i<Span.length;i++){
            System.out.println(Span[i]);
        }

    }
}
