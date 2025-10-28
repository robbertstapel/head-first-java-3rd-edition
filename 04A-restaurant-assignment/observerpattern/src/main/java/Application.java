import stocks.StockInvestor;
import stocks.StockMarket;

public class Application {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        StockInvestor nancy = new StockInvestor("Nancy");
        StockInvestor warren = new StockInvestor("Warren");

        stockMarket.registerObserver(nancy);
        stockMarket.registerObserver(warren);

        stockMarket.updateStockPrice("NVDA", 182.50);
        stockMarket.updateStockPrice("LOGI", 108);

        stockMarket.removeObserver(nancy);

        stockMarket.updateStockPrice("AMD", 235.88);

        // StockMarket Implementation (stockMarket) has a method setStockPrice;
        // updateStockPrice triggers notifyObservers(tickerSymbol, stockPrice);
    }
}
