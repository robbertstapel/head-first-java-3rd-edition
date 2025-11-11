package com.example.ses.events;

import com.example.ses.domain.User;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class UserCreatedEvent extends ApplicationEvent {
    private final User user;
    // classic = (Object source, User user) = tight coupled to the source of the event
    // modern (payload centric) = (User user) = event carried state transfer, decoupled
    public UserCreatedEvent(User user) {
        super(user); // The user object can be the source (payload) of the event
        this.user = user;
        System.out.println("Event: UserCreatedEvent created with payload: " + user.getName());
    }

}