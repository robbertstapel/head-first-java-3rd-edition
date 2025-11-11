package com.example.ses.listeners;

import com.example.ses.events.UserCreatedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class UserCreatedListener {

    @EventListener
    public void onUserCreatedEvent(UserCreatedEvent event) {
        System.out.println("Listener: received UserCreatedEvent with payload: " + event.getUser().getName());
    }
}