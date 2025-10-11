package org.restaurant.events;

import lombok.Getter;
import lombok.Setter;
import org.restaurant.actors.Customer;

import java.util.EventObject;

@Getter
@Setter
public class ReadyToOrderEvent extends EventObject {

    public ReadyToOrderEvent(Customer eventSource, String eventData){
        super(eventSource);
        System.out.println("event source: " + eventSource + " event data: " + eventData);
    }

}
