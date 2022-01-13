package com.example.wether.controller;

import com.example.wether.service.WetherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WetherController {
    @Autowired
   private final WetherService wetherService;

    public WetherController(WetherService wetherService) {
        this.wetherService = wetherService;
    }

    @GetMapping("/")
    public String getCurrentWeather(Model model){
   try {
        // System.out.println(wetherService.getCurrentWeather("Kathmandu","Nepal"));
        model.addAttribute("currentWeather", wetherService.getCurrentWeather("kathmandu", "Nepal"));
    }
    catch (Exception e){
        System.out.println("error");
    }
        return "wether";
    }
}
