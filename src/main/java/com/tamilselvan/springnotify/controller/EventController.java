package com.tamilselvan.springnotify.controller;

import com.tamilselvan.springnotify.dto.EventRequest;
import com.tamilselvan.springnotify.service.EventService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/events")
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @PostMapping
    public String publishEvent(@RequestBody EventRequest request) {

        eventService.processEvent(request);

        return "EVENT_RECEIVED";
    }
}
