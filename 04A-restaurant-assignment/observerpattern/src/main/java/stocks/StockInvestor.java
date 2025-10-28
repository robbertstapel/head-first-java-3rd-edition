package stocks;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class StockInvestor implements IObserver {
    private final String name;

    @Override
    public void update(String stockSymbol, double stockPrice) {
        System.out.println(name + " received an update for " + stockSymbol + ": $" + stockPrice);
    }
}
