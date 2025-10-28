package stocks;

import java.util.ArrayList;
import java.util.List;

// The StockMarket is now Observable - it is an implementation of IObservable
public class StockMarket implements IObservable {
    private final List<IObserver> observers = new ArrayList<>();

    // We override the methods (abstract to concrete)
    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String tickerSymbol, double stockPrice) {
        for (IObserver observer : observers) {
            observer.update(tickerSymbol, stockPrice);
        }
    }

    // Simulate stock price changes
    public void updateStockPrice(String tickerSymbol, double stockPrice) {
        notifyObservers(tickerSymbol, stockPrice);
    }
}
