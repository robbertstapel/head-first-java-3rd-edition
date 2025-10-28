package stocks;

public interface IObservable {
    void registerObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyObservers(String stockSymbol, double stockPrice);
}
