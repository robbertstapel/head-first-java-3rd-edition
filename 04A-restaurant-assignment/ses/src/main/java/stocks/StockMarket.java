package stocks;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class StockMarket {
    // publishes events
    private List<Stock> stocks;
}
