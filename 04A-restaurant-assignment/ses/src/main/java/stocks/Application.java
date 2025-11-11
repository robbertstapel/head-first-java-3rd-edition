package stocks;

import com.example.ses.domain.User;
import com.example.ses.events.UserCreatedEvent;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationEventPublisher;

@AllArgsConstructor
@SpringBootApplication
public class Application implements CommandLineRunner {
    // we need this to dispatch an event
    private final ApplicationEventPublisher publisher;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception {
//        User user = new User("Robbert");
//        System.out.println("Publisher: Publishing event: UserCreatedEvent with payload: " + user.getName());
//        System.out.println("This creates the Event which on it's turn triggers the listener");
//        System.out.println("-------------------------------");
//        publisher.publishEvent(new UserCreatedEvent(user));
//    }

    @Override
    public void run(String... args) throws Exception {
        Stock stock = new Stock("AMD", "180");
        publisher.publishEvent(new StockChangedEvent(stock));

        Stock stock2 = new Stock("TSLA", "380");
        publisher.publishEvent(new StockChangedEvent(stock2));
//        System.out.println("Publisher: Publishing event: StockChangedEvent with payload: " + stock.getName() + " " + stock.getPrice());
    }

}