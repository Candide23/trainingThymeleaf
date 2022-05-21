package com.example.demo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@Controller
@RequestMapping("events")
public class EventController {

    @GetMapping()
    public String displayAllEvents(Model model){

        HashMap<String, String> events = new HashMap<>();
        events.put("Hour of Code","Getting young minds interested in coding");
        events.put("Strange Loop","Coding conference of professionals sharing ideas");
        events.put("CES","Annual trade show showing awesome new tech");
        model.addAttribute("events",events);
        return "events/index";
    }




}
