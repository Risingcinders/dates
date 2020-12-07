package com.anderson.routing.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(Model model) {
    	model.addAttribute("dojoName","Burbank");
        return "index.jsp";
    }
    
    @RequestMapping("/date")
    public String datepage(Model model) {
    	Date peanut = new Date();
    	Calendar mCalendar = Calendar.getInstance();
    	model.addAttribute("day", new SimpleDateFormat("EEEE").format(mCalendar.getTime()));
    	model.addAttribute("daynum", peanut.getDate());
    	model.addAttribute("month", new SimpleDateFormat("MMMM").format(mCalendar.getTime()));
    	model.addAttribute("year", new SimpleDateFormat("yyyy").format(mCalendar.getTime()));
    	return "date.jsp";
    }
    
    @RequestMapping("/time")
    public String timepage(Model model) {
    	Calendar pCalendar = Calendar.getInstance();
    	model.addAttribute("hour", new SimpleDateFormat("h").format(pCalendar.getTime()));
    	model.addAttribute("minute", new SimpleDateFormat("m").format(pCalendar.getTime()));
    	model.addAttribute("half", new SimpleDateFormat("a").format(pCalendar.getTime()));
    	return "time.jsp";
    }
}


