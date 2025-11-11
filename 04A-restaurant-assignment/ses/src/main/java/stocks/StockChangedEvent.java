package stocks;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class StockChangedEvent extends ApplicationEvent {
    private final Stock stock;

    public StockChangedEvent(Stock stock) {
        super(stock);
        this.stock = stock;
        System.out.println("Event: StockChangedEvent created with payload: " + stock.getName() + " " + stock.getPrice());
    }

}
