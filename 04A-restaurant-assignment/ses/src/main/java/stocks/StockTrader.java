package stocks;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StockTrader {

    @EventListener
    public void onStockChangedEvent(StockChangedEvent event) {
        System.out.println("Listener: received StockChangedEvent with payload: " + event.getStock().getName() + " " + event.getStock().getPrice());
    }
}