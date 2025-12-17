package com.tamilselvan.springnotify.service;


import com.tamilselvan.springnotify.dto.EventRequest;
import org.springframework.stereotype.Service;
@Service
public class EventService {
    public void processEvent(EventRequest request) {

        System.out.println("Processing event...");
        System.out.println("Event Type: " + request.getEventType());
        System.out.println("User ID: " + request.getUserId());
        System.out.println("Message: " + request.getMessage());
    }
}
