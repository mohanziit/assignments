package com.iit.digitalclock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DigitalClockController {

    @Autowired
    DigitalClockService digitalClockService;
    @RequestMapping("/index")
    @ResponseBody
    public String showIndex(){
        return "Welcome to IIT API";
    }

    @RequestMapping ("/main")
    public String getCurrentTime(Model model){
        model.addAttribute("currentTime",digitalClockService.getTime());
        return "clock/home";
    }


}
